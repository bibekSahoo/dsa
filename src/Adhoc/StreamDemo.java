package Adhoc;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StreamDemo {

    Map<Integer, Employee1> empMap = new HashMap<>();

    public void populateEmployee1() {
        empMap.put(123, new Employee1("Alex", 23, 12000));
    }

    public Optional<Employee1> getEmployee1(Integer Employee1Id) {
        // Before returning the Employee1 object we are wrapping it into an Optional
        return Optional.ofNullable(empMap.get(Employee1Id));
    }

    public static void main(String[] args) {
        StreamDemo demo = new StreamDemo();
        demo.populateEmployee1();
        Optional<Employee1> emp = demo.getEmployee1(123);
        emp.ifPresent(System.out::println);
    }
}

class Employee1 {
    String name;
    int age;
    int salary;

    Employee1(String name) {
        this.name = name;
    }

    Employee1(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}