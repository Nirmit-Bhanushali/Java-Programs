package arrays;

public class ages_avg {
    public static void main(String[] args) {
        int [] ages={22,19,48,43,39,56,21,30};
        int sum=0;
        for(int i=0;i<ages.length;i++){
            sum+=ages[i];
        }
        int avg=sum/ages.length;
        System.out.println("Average age: "+avg);
    }
}
