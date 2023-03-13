package Adhoc;

public class Recursive1ToN {
    void printN(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
//        System.out.println(n);
        printN(n-1);
        System.out.println(n);

    }

    public int solve(String A) {
        return checkPallindrome(A, 1, A.length());
    }

    public int checkPallindrome(String input, int start, int end){
        if( end <= start && input.charAt(start)==input.charAt(end) ){
            return 1;
        }
        if( end <= start && input.charAt(start)!=input.charAt(end) ){
            return 0;
        }
        return checkPallindrome(input, start+1, end - 1);
    }


    public int fact(int A) {
        if(A == 1){
            return 1;
        }
        return A * fact(A-1);
    }
    StringBuilder str = new StringBuilder();
    public String reverse(String inout, int lastIndex ){
        if(lastIndex == 0){
            return str.append(inout.charAt(lastIndex)).toString();
        }
        str.append(inout.charAt(lastIndex));
        return reverse(inout, lastIndex-1);
    }

    public void wordSolve(String input, String output){
        if(input.length() == 0){
            System.out.println(output);
            return;
        }
        String output1 = output;
        String output2 = output;
        output2 += input.charAt(0);
        input = input.substring(1);
        wordSolve(input,output1);
        wordSolve(input,output2);
    }
    public int solve(int A) {
        if( A < 10){
            if(A == 1){
                return 1;
            }
            return 0;
        }
        return solve(sum(A));
    }

    public int sum(int A){
        if (A == 0 ){
            return 0;
        }
        int quotient = A/10;
        int remainder = A % 10;
        return remainder + sum(quotient);
    }

    public static void main(String[] args) {
//        System.out.println(10/10);
//        System.out.println(10%10);
//        System.out.println(1/10);
        System.out.println(-1%10);
//        new Recursive1ToN().solve(83557);
//        new Recursive1ToN().wordSolve("aab", "");

    }

}
