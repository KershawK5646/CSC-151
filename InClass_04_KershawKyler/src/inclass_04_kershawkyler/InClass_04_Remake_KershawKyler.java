
package inclass_04_kershawkyler;

import javax.swing.JOptionPane;

public class InClass_04_Remake_KershawKyler {
    

    public static void main(String[] args) {
        // Declare variables
        String inputString;
        final double STATE_TAX_RATE;
        final double COUNTY_TAX_RATE;
        double item_price;
        double state_tax;
        double county_tax;
        double total_tax;
        double total_price;
        
        //Give variables a place holder value
        STATE_TAX_RATE = 0.04;
        COUNTY_TAX_RATE = 0.02;
        item_price = 0.00;
        state_tax = 0.00;
        county_tax = 0.00;
        total_tax = 0.00;
        total_price = 0.00;
        
        // Get item price from user
        inputString = JOptionPane.showInputDialog("Enter the item price. ");
        item_price = Double.parseDouble(inputString);
        
        
        //Calculate the state tax
        state_tax = STATE_TAX_RATE * item_price;
        
        // Calculate the county tax
        county_tax = COUNTY_TAX_RATE * item_price;
        
        // Calculate the total tax
        total_tax = state_tax + county_tax;
       
        // Calculate the total price
        total_price = item_price + total_tax;
        
        // Display results
        JOptionPane.showMessageDialog(null, "Your item price was " + 
                item_price);
        JOptionPane.showMessageDialog(null, "Your state tax was " + 
                state_tax);
        JOptionPane.showMessageDialog(null, "Your county tax was " + 
                county_tax);
        JOptionPane.showMessageDialog(null, "Your total price was " + 
                total_price);
        
        System.out.println("Item price: " + item_price);
        System.out.println("State tax: " + state_tax);
        System.out.println("County tax: " + county_tax);
        System.out.println("Total price: " + total_price);
    }
    
}
