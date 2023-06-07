import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите координаты точек");
        String coordinatesA = scanner1.nextLine();
        Triangle triangle = new Triangle(coordinatesA);
        System.out.println(triangle.findingTheBarycenterOfATriangle());
    }
}
ublic class Triangle {
    public static final int[] allCoordinates = new int[6];

    public Triangle(String coordinates) {
        char checkLetter;
        int checkDit = 0;
        int StringToDit;
        int forMass = 0;
        for (int i = 0; i < coordinates.length(); i++) {
            checkLetter = coordinates.charAt(i);
            if (checkLetter == ',') {
                StringToDit = Integer.parseInt(coordinates.substring(checkDit, i));
                allCoordinates[forMass] = StringToDit;
                checkDit = i + 2;
                forMass++;
            }
            if (i == coordinates.length() - 1) {
                StringToDit = Integer.parseInt(coordinates.substring(checkDit, i + 1));
                allCoordinates[forMass] = StringToDit;
                checkDit = i + 2;
            }
        }
    }

    public String findingTheBarycenterOfATriangle() {
        String result = "";
        double x0 = (((double) allCoordinates[0] + (double) allCoordinates[2] + (double) allCoordinates[4]) / 3);
        double y0 = (( (double) allCoordinates[1] + (double) allCoordinates[3] + (double) allCoordinates[5]) / 3);
        String x = String.format("%.4f", x0);
        String y = String.format("%.4f", y0);
        result += x + "," + y;
        return result;
    }
}

