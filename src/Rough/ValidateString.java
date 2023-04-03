package Rough;

import java.util.HashMap;

public class ValidateString {
    public static void main(String[] args) {
        String name = "Bibek";
        System.out.println(name.compareTo("a"));
    }
}


class Generics {
    public static < T1, T2, T3 > void temp(T1 x, T2 y, T3 z) {
        System.out.println("This is x =" + x);
        System.out.println("This is y =" + y);
        System.out.println("This is z =" + z);

    }
    public static void main(String args[]) {
        temp(1, 2, 3);
        HashMap<Integer, Integer> hash = new HashMap<>();
        Test<Integer> ne = new Test<>(123);
    }
}

class Test<B>
{
    B obj;     // An object of type T is declared
    Test(B obj) // parameterized constructor
    {
        this.obj = obj;
    }
    public B getObject() // get method
    {
        return this.obj;
    }
}

