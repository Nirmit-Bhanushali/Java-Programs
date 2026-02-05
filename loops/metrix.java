package loops;
public class metrix {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println("\n");
        }
    }
}
