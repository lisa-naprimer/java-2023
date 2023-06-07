import java.util.Scanner;

public class pr28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int x = (int) Math.sqrt(n);
        int y = x + 1;

        int diff = y * y - x * x;

        if (diff == n) {
            System.out.println(x * x + " " + y * y);
        } else {
            System.out.println("Неподходящее число");
        }
    }
}