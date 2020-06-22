package texteditor;
import java.util.Scanner;

public class TeamMenuApp {
	static Scanner s = new Scanner(System.in);
	static int addingIndex = 0;

	public static void main(String[] args) {
		/* - add team member, view team member, view all team members, delete team member by position, delete all team members
		*/
		System.out.print(concatFullName("zach", "be"));
		System.out.print(baseRaisedByPowerExp(3,4));
		System.out.print(concatSelf("zach",5));
		String[] team =  new String[5];
		int decision = 0;
		
		while(decision != -1) {
			int[] test = {1,5,3,2,1};
			System.out.print("test" + test[4]);
			showMenu();
			decision = s.nextInt();
			if (decision < -1 || decision > 5) {
				System.out.println("please pick valid option");
			} else if (decision == 1){
				showTeam(team);
			} else if(decision == 2){
				showTeamMember(team);
			} else if(decision == 3){
				addTeamMember(team);
			}else if(decision == 4){
				deleteTeamMember(team);
			}else {
				deleteAllTeamMember(team);
			}
			}
	
	}
	public static String concatFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		  return fullName;
		}
	//Write a method that takes two strings, firstName and lastName, and returns a full name (the firstName concatenated with the lastName and a 
	//space in the middle).

//For example, if I pass in "Tom" and "Sawyer" the method should return "Tom Sawyer".
	
	public static int baseRaisedByPowerExp(int base, int exponent) {
		int baseRaised = (int) Math.pow(base, exponent);
		  return baseRaised;
		}
//Write a method that takes two ints, base and exponent, return base raised to the power of exponent.

//For example, if I pass in 3 and 4 the method should return 81 (3 to the 4th power).
	public static String concatSelf(String x, int n) {
		String result = "";
		while(n>0) {
			result += x;
			n--;
		}
		  return result;
		}
//Write a method that takes a String and an int. The method should return a String concatenated to itself the number of times of the int parameter. 
//For example, if I pass in "Hello" and 3 the method should return "HelloHelloHello".
					
	private static void deleteAllTeamMember(String[] team) {
		for(String member : team) {
			member = null;
		}
	}

	private static void deleteTeamMember(String[] team) {
		System.out.print("Which team member wish to delete? ");
		int memberToDelete = s.nextInt();
		if(validateInput(memberToDelete)) {
			team[memberToDelete] = null;
		}
	}

	private static void addTeamMember(String[] team) {
		System.out.print("Enter name of new team member ");
		String newMember = s.next();
		if(validateInput(addingIndex)) {
			team[addingIndex++] = newMember;

		}

	}
	public static boolean validateInput(int input) {
		if(input >= 0 && input <5) {
			return true;
	} else {
		System.out.println("invalid entry");
		return false;	
	}
	}

	private static void showTeamMember(String[] team) {
		System.out.print("Which team member would you like to see?");
		int teamNumber = s.nextInt();
		
		if(validateInput(teamNumber)) {
		System.out.println("team: " + teamNumber);
		}
	}

	private static void showTeam(String[] team) {
		System.out.println("team: ");
		for(int i = 0; i < team.length; i++) {
			System.out.println(team[i]);
		}
		
	}

	public static void showMenu() {
		System.out.println("please pick option or enter -1 to exit");
		System.out.println("1 show team");
		System.out.println("2 show team member");
		System.out.println("3 add team member");
		System.out.println("4 delete team member");
		System.out.println("5 delete all team member");
		
	}

}
