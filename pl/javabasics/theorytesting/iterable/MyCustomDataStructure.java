package pl.javabasics.theorytesting.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCustomDataStructure implements Iterable<MyCustomObject> {

    private final List<MyCustomObject> data = new ArrayList<>();
    private int dataSize;

    public void add(MyCustomObject obj) {

        this.data.add(obj);
        dataSize = data.size();
    }

    @Override
    public Iterator<MyCustomObject> iterator() {
        return new MyCustomDataStructureIterator();
    }

    public class MyCustomDataStructureIterator implements Iterator<MyCustomObject> {

        private int cursor;
        private MyCustomObject lastReturned = null;

        @Override
        public boolean hasNext() {
            return this.cursor <= dataSize-1;
        }

        @Override
        public MyCustomObject next() {

            return getNextElement();
        }

        private MyCustomObject getNextElement() {

            int current = this.cursor;

            MyCustomObject nextElement = data.get(current);

            lastReturned=nextElement;

            this.cursor+=1;

            return nextElement;
        }
    }
}
