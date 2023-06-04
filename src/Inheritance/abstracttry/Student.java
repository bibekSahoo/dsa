package Inheritance.abstracttry;

public class Student extends User{
    public Student(String name) {
        super(name);
    }

    @Override
    void login() {
        System.out.println("Student login.");
    }
}

class implementor{
    public static void main(String[] args) {
        User user = new Student("Bibek");
        user.login();
    }
}
