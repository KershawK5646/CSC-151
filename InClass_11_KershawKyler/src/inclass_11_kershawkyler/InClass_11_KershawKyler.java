/*
 * Kyler Kershaw
 * 20190220 Start
 * Finish
 * Page 172-173
 * 3-21 CurrencyFormat2.java
 * 3-22 CurrencyFormat3.java
 * Combine the two outputs into one program.
 */
package inclass_11_kershawkyler;
import javax.swing.JOptionPane;

/*
This program demonstrates how to use the String.format 
method to format a number as a currency.
*/
public class InClass_11_KershawKyler {

    public static void main(String[] args) {
        double monthlyPay = 5000.0;
        double annualPay = monthlyPay * 12;
        String output = String.format("CurrencyFormat2.java" + "\n" + 
                "Your annual pay is $%,.2f", annualPay);
        
        JOptionPane.showMessageDialog(null,output);
        
        JOptionPane.showMessageDialog(null,
                String.format("CurrencyFormat3.java" + "\n" +
                        "Your annual pay is $%,.2f", annualPay));
    }
}
