import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Первая строка:");
        String stroka1 = scanner.nextLine();
        System.out.println("Вторая строка:");
        String stroka2 = scanner.nextLine();

        boolean endsWith = stroka1.endsWith(stroka2);

        if (endsWith) {
            System.out.println("Является окончанием первой");
        } else {
            System.out.println("Не является окончанием первой");
        }
    }
}