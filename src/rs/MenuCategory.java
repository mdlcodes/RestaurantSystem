package rs;

import java.util.*;
public class MenuCategory {
	public Set<String> categories = new HashSet<>();
    
	public static void addCategory(String category) {
        
    }
   
	 public void viewCategories() {
	        System.out.println("Menu Categories:");
	        for (String category : categories) {
	            System.out.println(category);
	        }
	    }
}
