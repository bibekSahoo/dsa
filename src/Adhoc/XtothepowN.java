package Adhoc;

public class XtothepowN {
    public static int xtopow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        return x * xtopow(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(xtopow(5, 5));
    }
}
