import java.util.Arrays;

public class pr33 {
    public static void main(String[] args) {
        String[] spisok = {"56", "65", "74", "100", "99", "68", "86", "180", "90"};
        String[] sortSpisok = new String[9];
        String[] otvet = new String[9];
        for (int i = 0; i < spisok.length; i++) {
            String elementOfArrray = spisok[i];
            String result = "";
            int plus = 0;
            for (int j = 0; j < elementOfArrray.length(); j++) {
                plus += Integer.parseInt(String.valueOf(elementOfArrray.charAt(j)));
            }
            result += plus;
            sortSpisok[i] = result;
        }
        for (int k = 0; k < 9; k++) { //Заполнение цикла ответ
            int checkForNullInSort = 0;
            if (sortSpisok[checkForNullInSort] == null) {
                while(sortSpisok[checkForNullInSort] == null) {
                    if (checkForNullInSort == 8) {
                        break;
                    }else {
                        checkForNullInSort++;
                    }
                }
            }
            int min = Integer.parseInt(sortSpisok[checkForNullInSort]);
            int indexForOtvet = 0;
            for (int i = 1; i < sortSpisok.length; i++) {
                if (sortSpisok[i] != null) {
                    if (Integer.parseInt(sortSpisok[i]) < min) {
                        min = Integer.parseInt(sortSpisok[i]);
                        indexForOtvet = i;
                    }
                }
            }
            if (indexForOtvet == 0) {
                sortSpisok[checkForNullInSort] = null;
                otvet[k] = spisok[checkForNullInSort];
            } else {
                sortSpisok[indexForOtvet] = null;
                otvet[k] = spisok[indexForOtvet];
            }
        }
        System.out.println(Arrays.toString(otvet));
    }
}