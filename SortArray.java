import java.util.Scanner;

public class SortArray{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt(); 
        int[] arr = new int[n];
        int sumOfArray = 0;

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
            sumOfArray += arr[i];
        }

        int switchElement;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i] > arr[j]){
                    switchElement = arr[i];
                    arr[i] = arr[j];
                    arr[j] = switchElement;
                }
            }
        }

        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nThe sum of the array is: " + sumOfArray);
        int AverageVal = sumOfArray / n;
        System.out.println("The average value of array elements is: " + AverageVal);

        input.close();
    }
}
