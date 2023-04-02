package pl.javabasics.challenges;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class AddTwoNumbers {

    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {

        StringBuilder num = new StringBuilder();

        LinkedList[] test = new LinkedList[] {l1, l2};
        LinkedList<Integer> outputList = new LinkedList<>();

        int size;
        ArrayList<Integer> numbersToAdd = new ArrayList<>();

        for (LinkedList l : test) {
            size = l.size();

            for (int i = 0; i < size; i++) {

                num.append(l.pop());

            }

            num.reverse();

            numbersToAdd.add(Integer.parseInt(num.toString()));
            num.delete(0, num.length());
        }

        int valToReturn = numbersToAdd.stream().reduce((m,n) -> m+n).get();

        num.append(valToReturn);

        num.reverse();

        for (int i = 0; i < num.length(); i++) {

            outputList.add(Integer.parseInt(String.valueOf(num.charAt(i))));
        }

        return outputList;
    }
}
