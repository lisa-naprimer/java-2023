import java.util.Scanner;
import java.util.ArrayList;


public class pr31 {
    public static void pr31(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число из ряда Фибоначчи");
        int userDit = scanner.nextInt();
        pr31 pr31 = new pr31(userDit);
        System.out.println(pr31);
    }
}

public class pr31 {
    public static final ArrayList<Integer> ditsFib = new ArrayList<>();
    public static ArrayList<Character> ArrayResult = new ArrayList<>();
    public static ArrayList<Integer> indexArrayResult = new ArrayList<>();
    public static int indexArray = 0;

    public pr31(int dit) {
        indexArray = dit;
        int n0 = 1;
        ditsFib.add(0);
        ditsFib.add(n0);
        int n1 = 1;
        ditsFib.add(n1);
        int n2;
        for (int i = 3; i <= dit; i++) {
            n2 = n0 + n1;
            ditsFib.add(n2);
            n0 = n1;
            n1 = n2;
        }
        checkForRepeat();
    }

    private void checkForRepeat() {
        String result = String.valueOf(ditsFib.get(indexArray));
        char checkOneLetter;
        char checkOtherLetters;
        for (int i = 0; i < result.length(); i++) {
            int count = 1;
            checkOneLetter = result.charAt(i);
            ArrayResult.add(checkOneLetter);
            for (int j = 0; j < result.length(); j++) {
                checkOtherLetters = result.charAt(j);
                if (checkOneLetter == checkOtherLetters && i != j) {
                    count++;
                    indexArrayResult.add(count);
                } else if (j == result.length() - 1) {
                    indexArrayResult.add(count);
                }
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        int index = 0;
        int maxRe = indexArrayResult.get(0);
        for (int i = 1; i < indexArrayResult.size(); i++) {
            if (indexArrayResult.get(i) > maxRe) {
                maxRe = indexArrayResult.get(i);
            }
        }
        if (maxRe == 1) {
            int max = Integer.parseInt(String.valueOf(ArrayResult.get(0)));
            for (int i = 1; i < ArrayResult.size(); i++) {
                if (Integer.parseInt(String.valueOf(ArrayResult.get(i))) > max) {
                    max = Integer.parseInt(String.valueOf(ArrayResult.get(i)));
                    result = String.valueOf(max);
                }
            }
            return "Повторяющихся цыфр не обнаружено, наибольшее из предложенных это " + result;
        }
        else{
            index = 0;
            int max = indexArrayResult.get(0);
            for (int i = 1; i < indexArrayResult.size(); i++) {
                if (indexArrayResult.get(i) > max) {
                    max = indexArrayResult.get(i);
                    index = i;
                }
            }
            result = "Цыфра " + ArrayResult.get(index) + " повторяется " + indexArrayResult.get(index) + " раза";
        }
        return result;
    }
}
