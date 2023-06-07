import java.util.Scanner;

public class pr12 {
    public static void main(String[] args) {
        Scanner scanchik = new Scanner(System.in);

        System.out.println("Введите начальное число (также является шагом): ");
        int FirstAlsoStep = scanchik.nextInt();

        System.out.println("Введите конечное число: ");
        int Last = scanchik.nextInt();

        for (int i = 0; i < (Last/FirstAlsoStep); i++) {
            int numb = i * FirstAlsoStep + FirstAlsoStep;
            int square = numb * numb;
            System.out.print(square + " ");
        }
    }
}