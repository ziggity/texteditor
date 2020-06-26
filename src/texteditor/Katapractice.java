

package texteditor;
import java.util.ArrayList;


public class Katapractice {
	/*Description:
	Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

	Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a test") => returns "This is a test" spinWords( "This is another test" )=> returns "This is rehtona test"
	*/
	public static void main(String[] args) {
		System.out.print(spinWords("Just kidding there is still one more"));
		   String str = "()";
	        System.out.println(isValid(str));
	        str = "[(])";
	        System.out.println(isValid(str));
	}
//	  public static String spinWords(String sentence) {
//	    String[] words = sentence.split(" ");
//	    for (int i=0; i<words.length; i++) {
//	      if (words[i].length() >= 5) {
//	        words[i] = new StringBuilder(words[i]).reverse().toString();
//	      }
//	    }
//	    return String.join(" ",words);
//	  }
	public class ValidBraces {
	    /*Write a function that takes a string of braces, and determines if the order of the braces is valid.
	    It should return true if the string is valid, and false if it's invalid.
	    This Kata is similar to the Valid Parentheses Kata, but introduces new characters:
	    brackets [], and curly braces {}.
	    Thanks to @arnedag for the idea!
	    All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
	    * */
	    public static boolean isValid(String str) {
	        ArrayList<String> parans = new ArrayList<>();
	        ArrayList<String> brackets = new ArrayList<>();
	        ArrayList<String> curlies = new ArrayList<>();
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == '(' || str.charAt(i) == ')') parans.add(Character.toString(str.charAt(i)));
	            if (str.charAt(i) == '[' || str.charAt(i) == ']') brackets.add(Character.toString(str.charAt(i)));
	            if (str.charAt(i) == '{' || str.charAt(i) == '}') curlies.add(Character.toString(str.charAt(i)));
	        }
	        boolean paransValid = areTheseBracesValid(parans);
	        boolean bracketsValid = areTheseBracesValid(brackets);
	        boolean curliesValid = areTheseBracesValid(curlies);
	        boolean balanced = paransValid && bracketsValid && curliesValid;
	        boolean unmixed = isStringUnmixed(str);
	        boolean balancedAndUnmixed = balanced && unmixed;
	        return balancedAndUnmixed;
	    }
	    public enum Braces {
	        RIGHT_PARANS,
	        LEFT_PARANS,
	        RIGHT_BRACKETS,
	        LEFT_BRACKETS,
	        RIGHT_CURLIES,
	        LEFT_CURLIES;
	    }
	    public static boolean isStringUnmixed(String str) {
	        for (int i = 1; i < str.length(); i++) {
	            Braces oldBrace = getBrace(str.charAt(i - 1));
	            Braces newBrace = getBrace(str.charAt(i));
	            if (!oldBrace.equals(newBrace)) {
	                if (oldBrace.equals(Braces.RIGHT_BRACKETS)) {
	                    if (newBrace.equals(Braces.LEFT_CURLIES)
	                            || newBrace.equals(Braces.LEFT_PARANS)) {
	                        return false;
	                    }
	                } else if (oldBrace.equals(Braces.RIGHT_CURLIES)) {
	                    if (newBrace.equals(Braces.LEFT_PARANS)
	                            || newBrace.equals(Braces.LEFT_BRACKETS)) {
	                        return false;
	                    }
	                } else if (oldBrace.equals(Braces.RIGHT_PARANS)){
	                    if(newBrace.equals(Braces.LEFT_BRACKETS)
	                            || newBrace.equals(Braces.LEFT_CURLIES)){
	                        return false;
	                    }
	                }
	            }
	        }
	        return true;
	    }
	    private static Braces getBrace(char currentChar) {
	        Braces currentBrace = null;
	        if (currentChar == '[') currentBrace = Braces.RIGHT_BRACKETS;
	        else if (currentChar == ']') currentBrace = Braces.LEFT_BRACKETS;
	        else if (currentChar == '{') currentBrace = Braces.RIGHT_CURLIES;
	        else if (currentChar == '}') currentBrace = Braces.LEFT_CURLIES;
	        else if (currentChar == '(') currentBrace = Braces.RIGHT_PARANS;
	        else if (currentChar == ')') currentBrace = Braces.LEFT_PARANS;
	        return currentBrace;
	    }
	    public static boolean areTheseBracesValid(ArrayList<String> list) {
	        boolean opensRight = true;
	        int numOpenRight = 0;
	        int numOpenLeft = 0;
	        for (int i = 0; i < list.size(); i++) {
	            if (list.get(i).equals("[") || list.get(i).equals("(") || list.get(i).equals("{")) opensRight = true;
	            else opensRight = false;
	            if (opensRight) numOpenRight++;
	            else numOpenLeft++;
	            if (numOpenLeft > numOpenRight) return false;
	        }
	        if (numOpenRight != numOpenLeft) return false;
	        return true;
	    }
	   
	}
	
}
