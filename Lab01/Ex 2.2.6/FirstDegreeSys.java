import javax.swing.JOptionPane;

public class FirstDegreeSys{
    public static void main(String[] args){
        double a11, a12, b1, a21, a22, b2;
        a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value for a11: "));
        a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value for a12: "));
        b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value for b1: "));
        a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value for a21: "));
        a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value for a22: "));
        b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value for b2: "));

        double det = a11 * a22 - a12 * a21;
        double det1, det2;
        String res;
        if (det == 0){
            if ((a11/a21 == a12/a22) && (a11/a21 == b1/b2))
                res = "The system has infinite solutions";
            else
                res = "The system has no solution";
        }
        else{
            det1 = a22 * b1 - a12 * b2;
            det2 = a11 * b2 - a21 * b1;
            res = "The solutions of the system are: " + (det1 / det) + " and " + (det2 / det);
        }
        JOptionPane.showMessageDialog(null, res, "Result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}