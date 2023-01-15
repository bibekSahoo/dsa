package Adhoc;

public class fibonacci {
    public static void printFibonacci(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a + b ;
        System.out.print(c);
        System.out.print("\t");
        printFibonacci(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a);
        System.out.print("\t");
        System.out.print(b);
        System.out.print("\t");
        int n = 7;
        printFibonacci(a, b , n-2);
    }
}
