import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        if (num >= 90)
            System.out.println("Grade A");
        else if (num < 90 && num >= 75)
            System.out.println("Grade B");
        else if (num < 75 && num >= 50)
            System.out.println("Grade C");
        else
            System.out.println("F");
        sc.close();
    }
}
