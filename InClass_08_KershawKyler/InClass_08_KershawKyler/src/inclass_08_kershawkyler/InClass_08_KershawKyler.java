/*
 * Kyler Kershaw
 * 20190211
 * Demonstrate use of different operators.
 */
package inclass_08_kershawkyler;
import javax.swing.JOptionPane;
public class InClass_08_KershawKyler {
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
        double divisionModulus;
        String inputString;
        
        // Get two itegers from the user.
        inputString = JOptionPane.showInputDialog("Enter an integer: ");
        userInput01 = Integer.parseInt(inputString);
        inputString = JOptionPane.showInputDialog("Enter a second integer: ");
        userInput02 = Integer.parseInt(inputString);
        
        // Make calculations
        additionAnswer = userInput01 + userInput02;
        subtractionAnswer = userInput01 - userInput02;
        multiplicationAnswer = userInput01 * userInput02;
        divisionAnswer = userInput01 / userInput02;
        divisionModulus = userInput01 % userInput02;
        
        // Display results
        JOptionPane.showMessageDialog(null, String.format(
        "Your first number was " + userInput01 + "\n" +
        "Your second number was " + userInput02 + "\n" +
        "Adding these two gives you: " + additionAnswer + "\n" +
        "Subtracting these two gives you: " + subtractionAnswer + "\n" +
        "Dividing these two gives you: " + divisionAnswer + "\n" +
        "With a remainder of: " + divisionModulus)); 
    }
}
