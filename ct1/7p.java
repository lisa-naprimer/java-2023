import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        int Square = 0;
        int Distance = Integer.MAX_VALUE;

        for (int i = 0; i <= num; i++) {
            int square = i * i;
            int distance = Math.abs(num - square);

            if (distance < Distance) {
                Distance = distance;
                Square = square;
            }
        }

        System.out.println("Ближайший квадрат: " + Square);
    }
}