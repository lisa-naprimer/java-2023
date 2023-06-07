import secondHomework.parenthesesFunction.caesarCipher.Caesar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(System.in);
        String userText = "";
        System.out.println("Введите шаг");
        int step = scanner1.nextInt();
        String separate = File.separator;
        File file = new File("/Users/Eugeniy/PycharmProjects/Izvekov-E.A.-Java/src/thirdHemowork/first/decipheringTheCaesarCipher/TextForEncryption");
        Scanner scanner2 = new Scanner(file);
        while (scanner2.hasNextLine()) {
            userText += scanner2.nextLine() + "\n";
        }
        Caesar caesar = new Caesar();
        String cipher = caesar.encryption(userText, step);
        System.out.println(userText);
        System.out.println("Зашифрованное слово: " + caesar.encryption(userText, step));
        System.out.println("Расшифрованно: " + caesar.decipheringTheCaesarCipher(cipher, step));
    }
}