package rs;

import java.util.*;
public class OrderSystem {
    public Queue<String> orders;
    
    public OrderSystem() {
    	 orders = new LinkedList<>();
    }
	
	public void addOrder(String order) {
		orders.add(order);
		System.out.println("Order added successfully!!");
	}
	
	 public void serveOrder() {
	        String order = orders.poll();
	        
	        System.out.println("Serving " + order);
	       
	    }
	 public void viewPendingOrders() {
	        System.out.println("Pending Orders:");
	       int num = 1;
	       for(String order : orders) {
	    	   System.out.println((num++) + order);
	       }
	    }
	
}
