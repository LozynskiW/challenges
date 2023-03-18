package pl.javabasics.challenges;

import java.util.Arrays;

import static java.lang.Math.*;

public class KClosestElements {

    public static int[] findKClosestElements(int[] arr, int val, int k) {

        int[] window;
        int windowSum = Arrays.stream(arr).sum();

        int[] filteredArr = Arrays.stream(arr).filter(e-> e != val).toArray();

        int[] test = Arrays.stream(filteredArr).map(e -> abs(val - e)).toArray();

        for (int i = 0; i < filteredArr.length-k; i++) {

            window=Arrays.copyOfRange(test, i, i+k);

            if (Arrays.stream(window).sum() < windowSum) {
                windowSum = Arrays.stream(window).sum();
            }

            else {
                return Arrays.copyOfRange(filteredArr, i-1, i+k-1);
            }

        }

        return new int[k];
    }

    public static void main(String[] args) {

        int[] arr = new int[]{12, 16, 22, 30, 35, 39, 42,
                45, 48, 50, 53, 55, 56};

        System.out.println(Arrays.toString(findKClosestElements(arr, 35, 4)));

    }
}
