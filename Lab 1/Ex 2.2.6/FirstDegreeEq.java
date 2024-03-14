import javax.swing.JOptionPane;

public class FirstDegreeEq{
    public static void main(String[] args){
        double a, b;
        String res;

        a = Double.parseDouble(JOptionPane.showInputDialog("Enter the value for a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter the value for b: "));

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
