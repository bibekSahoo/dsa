package Java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    static boolean isPersonEligibleForMembership(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }


    public static void main(String args[]) {
        Person person = new Person("Alex", 23);
        Predicate<Person> personPredicate = (person1) -> person1.age > 90;
        // Created a predicate. It returns true if age is greater than 18.
        Predicate<Person> greaterThanEighteen = (p) -> p.age > 18;
        // Created a predicate. It returns true if age is less than 60.
        Predicate<Person> lessThanSixty = (p) -> p.age < 60;

        Predicate<Person> predicate = greaterThanEighteen.and(lessThanSixty);

        boolean eligible = isPersonEligibleForMembership(person, predicate);
        System.out.println("Person is eligible for membership: " + eligible);

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
        System.out.println(stats);


        List<String> strings = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");

        int maxLength = strings.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);

    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}