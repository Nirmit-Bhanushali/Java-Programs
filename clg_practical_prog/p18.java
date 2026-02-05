public class p18 {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        int sum1 = 0;

        for (i = 50; i <= 60; i++) {

            if (i % 2 == 0) {
                System.out.println("Even is:" + i);
                sum += i;
            }

            else {

                System.out.println("Odd is:" + i);
                sum1 += i;
            }
        }
        System.out.println("Sum of Even numbers is: " + sum);
        System.out.println("Sum of Odd numbers is: " + sum1);

    }

}
