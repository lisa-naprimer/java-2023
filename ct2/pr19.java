public class pr19 {
    public static void main(String[] args) {
        for (int n = 0; n <= 100; n++) {
            int result = function(n);
            System.out.println("func(" + n + ") = " + result);
        }
    }

    public static int function(int n) {
        if (n==0) {
            return 0;
        } else if (n==1) {
            return 1;
        } else if (n % 2 ==0) {
            return function(n/2);
        } else {
            return function(n/2) + function(n/2 + 1);
        }
    }
}