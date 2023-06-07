import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя:");
        String name = scanner.nextLine();

        name = name.toUpperCase().charAt(0) + name.toLowerCase().substring(1);
        System.out.println("Привет, " + name + "!");
    }
}