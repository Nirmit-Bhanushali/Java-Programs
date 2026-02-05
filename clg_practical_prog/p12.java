import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Do you have a valid ID? (true/false): ");
        boolean hasID = scanner.nextBoolean();
        // Logical AND (&&)
        if (age >= 18 && hasID) {
            System.out.println("You are allowed to enter the club.");
        } else {
            System.out.println("You are not allowed to enter the club.");
        }
        // Logical OR (||)
        if (age < 18 || !hasID) {
            System.out.println("Entry denied due to age or missing ID.");
        } else {
            System.out.println("All checks passed.");
        }
        scanner.close();
    }
}
