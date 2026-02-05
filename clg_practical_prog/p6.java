import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (n > 5) {
            System.out.println(n + " is greater than 5.");
        } else if (n == 5) {
            System.out.println(n + " is equal to 5.");
        } else {
            System.out.println(n + " is less than 5.");
        }
        sc.close();
    }
}
