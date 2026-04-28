package rs;

import java.util.*;
public class CustomerReservation {
	 static List<String> reservations = new ArrayList<>();
	 
	 public static boolean addReservation(String name) {
		 if(name == null) {
			 return false;
		 }
		 reservations.add(name);
		 return true;
		 }	
	 
	 public static void viewReservation() {
		 System.out.println("Reservations");
		 for(int i = 0; i < reservations.size(); i++) {
			 System.out.println((i + 1) + ". " + reservations.get(i));
		 }
	 }
	 
	 public static boolean removeReservation(String name) {
		 if(reservations.remove(name)) {
			 return true;
		 }else {
			 return false;
		 }
	 }
	 
	 public static boolean searchReservation(String name) {
		    for (int j = 0; j < reservations.size(); j++) {
		        if (reservations.get(j).equals(name)) {
		            return true;  
		        }
		    }
		    return false; 
		}
	 
}
