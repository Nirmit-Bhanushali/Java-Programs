/*
Write a Java program to demonstrate method overloading by creating multiple 
methods with the same name but different parameters to perform addition of 
two integers, three integers, and two double values.
 */
package methods;

import java.util.Scanner;

public class add_overload {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        add_overload calculator = new add_overload();
        System.out.println("Enter your choice:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add three integers");
        System.out.println("3. Add two doubles");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                int intResult = calculator.add(a1, b1);
                System.out.println("Sum of two integers: " + intResult);
                break;
            case 2:
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
                int c2 = sc.nextInt();
                int intResultThree = calculator.add(a2, b2, c2);
                System.out.println("Sum of three integers: " + intResultThree);
                break;
            case 3:
                float a3 = sc.nextFloat();
                float b3 = sc.nextFloat();
                double doubleResult = calculator.add(a3, b3);
                System.out.println("Sum of two doubles: " + doubleResult);
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
