package Adhoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Variation {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Getting ListIterator
        ListIterator<Integer> listIterator = list.listIterator();
        Collections.sort(list);

        // Traversing elements
        System.out.println("Forward Direction Iteration:");
        while (listIterator.hasNext()) {
            System.out.println("Next element is " + listIterator.next() +
                    " and next index is " + listIterator.nextIndex());

        }
    }
}

