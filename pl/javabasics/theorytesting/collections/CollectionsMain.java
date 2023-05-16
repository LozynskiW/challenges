package pl.javabasics.theorytesting.collections;

import java.util.*;

public class CollectionsMain {

    public static void main(String[] args) {

        List<Integer> testList = new ArrayList<>();

        Vector<Integer> vectorTest = new Vector<>();

        Queue<Integer> queueTest = new PriorityQueue<>();

        queueTest.add(1);
        queueTest.add(2);

        System.out.println(queueTest.element());
        System.out.println(queueTest.peek());
        System.out.println(queueTest.poll());

        Deque<Integer> dequeTest = new ArrayDeque<>();

        Map<Point, String> pointStringMap = new HashMap<>();

        Point p1 = new Point(1);

        pointStringMap.put(p1, "Point 1");

        p1.setX(2);

        pointStringMap.put(p1, "Point 1-1");

        System.out.println(pointStringMap);

        p1.setX(1);
        Set<Point> pointSet = new HashSet<>();

        pointSet.add(p1);

        System.out.println("Original set p1.X = 1");
        System.out.println(pointSet);

        p1.setX(3);
        System.out.println("Does pointSet contains p1 after p1.X was changed?");
        System.out.println(pointSet.contains(p1));
        pointSet.add(p1);

        System.out.println("Set after adding p1 with p1.X = 3");
        System.out.println(pointSet);

        List<Point> pointList = new ArrayList<>();

        p1.setX(1);
        pointList.add(p1);
        System.out.println("Original list p1.X = 1");
        System.out.println(pointList);

        p1.setX(2);
        System.out.println("List after changing p1.X to 2");
        System.out.println(pointList);
    }
}
