package Java8;

public class PredicateSample {
    public static void fibonacci(){
        int first = 0;
        int second = 1;
        int nextValue = first + second;
        System.out.println(first);
        System.out.println(second);

        while(nextValue < 25){
            System.out.println(nextValue);
            nextValue= first + second;// 2,3
            first = second;//3, 5
            second = nextValue;//5, 8, 13,
        }

    }

    public static void main(String[] args) {
        fibonacci();
    }
}
