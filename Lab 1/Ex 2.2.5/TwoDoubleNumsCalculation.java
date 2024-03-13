import java.swing.JOptionPane;
import java.lang.Math;

public class TwoDoubleNumsCalculation{
    public static void main(String[] args){
        String strNum1, strNum2;
        double num1, num2;

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = Math.abs(num1 - num2);
        double product = num1 * num2;
        double quotient = num1 / num2;
        
        String res = "Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nQuotien: " + quotient;
        JOptionPane.showMessageDialog(null, res, "Calculation of two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}