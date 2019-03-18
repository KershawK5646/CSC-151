/*
Kyler Kershaw
190206
This is InClass_07_KershawKyler
Debugging assignment
Make it work using Scanner
*/
package InClass_07_KershawKyler;
import java.util.Scanner;
public class InClass_07_KershawKyler
{
   public static void main(String[] args){
      // Declare variables
      final double GUEST_PRICE = 35.00;
      final double TAX_RATE = 0.07; 
      double price;
      int guests;
      double taxes;
      double total;
      
      // Create the scanner
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of guests >> ");   // Get input
      guests = input.nextInt();                         // Convert input to int
      
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

