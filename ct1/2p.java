import Utils.Debuggable;
import Utils.Input;
import java.util.ArrayList;
import java.util.Iterator;

public class Task2 implements Debuggable {
    public Task2() {
    }

    public void invoke() {
        Input input = new Input();
        ArrayList<Integer> info = input.getInfo();
        System.out.println("Сотрудников зашло на предприятие:  " + counter(info));
    }

    private static int counter(ArrayList<Integer> values) {
        int count = 0;
        Iterator var2 = values.iterator();

        while(var2.hasNext()) {
            int i = (Integer)var2.next();
            if (i == 1) {
                ++count;
            }
        }

        return count;
    }
}
