package loops;
//Write a Java program using a for loop to print numbers from 50 to 60. From this series, identify and display only the even numbers.
import java.util.Scanner;

public class even_numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = scanner.nextInt(); // Example start number
        System.out.print("Enter end number: ");
        int end = scanner.nextInt(); // Example end number

        System.out.println("Even numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
