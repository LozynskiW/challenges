package pl.javabasics.theorytesting.arrays;

import java.util.Arrays;

public class ImmutableArray {

    private final int[] ints = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8};

    public int[] getInts() {
        return ints;
    }

    @Override
    public String toString() {
        return "ImmutableArray?{" +
                "ints=" + Arrays.toString(ints) +
                '}';
    }
}
