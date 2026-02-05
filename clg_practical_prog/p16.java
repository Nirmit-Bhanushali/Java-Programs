import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        final int CORRECT_PIN = 1234; // Set your correct PIN here
        int attempts = 0;
        int pin;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your ATM PIN: ");
            pin = sc.nextInt();
            attempts++;

            if (pin == CORRECT_PIN) {
                System.out.println("PIN accepted. Access granted.");
                break;
            } else {
                System.out.println("Incorrect PIN.");
            }
        } while (attempts < 3);

        if (pin != CORRECT_PIN) {
            System.out.println("Too many incorrect attempts. Access denied.");
        }

        sc.close();

    }
}
