/*
 * Kyler Kershaw
 * 01/16/2019
 * This proram calculates the gross pay without user input.
 * This is the first in class program exervise.
 */
package inclass_02_kershawkyler;
public class InClass_02_KershawKyler {
    public static void main(String[] args) 
    {
        // Declare all variables
        int hours = 40;
        double payRate = 25.0;
        double grossPay = 0.0;
        
       // Program
        grossPay = hours * payRate;
        System.out.printf("Your gross pay is $ %,.2f" , grossPay);
        System.out.printf("\n...");
    }
    
}
