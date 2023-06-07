import Utils.Debuggable;

public class pr49 implements Debuggable {
    public pr49() {
    }

    public void invoke() {
        System.out.println(this.fusc(0));
        System.out.println(this.fusc(1));
        System.out.println(this.fusc(4));
        System.out.println(this.fusc(5));
    }

    private int fusc(int n) {
        if (n != 0 && n != 1) {
            return n % 2 == 0 ? this.fusc(n / 2) : this.fusc((n - 1) / 2) + this.fusc((n + 1) / 2);
        } else {
            return n;
        }
    }
}
