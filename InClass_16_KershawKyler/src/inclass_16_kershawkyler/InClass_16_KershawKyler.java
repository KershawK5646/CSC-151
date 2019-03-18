/*
 * Kyler Kerhsaw
 * 20190311
 * This program correctly compares two String objects using the equals method.
 */
package inclass_16_kershawkyler;
import java.util.Scanner;
public class InClass_16_KershawKyler {

    public static void main(String[] args) {
        // Create a new scanner object
        Scanner sc = new Scanner(System.in);
    
        // Prompt the user for three names.  
        System.out.println("Please enter a name.");
        String name1 = sc.nextLine();
        System.out.println("Please enter the same name.");
        String name2 = sc.nextLine();
        System.out.println("Please enter a new name.");
        String name3 = sc.nextLine();
        
        
        // Compare "Mark" and "Mark"
        if(name1.equals(name2))
        {
            System.out.println(name1 + " and " + name2 +
                    " are the same.");
        }
        else
        {
            System.out.println(name1 + " and " + name2 +
                    " are NOT the same.");
        }
        
        // Compare "Mark" and "Mary"
        if (name1.equals(name3))
        {
            System.out.println(name1 + " and " + name3 +
                    " are the same.");
        }
        else
        {
            System.out.println(name1 + " and " + name3 +
                    " are NOT the same.");
        }       
    }
}