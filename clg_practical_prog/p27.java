public class p27 {
    public static void main(String[] args) {
        int[] age = { 10, 15, 20, 25, 30, 5, 41, 7 };
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < age.length; i++) {
            sum += age[i];
            avg = sum / age.length;
        }
        System.out.println("Sum of array is: " + sum);
        System.out.println("Average of array is: " + avg);
    }
}
