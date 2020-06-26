package texteditor;
import java.util.Scanner;
public class numbersLessThan {
	

	public static void main(String[] args) {
	    Scanner scanner =  new Scanner(System.in);
	    int n = scanner.nextInt();
	    int perfect = 0;
	    int smaller = 0;
	    int larger = 0;
	    if(scanner.hasNextInt()) {
	    for (int i = 0; i <= n ; ++i) {

	        int part = scanner.nextInt();
	        if (part == 0) {
	            perfect++;
	        } else if (part == -1) {
	            smaller++;
	        } else if (part == 1) {
	            larger++;
	        }
	    }
	    System.out.print(perfect + " " + larger + " " + smaller);

	    }
	}
	
}