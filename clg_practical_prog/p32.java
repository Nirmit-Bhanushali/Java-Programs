import java.util.Scanner;

public class p32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        int sum = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element at position (" + i + "," + j + "):");
                arr[i][j] = sc.nextInt();
                sum += arr[i][j]; // Add each element to sum
            }
        }

        System.out.println("The array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of all elements in the array: " + sum);
        sc.close();
    }
}
