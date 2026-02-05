public class p23 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i=" + i);
        }
        System.out.println("breaking loop at i=5");
    }
}
