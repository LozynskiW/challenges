package pl.javabasics.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplets {

    public static List<Integer[]> findAllZeroTriplets(int[] arr) {

        // new int[]{-2, -5, 4, 0, 1, 3, 2, -3, -1}
        //

        ArrayList<Integer[]> zeroTriplets = new ArrayList<>();

        int sum;
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {

            temp = arr[i] + arr[i+1];

            for (int j = 0; j < arr.length; j++) {

                if ((j != i) && (j != i+1)) {

                    sum = temp + arr[j];

                    if (sum == 0) {
                        zeroTriplets.add(new Integer[] {arr[i], arr[i+1], arr[j]});
                    }

                }
            }

        }

        return zeroTriplets;
    }

    public static void main(String[] args) {



        List<Integer[]> test = findAllZeroTriplets(new int[]{-2, -5, 4, 0, 1, 3, 2, -3, -1});

        test.forEach(integers -> {
            System.out.println(Arrays.toString(Arrays.stream(integers).toArray()));
        });
    }
}
