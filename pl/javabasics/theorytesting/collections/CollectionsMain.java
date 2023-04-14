package pl.javabasics.theorytesting.collections;

import java.util.*;

public class CollectionsMain {

    public static void main(String[] args) {

        Map<String, Integer> testMap = new HashMap<>();

        List<Integer> testList = new ArrayList<>();

        Vector<Integer> vectorTest = new Vector<>();

        Queue<Integer> queueTest = new PriorityQueue<>();

        queueTest.add(1);
        queueTest.add(2);

        System.out.println(queueTest.element());
        System.out.println(queueTest.peek());
        System.out.println(queueTest.poll());

        Deque<Integer> dequeTest = new ArrayDeque<>();

    }
}
