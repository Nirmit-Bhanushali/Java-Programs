import java.util.Scanner;

public class p28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[8];
        int sum = 0;
        int avg = 0;
        System.out.println("Enter the ages of 8 people:");
        for (int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
            sum += age[i];
            avg = sum / age.length;
        }
        System.out.println("Sum of array is: " + sum);
        System.out.println("Average of array is: " + avg);
        sc.close();
    }
}
