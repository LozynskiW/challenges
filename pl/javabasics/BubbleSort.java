package pl.javabasics;

import java.util.Arrays;

public class BubbleSort {

    public static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < array.length; j++) {

                if (array[j-1] > array[j]) {

                    array[j-1] = array[j-1] + array[j];
                    array[j] = array[j-1] -array[j];
                    array[j-1] = array[j-1] - array[j];

                }

            }

        }

        return array;
    }

    public static boolean isSorted(int[] array) {

        for (int i = 1; i < array.length; i++) {

            if (array[i] < array[i-1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] testArray = new int[]{100, 5, 2, 10, 8, 11, 0};

        System.out.println(Arrays.toString(BubbleSort.sortArray(testArray)));
    }
}
