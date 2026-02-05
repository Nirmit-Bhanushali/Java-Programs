//skip negative values, but stop completely if you find a zero
package break_continue;

public class find_num {
    public static void main(String[] args) {
        int[] numbers = { 3, -1, 7, 0, 9 };

        for (int n : numbers) {
            if (n < 0) {
                continue; // skip negative numbers
            }
            if (n == 0) {
                break; // stop loop when zero is found
            }
            System.out.println(n);
        }
    }
}
