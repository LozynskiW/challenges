package pl.javabasics;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] array, int element) {

        int from = 0;
        int to = array.length;
        int currentIndex;
        int[] sortedArray;

        if (!BubbleSort.isSorted(array)) {

            sortedArray = BubbleSort.sortArray(array);
        } else {

            sortedArray = array;
        }

        System.out.println(Arrays.toString(sortedArray));

        while (true) {

            currentIndex = (int) ((to-from)/2) +from;

            if (sortedArray[currentIndex] == element) {
                break;
            }

            if (sortedArray[currentIndex] > element) {

                to = currentIndex;

            } else {

                from = currentIndex;
            }

            if (from == to) {
                break;
            }

        }

        return currentIndex;
    }

    public static void main(String[] args) {

        int[] testArray = new int[]{100, 5, 2, 10, 8, 11, 0};

        System.out.println(BinarySearch.binarySearch(testArray, 0));

    }
}
