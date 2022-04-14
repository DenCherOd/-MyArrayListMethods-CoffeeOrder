package myLiknkedListMethods;

import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedListMethods {
    public void addFirst(LinkedList<String> list, String word) {
        list.addFirst(word);
    }

    public void addLast(LinkedList<String> list, String word) {
        list.addLast(word);
    }

    public LinkedList<Integer> join(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> finalList = new LinkedList<>();
        finalList.addAll(list1);
        finalList.addAll(list2);
        return finalList;
    }

    public LinkedList<Integer> shuffle(LinkedList<Integer> list) {
        Collections.shuffle(list);
        return list;
    }

    public LinkedList<Integer> intersect(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> intersectList = new LinkedList<>();
        for (Integer i : list1) {
            if (!intersectList.contains(i) && list2.contains(i)) {
                intersectList.add(i);
            }
        }
        return intersectList;
    }
}