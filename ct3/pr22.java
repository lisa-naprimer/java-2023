public class pr22 {
    public double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    Triangle triangle = new Triangle();
    double area = triangle.calculateArea(3, 4, 5);
}