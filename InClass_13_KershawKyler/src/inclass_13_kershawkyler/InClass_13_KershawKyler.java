/*
 * Kyler Kershaw
 * 20190227
 * InClass_13
 * 
 * Page 130 TestResults.java
 * This program asks the user to enter a numeric test score
 * and displays a letter grade from the score. The program
 * uses an if-else-if statement to determine the letter grade.
 */
package inclass_13_kershawkyler;
import javax.swing.JOptionPane;
public class InClass_13_KershawKyler {

    public static void main(String[] args) 
    {
        int testScore;                  //Numeric test score
        String input;                   // To hold the user input.
        
        // Get the numeric test score
        input = JOptionPane.showInputDialog("Enter yout numeric " +
                       "test score and I will tell you the grade: ");
        testScore = Integer.parseInt(input);
        
        // Display the grade.
        if (testScore < 60)
            JOptionPane.showMessageDialog(null,"Your grade is F.");
        else if (testScore < 70)
            JOptionPane.showMessageDialog(null,"Your grade is D.");
        else if (testScore < 80)
            JOptionPane.showMessageDialog(null,"Your grade is C.");
        else if (testScore < 90)
            JOptionPane.showMessageDialog(null,"Your grade is B.");
        else
            JOptionPane.showMessageDialog(null,"Your grade is A.");
        
     System.exit(0);
    }    
}