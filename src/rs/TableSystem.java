package rs;

import java.util.*;

public class TableSystem {
    public Set<Integer> tables = new TreeSet<>();
    
   
    
    public void addTable(int tableNumber) {
        tables.add(tableNumber);
        System.out.println("Table added successfully!");
    }
    
    public void removeTable(int tableNumber) {
        if (tables.remove(tableNumber)) {
            System.out.println("Table removed successfully!");
        } else {
            System.out.println("Table not found!");
        }
    }
    
    public void viewTable() {
        System.out.println("Available Tables:");
        for (int table : tables) {
            System.out.print(table + " ");
        }
        System.out.println();
    }
}