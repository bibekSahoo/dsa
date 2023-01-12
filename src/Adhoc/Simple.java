package Adhoc;

public class Simple {
    public static void main(String[] args) {
        int number = 21453;
        int count = 1;
        double sum = 0;
        while (number != 0) {
            int remainder = number % 10;
            double tenPower = Math.pow(10, (remainder - 1));
            sum = sum + (tenPower * count);
            number /= 10;
            count++;
        }
        System.out.println(sum);
    }
}
