package myLiknkedListMethods;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedListMethods myLinkedListMethods = new MyLinkedListMethods();
        LinkedList<String> myList1 = new LinkedList<>();
        myList1.add("banana");
        myList1.add("apple");
        myList1.add("melon");
        System.out.println(myList1);
        myLinkedListMethods.addFirst(myList1, "pineapple");
        System.out.println(myList1);

        myLinkedListMethods.addLast(myList1, "pineapple");
        System.out.println(myList1);

        LinkedList<Integer> myIntegerList1 = new LinkedList<>();
        myIntegerList1.add(1);
        myIntegerList1.add(2);
        myIntegerList1.add(2);
        myIntegerList1.add(4);
        myIntegerList1.add(5);

        LinkedList<Integer> myIntegerList2 = new LinkedList<>();
        myIntegerList2.add(6);
        myIntegerList2.add(7);
        myIntegerList2.add(7);
        myIntegerList2.add(9);
        myIntegerList2.add(10);

        System.out.println(myLinkedListMethods.join(myIntegerList1, myIntegerList2));

        System.out.println(myLinkedListMethods.shuffle(myLinkedListMethods.join(myIntegerList1, myIntegerList2)));

        LinkedList<Integer> ints1 = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<Integer> ints2 = new LinkedList<>(Arrays.asList(3, 2, 5, 7));
        System.out.println(myLinkedListMethods.intersect(ints1, ints2));
    }
}
