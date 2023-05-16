package pl.javabasics.theorytesting.generics;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleGeneric <T, K, V extends Number>{
    private T type;
    private K key;
    private V value;
    private Map<K, V> map = new LinkedHashMap<>();

    public void addToMap(K key, V val) {

        this.map.put(key, val);

    }
}
