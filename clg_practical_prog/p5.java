import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int n2=sc.nextInt();
        int cal=n1+n2;
        System.out.println("Sum is:"+cal);
        cal =n1-n2;
        System.out.println("Difference is:"+cal);
        cal=n1*n2;
        System.out.println("Product is:"+cal);
        cal=n1/n2;
        System.out.println("Quotient is:"+cal);
        sc.close();
    }
}