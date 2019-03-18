/*
Kyler Kershaw
190206
This is InClass_07_KershawKyler
Debugging assignment
Make it work using JOptionPane
*/
package InClass_07_KershawKyler_JOptionPane;
import javax.swing.JOptionPane;
public class InClass_07_KershawKyler_JOptionPane
{
   public static void main(String[] args){
      // Declare variables
      String inputString;
      final double GUEST_PRICE = 35.00;
      final double TAX_RATE = 0.07; 
      double price;
      int guests;
      double taxes;
      double total;
      
      inputString = JOptionPane.showInputDialog("Enter the number of guests: ");
      guests = Integer.parseInt(inputString);
      
      // Call the logo for the printout
      logo();
      
      // Calculate prices
      price = guests * GUEST_PRICE;
      taxes = price * TAX_RATE;
      total = price + taxes;
      
      // Display data
      System.out.printf("Number of guests: " + guests + '\n');
      System.out.printf("Price per guest: $%.2f\n", GUEST_PRICE);
      System.out.printf("Subtotal: $%.2f\n", price);
      System.out.printf("Taxes: $%.2f\n", taxes);
      System.out.printf("Your total is: $%.2f\n", total);
      JOptionPane.showMessageDialog(null, String.format("Number of guests: "+ 
              guests +"\n Price per guest: $%,.2f\n Subtotal: $%,.2f\n Taxes:"
              + " $%,.2f\n Your total is: $%,.2f\n", GUEST_PRICE, price, taxes,
              total));


   }
   // Logo function
   public static void logo(){
      System.out.println("***************************************************");
      System.out.println("*                                                 *");
      System.out.println("*  Jim's food makes the party great.              *");
      System.out.println("*                                                 *");
      System.out.println("***************************************************");
    }
   
}

