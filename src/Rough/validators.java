package Rough;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class Person{
    String firstName;
    long employeeNumber;
}
public class validators {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("bibek", 9000L));
        persons.add(new Person("sohum", 90000L));
        List<Person> finalData = persons.stream().filter(each -> each.getEmployeeNumber() > 9000L).toList();
        System.out.println(finalData);
    }
}
