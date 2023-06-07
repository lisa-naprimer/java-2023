import java.util.Scanner;

public class pr16 {
    public static void main(String[] args) {
        Scanner scanchik = new Scanner(System.in);
        String input = scanchik.nextLine();

        int UpperMoment = 0;
        int LowerMoment = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                UpperMoment++;
            } else if (Character.isLowerCase(c)) {
                LowerMoment++;
            }
        }

        String output;
        if (UpperMoment > LowerMoment) {
            output = input.toUpperCase();
        } else if (UpperMoment < LowerMoment) {
            output = input.toLowerCase();
        } else {
            output = input.toLowerCase();
        }

        System.out.println(output);

    }
}