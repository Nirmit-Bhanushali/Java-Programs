package practice_ex;
import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Are you a citizen? (true/false): ");
        boolean isCitizen = sc.nextBoolean();
        if (age >= 18) {
            if (isCitizen) {
                System.out.println("You are eligible to vote.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }
}
