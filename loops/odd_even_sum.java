package loops;
import java.util.Scanner;

public class odd_even_sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = scanner.nextInt(); // Example start number
        System.out.print("Enter end number: ");
        int end = scanner.nextInt(); // Example end number

        int evenSum = 0;
        int oddSum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Sum of even numbers between " + start + " and " + end + ": " + evenSum);
        System.out.println("Sum of odd numbers between " + start + " and " + end + ": " + oddSum);
        scanner.close();
    }
}
