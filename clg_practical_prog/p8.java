import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number to check");
        float num = sc.nextFloat();
        if (num<0){
            System.out.println("The number" +num+ " is negative");
        }
        else if (num>0){
            System.out.println("The number" +num+ " is positive");
        }

        else{
            System.out.println("The number is zero");
        }
        sc.close();
    }
}
