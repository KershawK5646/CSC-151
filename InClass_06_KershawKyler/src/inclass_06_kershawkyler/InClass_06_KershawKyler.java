/*
 * Kyler Kershaw
 * 190204
 * This program demonstrates using dialogs with JOptionPane.
 * It calculates gross pay based on user input.
 * Page 97 Chapter 2
 * 2-33 PayrollDialog.java
 */
package inclass_06_kershawkyler;

import javax.swing.JOptionPane;
public class InClass_06_KershawKyler {
    public static void main(String[] args) {
        String inputString;         // For reading input
        String name;                // The user's name
        int hours;                  // The number of hours worked
        int federalTaxRate;         // Federal tax rate (User input 15%)
        double payRate;             // The user's hourly pay rate
        double grossPay;            // The user's gross pay
        double netPay;              // The user's net pay
        double stateTaxRate;        // State tax rate (User input 5.75%)
        double socialSecurityRate;  // Social security (User input 6.2%)
        double medicareRate;        // Medicare cut (User input 1.45%)
        double federalTaxCut;       // Federal tax total.
        double stateTaxCut;         // State tax total
        double socialSecurityCut;   // Social security total
        double medicareCut;         // Medicare cut total
        double toMakePercent;       // Multiply by this to convert % to decimal
        double totalCuts;           // User's total deductions
        
        toMakePercent = .01;
        
        // Get the user's name
        name = JOptionPane.showInputDialog("What is your name? ");
        
        // Get the hours worked
        inputString = 
            JOptionPane.showInputDialog("How many hours "+
                "did you work this week? ");
        
        // Convert the input to an int.
        hours = Integer.parseInt(inputString);
        
        // Get the hourly pay rate.
        inputString = 
            JOptionPane.showInputDialog("What is your hourly pay rate? ");
        
        // Convert the input to a double
        payRate = Double.parseDouble(inputString);
        
        
        // Get the Federal Tax rate
        inputString = JOptionPane.showInputDialog("Enter your Federal Tax" +
                "rate percentage Example: Enter 15 for 15%");
        
        // Convert to a decimal for use later.
        federalTaxRate = Integer.parseInt(inputString);
        
        // Calculate the federal tax total
        federalTaxCut = federalTaxRate * toMakePercent;
        
        
        
        // Get the State Tax rate
        inputString = JOptionPane.showInputDialog("Enter your State Tax" +
                "rate percentage Example: Enter 5.75 for 5.75%");
        
        // Convert to a decimal for use later.
        stateTaxRate = Double.parseDouble(inputString);
        
        // Calculate the state tax total
        stateTaxCut = stateTaxRate * toMakePercent;
        
        
        
        // Get the social security rate
        inputString = JOptionPane.showInputDialog("Enter your Social Security" +
                "rate percentage Example: Enter 6.2 for 6.2%");
        
        // Convert to a decimal for use later.
        socialSecurityRate = Double.parseDouble(inputString);
        
        // Calculate the Social Security total
        socialSecurityCut = socialSecurityRate * toMakePercent;
        
        
        
        // Get the medicare rate
        inputString = JOptionPane.showInputDialog("Enter your Medicare" +
                "rate percentage Example: Enter 1.45 for 1.45%");
        
        // Convert to a decimal for use later.
        medicareRate = Double.parseDouble(inputString);
        
        // Calculate the medicare total
        medicareCut = medicareRate * toMakePercent;
        

        
        // Calculate the gross pay
        grossPay = hours * payRate;
        
        // Calculate total deductions
        totalCuts = federalTaxCut + stateTaxCut + socialSecurityCut + 
                medicareCut;
        
        // Calculate net pay
        netPay = grossPay - totalCuts;
        
        // Display the results
        JOptionPane.showMessageDialog(null, "Hello " +
                name +". Your gross pay is $" + grossPay +
                "\n Your Federal tax deduction is $" + federalTaxCut +
                "\n Your State tax deduction is $" + stateTaxCut +
                "\n Your Social Security deduction is $" + socialSecurityCut +
                "\n Your Medicare deduction is $" + medicareCut +
                "\n Your net pay is $" + netPay);
        
        // End the program
        System.exit(0);
    }
}