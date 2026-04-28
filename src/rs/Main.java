package rs;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[]args) {
		
		try {
			System.out.println("---Restaurant System---");
			System.out.println("1.Manage Reservations");
			System.out.println("2.Manage Food Orders");
			System.out.println("3.Manage Menu Categories");
			System.out.println("4.Manage Available Seats");
			System.out.println("5.Manage Billing Records");
			System.out.println("6.Exit");
			int choice = getPositiveInteger("Enter choice: ", 1, 6);
			
			while(true) {
				switch(choice) 
				{
				case 1: reservation();
				break;
				case 2: foodOrder();
				break;
				case 3: menuCategories();
				break;
				case 4: availSeats();
				break;
				case 5: billing();
				break;
				case 6: System.out.println("Exiting program..");
				break;
				}
			}
			
		}catch(InputMismatchException ime) {
			System.out.println("Invalid Input! ");
		}
		
		
	}
	public static void reservation() {
		System.out.println();
		System.out.println("1. Add Reservation");
		System.out.println("2. View Reservation");
		System.out.println("3. Remove Reservation");
		System.out.println("4. Search Reservation");
		System.out.println("5. Back to Main Menu");
		int choice = getPositiveInteger("Enter choice: ", 1, 5);
		
	}
	
	public static void foodOrder() {
		System.out.println("1. Add Food Order");
		System.out.println("2. Serve Food Order");
		System.out.println("3. View Pending Order");
		System.out.println("4. Back to main menu");

	}
	
	public static void menuCategories() {
		System.out.println("1. Add Category");
		System.out.println("2. View Category");
		System.out.println("3. Back to Main Menu");
	}
	public static void availSeats() {
		System.out.println("1. Add Table Numbers");
		System.out.println("2. Remove Occupied Table");
		System.out.println("3. View available Tables");
		System.out.println("4. Back to main menu");

	}
	public static void billing() {
		System.out.println("1. Add billing record");
		System.out.println("2. View Billing Record");
		System.out.println("3. Search bill by customer");
		System.out.println("4. Back to main menu");
	}
	
	public static int getPositiveInteger(String prompt, int min, int max) {
		while(true) {
			try {
				System.out.print(prompt);
				int input = sc.nextInt();
				sc.nextLine();
				
				if(input < min || input > max) {
					System.err.println("Invalid Choice!");
					continue;
				} 
				
				return input;
				
			}catch(InputMismatchException ime) {
				System.err.println("Invalid Input");
				sc.nextLine();
			}
		}
		
		
	}
	
}
