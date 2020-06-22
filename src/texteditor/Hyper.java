package texteditor;



	import java.util.Scanner;

	public class Hyper {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Hello! My name is Aid.");
	        System.out.println("I was created in 2018.");
	        System.out.println("Please, remind me your name.");

	        // reading a name

	        System.out.println("What a great name you have, " + scanner.next() + "!"  );
	        System.out.println("Let me guess your age.");
	        
	        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
	        int age = scanner.nextInt();
	        int five = age %5;
	        int three = age %3;
	        int seven = age %7;
	        System.out.print(three +" ");
	        System.out.print(five + " ");
	        System.out.print(seven);
	        
	        // reading all remainders

	        System.out.println("Your age is " + age + " that's a good time to start programming!");
	    }
	}



