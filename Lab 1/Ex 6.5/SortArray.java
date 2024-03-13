import java.util.Scanner;
import java.util.Arrays;

public class SortArray{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt(); 
        double[] arr = new double[n];
        double sumOfArray = 0;
        for (int i = 0; i < n; i++){
            arr[i] = input.nextDouble();
            sumOfArray += arr[i];
        }

        Arrays.sort(arr);
        
        System.out.print("The sorted array is: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nThe sum of the array is: " + sumOfArray);
        double AverageVal = sumOfArray / n;
        System.out.println("The average value of array elements is: " + AverageVal);

        input.close();
    }
}
