/*
 * Kyler Kershaw
 * 01/23/2019
 * This proram calculates the gross pay without user input.
 * This is the first in class program exervise.
 * 
 * Enter employee name
 * Enter pay rate
 * Enter hours worked
 * Calculate pay
 * Display employee pay
 * Ask user if they want to calculate another
 */
package inclass_03_kershawkyler;

import java.util.Scanner; // Using the scanner class

public class InClass_03_KershawKyler {
    public static void main(String[] args) 
    {
        // Declare all variables
        String employeeName;
        int hoursWorked = 0;
        double payRate = 0.0;
        double grossPay = 0.0;
        String goAgain;
        boolean repeat = true;
        
        // Create the Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        while (repeat)
            {
                // Get the employee name
                System.out.print("What is the employees name?");
                employeeName = keyboard.nextLine();

                // Get the pay rate for the employee
                System.out.print("What is the hourly pay rate for this employee");
                payRate = keyboard.nextDouble();

                // Get the hours worked
                System.out.print("How many hours did this employee work?");
                hoursWorked = keyboard.nextInt();

                // Calculate the pay
                grossPay = hoursWorked * payRate;

                // Display the results
                System.out.printf("Your gross pay is $ %,.2f" , grossPay);
                System.out.printf("\n...");
                
                // Ask to go again
                System.out.println("Would you like to calculate another paycheck? Y/N");
                goAgain = keyboard.next();
                if (goAgain.equals ("y"))
                {repeat = true;}
                
                else if(goAgain.equals ("Y"))
                {repeat = true;}
                
                else if(goAgain.equals ("n"))
                {repeat = false;}
                
                else if(goAgain.equals ("N"))
                {repeat = false;}
                
            }

        
    }
    
}
