package Adhoc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Printer <T extends String>{
    T value;

    public Printer(T value) {
        this.value = value;
    }

    public void print(){
        System.out.println("Printing...");
    }
}

class fgh{
    public static void main(String[] args) {
        Printer<String> printer = new Printer<>("");
        printer.print();
    }
}

class dataP{
    int number;
    int age;

    public dataP(int number, int age) {
        this.number = number;
        this.age = age;
    }
}
 class PassByValueExample {
    public static void main(String[] args) throws UniqueException {
        int number = 10;
        dataP kjhj = new dataP(10, 29);
        System.out.println("Before calling modifyValue method: "+  number);
        System.out.println("age "+  kjhj.age);
        modifyValue(number,kjhj);
        System.out.println("After calling modifyValue method: " + number);
        System.out.println("age "+  kjhj.age);

    }

    @MyAnnotation.MyAnnotationMethod
    public static void modifyValue(int value, dataP uiiui) throws UniqueException {
        value = 20;
        uiiui.age = 90;
        System.out.println("Inside modifyValue method: " + value);
        try {
            int i = 90/0;
        } catch (Exception e) {
            throw new UniqueException("sdads");
        }
    }
}


class UniqueException extends Exception{

    UniqueException(String message){
        super(message);
    }
}


class MyAnnotation{
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public @interface MyAnnotationMethod{

    }
}
