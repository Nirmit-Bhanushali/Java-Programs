// Find the given number is prime or not
import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = sc.nextLong();
        sc.close();

        if (n <= 1) {
            System.out.println(n + " is not prime");
            return;
        }
        if (n == 2) {
            System.out.println("2 is prime");
            return;
        }
        if (n % 2 == 0) {
            System.out.println(n + " is not prime");
            return;
        }

        long limit = (long) Math.sqrt(n);
        for (long i = 3; i <= limit; i += 2) {
            if (n % i == 0) {
                System.out.println(n + " is not prime");
                return;
            }
        }
        System.out.println(n + " is prime");
    }
}
