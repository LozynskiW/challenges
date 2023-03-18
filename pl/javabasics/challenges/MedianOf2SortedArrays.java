package pl.javabasics.challenges;

import java.util.ArrayList;
import java.util.Arrays;

public class MedianOf2SortedArrays {

    public static double getMedian(int[] arr1, int[] arr2) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            arrayList.add(arr1[i]);
            arrayList.add(arr2[i]);

        }

        arrayList.sort((e1, e2) -> e1-e2);

        return 0.5 * (arrayList.get((int) (arrayList.size()/2)) + arrayList.get((int) (arrayList.size()/2) -1));
    }

    public static void main(String[] args) {

        System.out.println(getMedian(new int[]{1, 12, 15, 26, 38}, new int[]{2, 13, 17, 30, 45}));
    }
}
