/*
 * Kyler Kershaw
 * 20190213
 * Demonstrate use of different operators.
 */
package inclass_09_kershawkyler;
import javax.swing.JOptionPane;
public class InClass_09_KershawKyler {
    public static void main(String[] args) {
        // + Addition operator
        // - Subtraction
        // * Multiplication
        // / Division
        // % Modulus remainder
        
        // Declare needed variables.
        int userInput01;
        int userInput02;
        int additionAnswer;
        int subtractionAnswer;
        int multiplicationAnswer;
        int divisionAnswer;
        int inputRadius;
        double circleArea;
        double radSquared;
        double divisionModulus;
        String inputString;
        
        // Get three itegers from the user.
        inputString = JOptionPane.showInputDialog("Enter an integer: ");
        userInput01 = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog("Enter a second integer: ");
        userInput02 = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog("Enter an integer for a" +
                " radius to find the area of a circle: ");
        inputRadius = Integer.parseInt(inputString);
        
        // Make calculations
        additionAnswer = userInput01 + userInput02;
        subtractionAnswer = userInput01 - userInput02;
        multiplicationAnswer = userInput01 * userInput02;
        divisionAnswer = userInput01 / userInput02;
        divisionModulus = userInput01 % userInput02;
        radSquared = inputRadius * inputRadius;
        circleArea = Math.PI * radSquared;
        
        
        // Display results
        JOptionPane.showMessageDialog(null, String.format(
        "Your first number was " + userInput01 + "\n" +                         // Restate number
        "Your second number was " + userInput02 + "\n" +                        // Restate number
        "========================================" + "\n" +                     // Formatting
        "Adding these two gives you: " + additionAnswer + "\n" +                // Addition
        "Subtracting these two gives you: " + subtractionAnswer + "\n" +        // Subtraction
        "Multiplying these numbers gives you: " + multiplicationAnswer + "\n" + // Multiplication
        "Dividing these two gives you: " + divisionAnswer + "\n" +              // Division
        "With a remainder of: " + divisionModulus + "\n" +                      // Remainder
        "Your circles area is: "+ circleArea));                                 // Circle Area
    }
}
