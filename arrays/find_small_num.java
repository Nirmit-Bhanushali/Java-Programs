//create an array to find the smallest number in the imput numbers.
package arrays;
import java.util.*;
public class find_small_num {
    public static void main(String[] args) {
        int[] num=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            System.out.print("Enter number "+(i+1)+": ");
            num[i]=sc.nextInt();
        }
        int small=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]<small){
                small=num[i];
            }
        }
        System.out.print("Smallest number is: "+small);
        sc.close();
    }
}
