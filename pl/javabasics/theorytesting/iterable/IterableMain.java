package pl.javabasics.theorytesting.iterable;

import java.util.Iterator;

public class IterableMain {

    public static void main(String[] args) {

        MyCustomObject obj1 = new MyCustomObject(1, "test1");
        MyCustomObject obj2 = new MyCustomObject(1, "test2");
        MyCustomObject obj3 = new MyCustomObject(1, "test3");

        MyCustomDataStructure dataStructure = new MyCustomDataStructure();

        dataStructure.add(obj1);
        dataStructure.add(obj2);
        dataStructure.add(obj3);

        Iterator<MyCustomObject> iterator = dataStructure.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
