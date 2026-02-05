public class p20 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 50 and 60:");
        for (int num = 50; num <= 60; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    // Helper method to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
