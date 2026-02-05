package loops;

public class dice {
    public static void main(String[] args) {
        for (int dice = 0; dice <= 6; dice++) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
        }
    }
}
