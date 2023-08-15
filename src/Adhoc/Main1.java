package Adhoc;

class Parent {
    protected int number;

    public Parent() {
        number = 10;
    }

    public void printNumber() {
        System.out.println("Parent number: " + number);
    }
    public static void sprintNumber() {
        System.out.println("Parent number: static" );
    }
}

class Child extends Parent {
    private String name;

    public Child() {
        super();
        name = "John";
    }

    @Override
    public void printNumber() {
        System.out.println("Child number: " + number);
    }

    public void printName() {
        System.out.println("Child name: " + name);
    }
    public static void sprintNumber() {
        System.out.println("Child number: static   " );
    }
}

public class Main1 {
    public static void main(String[] args) {
        Parent child = new Child();
        child.printNumber(); // invokes overridden method in Child class
//        child.printName();
        child.sprintNumber();
    }
}
