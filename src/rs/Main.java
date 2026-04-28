package rs;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private static CustomerReservation reservations = new CustomerReservation();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("---Restaurant System---");
            System.out.println("1.Manage Reservations");
            System.out.println("2.Manage Food Orders");
            System.out.println("3.Manage Menu Categories");
            System.out.println("4.Manage Available Seats");
            System.out.println("5.Manage Billing Records");
            System.out.println("6.Exit");
            int choice = getPositiveInteger("Enter choice: ", 1, 6);

            switch (choice) {
                case 1:
                    reservation();
                    break;
                case 2:
                    foodOrder();
                    break;
                case 3:
                    menuCategories();
                    break;
                case 4:
                    availSeats();
                    break;
                case 5:
                    billing();
                    break;
                case 6:
                    System.out.println("Exiting program..");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void reservation() {
        while (true) {
            System.out.println();
            System.out.println("1. Add Reservation");
            System.out.println("2. View Reservation");
            System.out.println("3. Remove Reservation");
            System.out.println("4. Search Reservation");
            System.out.println("5. Back to Main Menu");
            int choice = getPositiveInteger("Enter choice: ", 1, 5);

            switch (choice) {
                case 1:
                    System.out.println("Enter customer name: ");
                    String name = sc.nextLine();

                    if (reservations.addReservation(name)) {
                        System.out.println("Reservation successful!");
                    }
                    break;

                case 2:
                    reservations.viewReservation();
                    break;

                case 3:
                    System.out.println("Enter name to remove: ");
                    String nameToRemove = sc.nextLine();

                    if (reservations.removeReservation(nameToRemove)) {
                        System.out.println(nameToRemove + " has been removed!");
                    }
                    break;
  
                case 4:
                    System.out.println("Enter name to search: ");
                    String nameToS = sc.nextLine();

                    if (reservations.searchReservation(nameToS)) {
                        System.out.println(nameToS + " has been found");
                    } else {
                        System.out.println(nameToS + " does not exist");
                    }
                    break;

                case 5:
                    return;
            }
        }
    }

    public static void foodOrder() {
        while (true) {
            System.out.println("1. Add Food Order");
            System.out.println("2. Serve Food Order");
            System.out.println("3. View Pending Order");
            System.out.println("4. Back to main menu");
            int choice = getPositiveInteger("Enter choice: ", 1, 4);

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void menuCategories() {
        while (true) {
            System.out.println("1. Add Category");
            System.out.println("2. View Category");
            System.out.println("3. Back to Main Menu");
            int choice = getPositiveInteger("Enter choice: ", 1, 3);

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
            }
        }
    }

    public static void availSeats() {
        while (true) {
            System.out.println("1. Add Table Numbers");
            System.out.println("2. Remove Occupied Table");
            System.out.println("3. View available Tables");
            System.out.println("4. Back to main menu");
            int choice = getPositiveInteger("Enter choice: ", 1, 4);

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void billing() {
        while (true) {
            System.out.println("1. Add billing record");
            System.out.println("2. View Billing Record");
            System.out.println("3. Search bill by customer");
            System.out.println("4. Back to main menu");
            int choice = getPositiveInteger("Enter choice: ", 1, 4);

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
            }
        }
    }

    public static int getPositiveInteger(String prompt, int min, int max) {
        while (true) {
            try {
                System.out.print(prompt);
                int input = sc.nextInt();
                sc.nextLine();

                if (input < min || input > max) {
                    System.err.println("Invalid Choice!");
                    continue;
                }

                return input;

            } catch (InputMismatchException ime) {
                System.err.println("Invalid Input");
                sc.nextLine();
            }
        }
    }
}