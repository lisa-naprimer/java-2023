import Utils.Debuggable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main implements Debuggable {
    public Main() {
    }

    public void invoke() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение:");
        String num = scanner.nextLine();
        System.out.println(evaluate(num));
    }

    public static Double evaluate(String expression) {
        List<String> strList = new ArrayList();
        String[] var2 = expression.trim().split(" ");
        int var3 = var2.length;

        int index;
        for(index = 0; index < var3; ++index) {
            String listElement = var2[index];
            strList.add(listElement);
            strList.add(" ");
        }

        strList.remove(strList.size() - 1);
        List<String> stringList2 = new ArrayList();
        String[] var8 = expression.trim().split(" ");
        index = var8.length;

        int lastIndex;
        for(lastIndex = 0; lastIndex < index; ++lastIndex) {
            String element = var8[lastIndex];
            stringList2.add(element);
        }

        Double result;
        do {
            if (stringList2.size() == 0) {
                return Double.valueOf((String)stringList2.get(0));
            }

            result = 0.0;
            if (stringList2.indexOf("/") != -1) {
                index = stringList2.indexOf("/");
                result = Double.valueOf((String)stringList2.get(index - 1)) / Double.valueOf((String)stringList2.get(index + 1));
                stringList2.add(index - 1, String.valueOf(result));
                stringList2.remove(index + 2);
                stringList2.remove(index + 1);
                stringList2.remove(index);
            } else if (stringList2.indexOf("*") != -1) {
                index = stringList2.indexOf("*");
                result = Double.valueOf((String)stringList2.get(index - 1)) * Double.valueOf((String)stringList2.get(index + 1));
                stringList2.add(index - 1, String.valueOf(result));
                stringList2.remove(index + 2);
                stringList2.remove(index + 1);
                stringList2.remove(index);
            } else if (stringList2.indexOf("-") != -1) {
                index = stringList2.indexOf("-");
                lastIndex = stringList2.lastIndexOf("-");
                if (index == 0) {
                    result = 0.0 - Double.valueOf((String)stringList2.get(index + 1));
                    stringList2.add(0, String.valueOf(result));
                    stringList2.remove(2);
                    stringList2.remove(1);
                } else if (lastIndex - 2 > 0 && ((String)stringList2.get(lastIndex - 2)).equals("-")) {
                    result = Double.valueOf((String)stringList2.get(lastIndex + 1)) + Double.valueOf((String)stringList2.get(lastIndex - 1));
                    stringList2.add(lastIndex - 1, String.valueOf(result));
                    stringList2.remove(lastIndex + 2);
                    stringList2.remove(lastIndex + 1);
                    stringList2.remove(lastIndex);
                } else {
                    result = Double.valueOf((String)stringList2.get(index - 1)) - Double.valueOf((String)stringList2.get(index + 1));
                    stringList2.add(index - 1, String.valueOf(result));
                    stringList2.remove(index + 2);
                    stringList2.remove(index + 1);
                    stringList2.remove(index);
                }
            } else if (stringList2.indexOf("+") != -1) {
                index = stringList2.indexOf("+");
                result = Double.valueOf((String)stringList2.get(index - 1)) + Double.valueOf((String)stringList2.get(index + 1));
                stringList2.add(index - 1, String.valueOf(result));
                stringList2.remove(index + 2);
                stringList2.remove(index + 1);
                stringList2.remove(index);
            }
        } while(stringList2.indexOf("*") != -1 || stringList2.indexOf("/") != -1 || stringList2.indexOf("+") != -1 || stringList2.indexOf("-") != -1);

        return result;
    }
}
