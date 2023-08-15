package Java8;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 7, 15, 3);
        int secondSmallest = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println(pow(2,5));
    }

    public static int pow(int a, int n) {
        if(a == 0) return 1;
        if(n == 0) return 1;
        if(n%2 == 0){
            return pow(a, n/2) * pow(a, n/2);
        }else {
            return pow(a, n/2) * pow(a, n/2) * a;
        }
    }
}
