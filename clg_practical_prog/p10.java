import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter your citizenship: ");
        String citizen = sc.nextLine();

        if (age >= 18) {
            System.out.println("You are eligible for voting");
            if (citizen.equals("India")) {
                System.out.println("You are an Indian citizen");
            } else {
                System.out.println("You are not an Indian citizen");
            }
        } else {
            System.out.println("You are not eligible for voting");
        }
        sc.close();

    }
}
