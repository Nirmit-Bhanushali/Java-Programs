package arrays;
import java.util.Scanner;
public class input_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of the 2D array are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
