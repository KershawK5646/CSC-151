/*
 * Kyler Kerhsaw
 * 20190306
 * Code Listing 4-7 squares.java
 */
package inclass_15_kershawkyler;
import java.util.Scanner;
public class InClass_15_KershawKyler {
/*
 * This program demonstrates the for loop
 */
    public static void main(String[] args) {
        // Create a new scanner object
        Scanner sc = new Scanner(System.in);
        //Loop control variable
        int number;
        // Variable for the user to define
        int counts;
        
        // Get user input to use for the loop
        System.out.println("How many squares would you like to find?");
        counts = sc.nextInt();
        
        // Validation loop
        while(counts <= 0)
        {
            System.out.println("Number must be greater than zero.");
            System.out.println("How many squares would you like to find?");
            counts = sc.nextInt();
        }
        
        // Formatting
        System.out.println("Number Number Squares");
        System.out.println("------------------------");
        
        // Loop
        for (number = 1; counts >= number; number++)
        {
            System.out.println(number + "\t\t" + 
                    number * number);
        }
    }
}
