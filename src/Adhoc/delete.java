package Adhoc;

 abstract class Employee {
    float  salary = 40000;
}

final  class  performer extends Employee {
    int bonus = 10000;
    static void newMethod(){
        System.out.println(new performer().bonus);
    }


}

 class delete {

    public static void main(String args[]) {
        performer p = new performer();
        Employee employee = new Employee() {
        };
        System.out.println(employee.salary);
        p.salary = 6;//Math
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}
