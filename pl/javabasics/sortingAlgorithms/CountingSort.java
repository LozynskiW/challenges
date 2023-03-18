package pl.javabasics.sortingAlgorithms;

import java.util.Arrays;

public class CountingSort {

    public static int[] sort(int[] arr) {

        int[] countingArray = new int[Arrays.stream(arr).max().getAsInt()+1];
        int[] outputArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            countingArray[arr[i]] = countingArray[arr[i]] +1;

        }
        System.out.println(" 0, 1, 2, 3, 4, 5, 6, 7, 8, 9");
        System.out.println(Arrays.toString(countingArray));

        for (int i = 1; i < countingArray.length; i++) {

            countingArray[i] = countingArray[i-1] + countingArray[i];

        }

        System.out.println(Arrays.toString(countingArray));

        for (int i = 0; i < arr.length; i++) {

            outputArray[countingArray[arr[i]]-1] = arr[i];
            countingArray[arr[i]] -= 1;

        }

        return outputArray;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(CountingSort.sort(new int[]{1, 5, 2, 4, 4, 9, 7})));
    }
}
