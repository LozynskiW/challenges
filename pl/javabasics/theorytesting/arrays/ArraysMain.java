package pl.javabasics.theorytesting.arrays;

import java.util.Collections;

public class ArraysMain {

    public static void main(String[] args) {

        ImmutableArray array = new ImmutableArray();

        array.getInts()[0] = 10;

        System.out.println(array);

        int[] arr1 = new int[] {};
        int[] arr2 = new int[5];
        int[] arr3;
    }
}
