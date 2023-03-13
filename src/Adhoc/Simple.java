package Adhoc;

public class Simple {
    int sum(int number ){
        if(number == 1){ return  1;}
        return sum(number-1)+ number;
    }
    public static void main(String[] args) {
//        int number = 21453;
//        int count = 1;
//        double sum = 0;
//        while (number != 0) {
//            int remainder = number % 10;
//            double tenPower = Math.pow(10, (remainder - 1));
//            sum = sum + (tenPower * count);
//            number /= 10;
//            count++;
//        }
//        System.out.println(sum);
        System.out.println(new Simple().sum(3));

    }
}
