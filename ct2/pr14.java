import java.util.Scanner;

public class pr14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int index = 0;
        Scanner scanchik = new Scanner(System.in);

        while (index < numbers.length) {
            System.out.print("Введите число: ");
            int vvod = scanchik.nextInt();

            if (index == 0 || vvod > numbers[index - 1]) {
                numbers[index] = vvod;
                index++;
            } else {
                for (int i = 0; i < index; i++) {
                    if (vvod < numbers[i]) {
                        for (int j = index - 1; j >= i; j--) {
                            numbers[j + 1] = numbers[j];
                        }
                        numbers[i] = vvod;
                        break;
                    }
                }
            }

            System.out.println("Ячейка памяти: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        }
    }
}