package Rough;

abstract class test {
    abstract void checkThis();
}

public class Animal extends  test{

    @Override
    void checkThis() {
        System.out.println("Check this implemented..");
    }

    void checkNew(){
        System.out.println("Check this new....");
    }

}

class actual {
    public static void main(String[] args) {
        Animal test = new Animal();
        test.checkNew();

        Animal test1 = new Animal();
        test1.checkNew();
    }
}