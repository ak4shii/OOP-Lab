import javax.swing.JOptionPane;
import java.lang.Math;

public class SecondDegreeEq{
    public static void main(String[] args){
        double a, b, c, delta;
        String res;

        a = Double.parseDouble(JOptionPane.showInputDialog("Enter the value for a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter the value for b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Enter the value for c: "));

        if (a == 0){
            if (b == 0){
                if (c == 0)
                    res = "The equation has infinite solutions";
                else
                    res = "The equation has no solution";
            }
            else{
                if (c == 0)
                    res = "The equation has one solution: " + 0;
                else
                    res = "The equation has one solution: " + (-c / b);
            }
        }
        else{
            delta = b * b - 4 * a * c;
            if (delta < 0)
                res = "The equation has no solution";
            else if (delta == 0)
                res = "The equation has one solution: " + (-b / (2 * a));
            else
                res = "The equation has two solutions: " + ((-b + Math.sqrt(delta)) / (2 * a)) + " and " + ((-b - Math.sqrt(delta)) / (2 * a));
        }
        JOptionPane.showMessageDialog(null, res, "Result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}