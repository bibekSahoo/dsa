package Adhoc;


class LoadValue {
    private int size;
    private static int count = 0;

    LoadValue() {
        count++;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static int getCount() {
        return count;
    }

//    public static void setCount(int count) {
//        LoadValue.count = count;
//    }
}

public class tashdasdjhad {
    public static void main(String[] args) {
        LoadValue loadValue1 = new LoadValue();
        loadValue1.setSize(20);
        System.out.println(LoadValue.getCount());

        LoadValue loadValue2 = new LoadValue();
        loadValue2.setSize(23);
        System.out.println(LoadValue.getCount());

        LoadValue loadValue3 = new LoadValue();
        loadValue3.setSize(30);
        System.out.println(LoadValue.getCount());

        LoadValue loadValue4 = new LoadValue();
        loadValue4.setSize(40);
        System.out.println(LoadValue.getCount());



    }
}
