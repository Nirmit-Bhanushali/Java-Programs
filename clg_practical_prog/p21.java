public class p21 {
    public static void main(String[] args) {
        System.out.println("Multiplication table from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}