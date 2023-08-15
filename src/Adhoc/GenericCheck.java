package Adhoc;

public class GenericCheck {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Integer lastNumber = getLastElement(numbers); // 5

        String[] names = {"Alice", "Bob", "Charlie"};
        String lastName = getLastElement(names); // "Charlie"
        temp(1, 2, 3);
    }
    public static < T1, T3, T2 > void temp(T1 x, T2 y, T3 z) {
        System.out.println("This is x =" + x);
        System.out.println("This is y =" + y);
        System.out.println("This is z =" + z);

    }

    // Generic Method
    public static <T> T getLastElement(T[] array) {
        if (array.length == 0) {
            return null;
        }
        return array[array.length - 1];
    }

}
