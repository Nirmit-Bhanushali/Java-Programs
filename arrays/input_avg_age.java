package arrays;
import java.util.*;
public class input_avg_age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ages[]=new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            System.out.println("Enter age "+(i+1)+": ");
            ages[i]=sc.nextInt();
            sum+=ages[i];
        }
        int avg=sum/ages.length;
        System.out.println("Average age: "+avg);
        sc.close();
    }
}
