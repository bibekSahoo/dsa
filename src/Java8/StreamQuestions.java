package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestions {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,10,80,40,90,80,33,90,80,12);
        List<String> strings = List.of("bibek", "apple", "orange", "grapes", "banana");

        int sumOfEvenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)  // Filter out odd numbers
                .mapToInt(Integer::intValue)       // Convert to int
                .sum();                             // Calculate the sum

        // Find strings starts with 'A'
        long count = strings.stream().filter(s-> s.startsWith("A")).count();

//        Given a list of integers, write a Java program to find the average of all the numbers.

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);


//        Given a list of strings, write a Java program to find the length of the longest string.

        int maxLength = strings.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);


//        Given a list of integers, write a Java program to find the product of all the numbers.
        long product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("procduct: "+product);

//        Given a list of strings, write a Java program to concatenate all the strings into a single string.
        String result = strings.stream()
                .reduce("", (a, b) -> a + b);


//        Given a list of integers, write a Java program to find the maximum number.
        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);

//        Given a list of strings, write a Java program to find the number of strings that have a length greater than 5.
        long count1 = strings.stream()
                .filter(s -> s.length() > 5)
                .count();

//        find the sum of the squares of all the numbers.
        int sumOfSquares = numbers.stream()
                .mapToInt(n -> n * n)
                .sum();


//        Given a list of strings, write a Java program to find the average length of the strings.
        double averageLength = strings.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0.0);

//        Given a list of integers, write a Java program to find the second smallest number.
        int secondSmallest = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);

//        Given a list of strings, write a Java program to convert each string to uppercase.
                List<String> uppercaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

//        Given a list of strings, write a Java program to find the number of strings that have the letter 'a' at the second position.
        long count2 = strings.stream()
                .filter(s -> s.length() > 1 && s.charAt(1) == 'a')
                .count();

//        Given a list of integers, write a Java program to find the product of all the positive numbers.
        int productOfPositiveNumbers = numbers.stream()
                .filter(n -> n > 0)
                .reduce(1, (a, b) -> a * b);

//        Given a list of integers, write a Java program to find the second largest number.
        int secondLargest = numbers.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElse(0);



        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str = String.valueOf(charArray);


//        Print duplicate value from list:
        numbers.stream().filter(i -> numbers.stream().filter(j -> j == i).count() > 1)
                .distinct().forEach(System.out::println);

    }
}
