import java.io.FileWriter;
import java.io.IOException;

public class pr20 {
    public static void main(String[] args) {
        int m = 8; // m - высота
        int n = 8; // n - ширина

        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int Ring = Math.min(Math.min(i, j), Math.min(m - i - 1, n - j - 1));
                array[i][j] = Ring + 1;
            }
        }

        try (FileWriter writer = new FileWriter("array.txt")) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    writer.write(array[i][j] + " ");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}