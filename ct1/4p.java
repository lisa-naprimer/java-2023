public class Main {
    public static void main(String[] args) {
        System.out.println("Введите массив чисел, для вычисления суммы их квадратов.");
        Scanner scanner1 = new Scanner(System.in);
        String usersText = scanner1.nextLine();
        System.out.println("Ответ: " + SumOfSquares.transformation(usersText));
    }
}
public class SumOfSquares {
    private static final int POWEROFTWO = 2;
    public static int transformation(String usersText) {
        int dits;
        int sum = 0;
        double squares;
        for (int i = 0; i < usersText.length(); i++) {
            if (usersText.charAt(i) != ' ') {
                dits = Character.getNumericValue(usersText.charAt(i));
                squares = Math.pow( dits, POWEROFTWO);
                sum += squares;
            }
        }
        return sum;
    }
}
