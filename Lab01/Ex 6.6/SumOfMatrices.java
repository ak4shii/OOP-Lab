import java.util.Scanner;

public class SumOfMatrices{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        int[][] arr1 = new int[rows][columns];
        int[][] arr2 = new int[rows][columns];
        System.out.println("Enter the first matrix: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                arr1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the second matrix: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                arr2[i][j] = input.nextInt();
            }
        }

        int[][] sumOfArray = new int[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                sumOfArray[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(sumOfArray[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        input.close();
    }
}