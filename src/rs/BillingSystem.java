package rs;

import java.util.*;

public class BillingSystem {
    public Map<String, Double> billingRecords = new HashMap<>();;
   
    public void addBill(String customerName, double amount) {
        billingRecords.put(customerName, amount);
        System.out.println("Billing record added successfully!");
    }
    
    public void viewBills() {
        System.out.println("Billing Records:");
        for (Map.Entry<String, Double> entry : billingRecords.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
    
    public void searchBill(String customerName) {
        Double amount = billingRecords.get(customerName);
        
    }
}