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
			int choice = sc.nextInt();
			
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
		int choice = sc.nextInt();
		
	}
	
	public static void foodOrder() {}
	
	public static void menuCategories() {}
	public static void availSeats() {}
	public static void billing() {}
	
	
}
