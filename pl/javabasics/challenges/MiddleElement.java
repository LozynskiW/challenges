package pl.javabasics.challenges;

import java.util.ArrayList;
import java.util.Arrays;

public class MiddleElement {

    public static int getMiddleElement(int[] arr) {

        // new int[]{-2, -5, 4, 0, 1, 3, 2, -3, -1}

        int[] lower;
        int[] higher;

        for (int i = 1; i < arr.length-1; i++) {

            lower = Arrays.copyOfRange(arr, 0, i);
            higher = Arrays.copyOfRange(arr, i+1, arr.length);

            if ((Arrays.stream(lower).max().getAsInt() < arr[i]) && (Arrays.stream(higher).min().getAsInt() > arr[i])) {
                return i;
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        System.out.println(getMiddleElement(new int[]{-2, -5, -3, 0, 1, 3, 2, 3, 1}));

    }
}
