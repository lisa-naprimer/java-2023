import java.util.Scanner;

public class pr35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вам необходимо угадать код состоящий из 4-ех цыфр от 0 до 50, вам предоставляется 20 попыток" + "\n" + "Введите код!");
        Game game = new Game();
        String userText = scanner.nextLine();
        int attempt = 1;
        //System.out.println(game); правильный ответ
        while(game.guessTheCode(userText) != 4) {
            if (game.guessTheCode(userText) == 4) {
                System.out.println("Вы угадали код");
                break;
            } else if (attempt == 20) {
                System.out.println("К сожалению код не удалось подобрать, исчерпан лимит попыток");
                break;
            } else {
                System.out.println("Их загаданного кода совпало " + game.guessTheCode(userText) + " цыфр" + "\n" + "Повторите попытку ввода" + "\n");
                attempt++;
                userText = scanner.nextLine();
            }
        }
    }
}
public class pr35 {
    public static final int[] correctAnswer = new int[4];
    public static final int[] intUserText = new int[4];
    private static final int DOWN = 0;
    private static final int UP = 50;

    public pr35() {
        for (int i = 0; i < 4; i++) {
            int oneDit = DOWN + (int) (Math.random() * UP);
            correctAnswer[i] = oneDit;
        }
    }

    public int guessTheCode(String userText) {
        StringInArray(userText);
        return checkCorrectAnswer();
    }

    private void StringInArray(String userText) {
        char checkLetter;
        int indexForArray = 0;
        int checkIndexForSpace = 0;
        String result = "";
        for (int i = 0; i < userText.length(); i++) {
            checkLetter = userText.charAt(i);
            if (checkLetter == ' ') {
                result = userText.substring(checkIndexForSpace, i);
                checkIndexForSpace = i + 1;
                intUserText[indexForArray] = Integer.parseInt(result);
                indexForArray++;
            }
            if (i == userText.length() - 1) {
                result = userText.substring(checkIndexForSpace);
                intUserText[indexForArray] = Integer.parseInt(result);
            }
        }
    }
    private int checkCorrectAnswer() {
        int checkForCorrect= 0;
        for (int i = 0; i < correctAnswer.length; i++) {
            for (int j = 0; j < intUserText.length; j++) {
                if (correctAnswer[i] == intUserText[j]){
                    checkForCorrect++;
                }
            }
        }
        return checkForCorrect;
    }
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < correctAnswer.length; i++) {
            result += correctAnswer[i] + " ";
        }
        return result;
    }

//    @Override
//    public String toString() {
//        String result = "";
//        for (int i = 0; i < intUserText.length; i++) {
//            result += intUserText[i] + "\n";
//        }
//        return result;
//    }
}