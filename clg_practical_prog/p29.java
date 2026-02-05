import java.util.Scanner;

public class p29 {
    public static void main(String[] args) {
        int small;
        int num[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        small = num[0];
        for (int j = 0; j < num.length; j++) {
            if (small > num[j]) {
                small = num[j];
            }
        }
        System.out.println("Smallest number is: " + small);
        sc.close();
    }
}
