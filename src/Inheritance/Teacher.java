package Inheritance;

class Parent {
    public static String name = "bibek";
    static void show()
    {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    int name = 56;

    static void show() {
        System.out.println("child show()");
    }

}
public class Teacher {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child.show();
    }
}


