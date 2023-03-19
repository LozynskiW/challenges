package pl.javabasics.sortingAlgorithms;

import java.util.Arrays;

public class ShellSort {

    public static int[] sort(int[] arr) {

        int distance = arr.length/2;

        for (int dist = arr.length/2; dist >= 1; dist/=2) {

            for (int i = 0; i < arr.length/dist; i+=dist) {

                for (int j = i; j < arr.length; j+=dist) {

                    if (arr[i] > arr[j]) {

                        arr[i] += arr[j];
                        arr[j] = arr[i] - arr[j];
                        arr[i] = arr[i] - arr[j];

                    }

                }
                
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 16, 4, 1, 10, 13, 11, 71};

        System.out.println(Arrays.toString(ShellSort.sort(arr)));

    }
}
