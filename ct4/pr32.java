import java.util.Scanner;
import static java.lang.Math.sqrt;

public class pr32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во палочек");
        int numberOfSticks = scanner.nextInt();
        Game game = new Game();
        if (numberOfSticks % 2 == 0 || game.IsSimple(numberOfSticks) && numberOfSticks != 7 && numberOfSticks != 11) {
            System.out.println("Таня выиграла, у нее " + game.game(numberOfSticks) + " палочек");
        } else {
            System.out.println("Таня выиграла, у нее " + game.game(numberOfSticks) + " палочек");
        }
    }
}


public class Game {
    public int countOfSticks;
    public int Sasha = 0;
    public int Tanya = 0;

    public int game(int countOfSticks) {
        while (countOfSticks != 1) {
            if (countOfSticks % 2 == 0) {
                Tanya++;
                countOfSticks--;
                if (countOfSticks == 1) {
                    break;
                } else {
                    Sasha++;
                    countOfSticks--;
                    //game(countOfSticks);
                }
            } else {
                Tanya++;
                countOfSticks--;
                if (countOfSticks % 2 == 0) {
                    Sasha += countOfSticks / 2;
                    countOfSticks /= 2;
                    if (countOfSticks == 1) {
                        break;
                    }
                } else {
                    game(countOfSticks);
                }
            }
        }
        return Tanya;
    }

    boolean IsSimple(int ANum) {
        if (ANum < 2)
            return false;
        double s = sqrt(ANum);
        for (int i = 2; i <= s; i++) {
            if (ANum % i == 0)
                return false;
        }
        return true;
    }
}