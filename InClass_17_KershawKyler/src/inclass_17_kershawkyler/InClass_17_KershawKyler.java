/*
 * Kyler Kerhsaw
 * 20190318
 * Page 185-186 Programming challenges #17
 * 1. This program correctly compares user input using the equals method.
 * 2. ADD - input Validation using a while loop.
 *
 * References:
 * Page 143 Code listing 3-9 compares 2 strings using equals method.
 * Pages 201-203 Code listing 4-5 (Soccer Teams)input validation with while loops.
 */
package inclass_17_kershawkyler;
import java.util.Scanner;
public class InClass_17_KershawKyler {

    public static void main(String[] args) {
        // Declare variables.
        String inputString;
        
        // Create a new scanner object
        Scanner sc = new Scanner(System.in);
        
        // Code start
        System.out.println("Reboot the computer and try to connect.");
        System.out.println("Did that fix the problem? [Y/N]: ");
        inputString = sc.nextLine();
        inputString = inputString.toLowerCase();
        while(!(inputString.equals("y") || 
            inputString.equals("yes")|| 
            inputString.equals("n")|| 
            inputString.equals("no")))
        {
            System.out.println("Invalid input. Please enter Y for yes or "
                    + "N for no.");
            System.out.println("Reboot the computer and try to connect.");
            System.out.println("Did that fix the problem? [Y/N]: ");
            inputString = sc.nextLine();
            inputString = inputString.toLowerCase();
        }
        
        // Fist validation
        if (!(inputString.equals("y") ||inputString.equals("yes")))
        {
            
                
            System.out.println("Reboot the router and try to connect.");
            System.out.println("Did that fix the problem? [Y/N]: ");
            inputString = sc.nextLine();
            inputString = inputString.toLowerCase();
            while(!(inputString.equals("y") || 
                    inputString.equals("yes")|| 
                    inputString.equals("n")|| 
                    inputString.equals("no")))
            {
                System.out.println("Invalid input. Please enter Y for yes or "
                        + "N for no.");
                System.out.println("Reboot the computer and try to connect.");
                System.out.println("Did that fix the problem? [Y/N]: ");
                inputString = sc.nextLine();
                inputString = inputString.toLowerCase();
            }
            if (!(inputString.equals("y") ||inputString.equals("yes")))
            {
                
                System.out.println("Make sure the cables between the "
                        + "router and modem are plugged in firmly.");
                System.out.println("Did that fix the problem? [Y/N]: ");
                inputString = sc.nextLine();
                inputString = inputString.toLowerCase();
                while(!(inputString.equals("y") || 
                    inputString.equals("yes")|| 
                    inputString.equals("n")|| 
                    inputString.equals("no")))
                {
                    System.out.println("Invalid input. Please enter Y for yes or "
                            + "N for no.");
                    System.out.println("Reboot the Router and try to connect.");
                    System.out.println("Did that fix the problem? [Y/N]: ");
                    inputString = sc.nextLine();
                    inputString = inputString.toLowerCase();
                }
                if (!(inputString.equals("y") ||inputString.equals("yes")))
                {
                    
                    System.out.println("Move the router to a new location and"
                            + "try to connect.");
                    System.out.println("Did that fix the problem? [Y/N]: ");
                    inputString = sc.nextLine();
                    inputString = inputString.toLowerCase();
                    while(!(inputString.equals("y") || 
                    inputString.equals("yes")|| 
                    inputString.equals("n")|| 
                    inputString.equals("no")))
                    {
                        System.out.println("Invalid input. Please enter Y for "
                                + "yes or N for no.");
                        System.out.println("Move the router to a new "
                                + "location and try to connect");
                        System.out.println("Did that fix the problem? [Y/N]: ");
                        inputString = sc.nextLine();
                        inputString = inputString.toLowerCase();
                    }
                    if (!(inputString.equals("y") ||inputString.equals("yes")))
                    {
                        System.out.println("Get a new router");
                    }
                    else
                    {
                        // Blank to kill
                    }
                }
                else
                {
                    // Blank to kill
                }
            }
            else
            {
                // Blank to kill
            }
        }
        else
        {
            // Blank to kill
        }
    }
}
