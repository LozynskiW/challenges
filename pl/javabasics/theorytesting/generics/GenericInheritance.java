package pl.javabasics.theorytesting.generics;

public class GenericInheritance<T, K, V extends Number> extends SimpleGeneric<T, K, V>{

    public void addToMapOrNotToAdd(K key, V val) {
        super.addToMap(key, val);
    }
}
