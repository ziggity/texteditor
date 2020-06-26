package texteditor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menuappwList {
	
	static Scanner scanner = new Scanner(System.in);
	static List<String> students = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		int choice = 0;
		
		while(choice != -1) {
			
			showMenu();
			
			choice = getUserChoice();
			
			if(choice == 1) {
				printStudentNames();
			} else if( choice == 2) {
				addNewStudent();
			}else if( choice == 3) {
				deleteStudent();
			}else if( choice == 4) {
				System.out.println("Goodbye");
			} else {
				System.out.print("please enter valid entry");
			}
		}
	}
	private static void deleteStudent() {
		System.out.print("enter index of student to delete");
		int index = getUserChoice();
		if(index< students.size()) {
			students.remove(index);
}

	}
	private static void showMenu() {
		System.out.println("1) print student names");
		System.out.println("2) add new student");
		System.out.println("3) delete student at position");
		System.out.println("4) exit");

	}
	private static void printStudentNames() {
		for(String student : students) {
			System.out.print(students.size());
			System.out.println(student);
}		
	}
	private static void addNewStudent() {
		System.out.print("enter new student name");
		students.add(scanner.next());
	}
	private static int getUserChoice() {
		return scanner.nextInt();
	}
}
