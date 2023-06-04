package Rough;

public class Parent {
    protected String name;
    protected int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class child1 extends Parent{
    public child1(String name, int age) {
        super(name, age);
    }
}