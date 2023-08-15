package Problem;

import java.util.*;

public class ArrayListExercise {

    public static void main(String args[]) throws CloneNotSupportedException {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));

        for (Employee employee : list) {
            if (employee.age > 50) {
                System.out.println(employee);
            }
        }
        Iterator<Employee> itr = list.iterator();
        while(itr.hasNext()) {
            if(itr.next().country.equals("USA")) {
                itr.remove();
            }
        }

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.country.compareTo(o2.country);
            }
        });
        for (Employee employee : list) {
            System.out.println(employee);
        }
        CHECK.h.show();
        }

}

class  CHECK{

    static Hello h = new Hello() {
        public void show()
        {
            System.out.println(
                    "This is an anonymous class");
        }
    };

}

interface Hello {
    void show();
}

