package pl.javabasics.challenges;

import java.util.Arrays;

import static java.lang.Math.abs;

public class PairSumFinder {

    public static int[] getPairSumClosestTo(int[] arr, int val) {

        int sum;

        float test = Arrays.stream(arr).sum();

        int[] outputPair = new int[2];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) continue;

                sum = arr[i] + arr[j];

                if (abs(sum-val) < test) {

                    outputPair[0] = arr[i];
                    outputPair[1] = arr[j];
                    test = abs(sum-val);
                }

            }
        }
        return outputPair;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getPairSumClosestTo(new int[]{10, 22, 28, 29, 30, 40}, 54)));
    }
}
