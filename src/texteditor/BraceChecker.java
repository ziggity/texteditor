package texteditor;

public class BraceChecker {
	public static void main(String[] args) {
 String braces = "(){}[]";
 isValid(braces); // true

		 

		}
	 static boolean isValid(String braces) {
		    //store array of complete paraenthes check length if its same as string len return true - for loop through string deleting pairs as you go (matching pairs)
		    String[] result;
		    String[] brace = braces.split("");
    		System.out.println(brace);

		    for(int i = 0; i < brace.length; i++) {
		    	for(int j = 1; j<brace.length; j++) {
		    		if(brace[i] == "(") {
		    			searcher(brace);
		    		}
		    		System.out.println(brace[i]);
		    	}
		    }
			return false;
		    


		}
	 static void searcher(String[] brace) {
		 
	 }

}