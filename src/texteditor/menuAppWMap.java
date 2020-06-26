package texteditor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class menuAppWMap {

	static Scanner scanner = new Scanner(System.in);
	static Map<String, String> phoneBook = new HashMap<String, String>();
	
	public static void main(String[] args) {
		int choice = 0;
		
		while(choice != 4) {
			printMenu();
			choice = getUserChoice();
			
			if(choice == 1) {
				displayPhoneBook();
			} else if( choice == 2) {
				addContact();
			}else if( choice == 3) {
				deleteContact();
			}else if( choice == 4) {
				System.out.println("Goodbye");
			} else {
				System.out.print("please enter valid entry");
			}
		}
		}

	private static void deleteContact() {
		System.out.println("enter phone num to delete: ");
		String phoneNumber = scanner.next();
		System.out.println("Removed " + phoneNumber + ": " + phoneBook.remove(phoneNumber));
	}

	private static void addContact() {
		System.out.print("enter phone Number to add: ");	 
		String phoneNumber = scanner.next();
		System.out.print("enter name: ");
		String name = scanner.next();
		phoneBook.put(phoneNumber, name);
		System.out.println("added " + phoneNumber + ": "  + name);
	}

	private static void printMenu() {
		System.out.println("1) print contact names");
		System.out.println("2) add new contact");
		System.out.println("3) delete contact at position");
		System.out.println("4) exit");		
	}

	private static int getUserChoice() {
		return scanner.nextInt();
	}

	private static void displayPhoneBook() {
		Set<String> phoneNumbers = phoneBook.keySet();
		for(String phoneNumber : phoneNumbers) {
			System.out.println(phoneNumber + ": " + phoneBook.get(phoneNumber));
		}
	}
	}

