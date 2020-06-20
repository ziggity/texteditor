package texteditor;
import java.util.Scanner;

public class TeamMenuApp {
	static Scanner s = new Scanner(System.in);
	static int addingIndex = 0;

	public static void main(String[] args) {
		/* - add team member, view team member, view all team members, delete team member by position, delete all team members
		*/
		String[] team =  new String[5];
		int decision = 0;
		while(decision != -1) {
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
