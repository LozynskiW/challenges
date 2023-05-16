package pl.javabasics.theorytesting.collections;

import java.util.HashMap;
import java.util.Map;

class MapsMain {

    public static void main(String[] args) {

        Map<Point, String> pointStringMap = new HashMap<>();

        Point p1 = new Point(1);
        Point p2 = new Point(1);

        pointStringMap.put(p1, "Point 1");

        p1.setX(2);

        System.out.println(pointStringMap);
        System.out.println(pointStringMap.get(p1));

        pointStringMap.put(p1, "Point 1-1");

        System.out.println(pointStringMap);

    }
}
