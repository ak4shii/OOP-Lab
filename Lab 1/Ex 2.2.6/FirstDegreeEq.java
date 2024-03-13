import java.swing.JOptionPane;

public class FirstDegreeEq{
    public static void main(String[] args){
        String aStr, bStr;
        double a, b;
        String res;

        aStr = JOptionPane.showInputDialog(null, "Please enter the value of a: ", "Input the value of a", JOptionPane.INFORMATION_MESSAGE);
        bStr = JOptionPane.showInputDialog(null, "Please enter the value of b: ", "Input the value of b", JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(aStr);
        b = Double.parseDouble(bStr);

        if (a == 0){
            if (b == 0){
                res = "The equation has infinite solutions";
            }
            else{
                res = "The equation has no solution";
            }
        }
        else{
            if (b == 0){
                res = "The equation has one solution: " + 0;
            }
            else{
                res = "The equation has one solution: " + (-b / a);
            }
        }
        JOptionPane.showMessageDialog(null, res, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
