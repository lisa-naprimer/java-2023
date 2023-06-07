import java.util.ArrayList

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        ArrayList<Integer> info = input.getInfo();
        System.out.println(info);
        Summa square = new Summa(info);
        System.out.println("Сумма квадаратов = " + square.Sum());
    }
}

        import static java.lang.Math.pow;
public class Summa {
    private ArrayList<Integer> array;
    public Summa(ArrayList<Integer> array) {
        this.array = array;
    }
    public int Sum() {
        int sum = 0;
        for (int number : array) {
            sum += pow(number, 2);
        }
        return sum;
    }
}