package Recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); // Read a line of text input
        reverseThisString(name,name.length()-1);// Bibek
        // bibek #k bibe #e bib #b bi #i b #b

    }

    private static void reverseThisString(String name, int charAt) {
        if (charAt < 0){
            return;
        }
        System.out.print(name.charAt(charAt));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        reverseThisString(name, charAt - 1);
    }
}
