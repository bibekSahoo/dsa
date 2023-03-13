package Adhoc;

import java.util.ArrayList;

public final class XtothepowN {
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
        ArrayList<Integer> values = new ArrayList<>();
        values.add(8);
        values.add(8);
        int ans = (int) Math.pow(2, 6);
        System.out.println(xtopow(5, 5));
    }
}
