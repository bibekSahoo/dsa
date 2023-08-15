package Problem;

public class Employee {

    String name;
    int age;
    String country;

    public Employee(String name, int age, String country) {
        super();
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Employee(Employee employee) {
        this(employee.name, employee.age, employee.country);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        return new Employee(this);
    }
}