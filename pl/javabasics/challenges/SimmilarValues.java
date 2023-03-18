package pl.javabasics.challenges;

import java.util.Arrays;

import static java.lang.Math.pow;

public class SimmilarValues {

    public static int[] getThreeClosestElements(int[] arr1, int[] arr2, int[] arr3) {

        double variance;
        double mean;
        double test = Arrays.stream(arr1).sum();
        int[] testArr;
        int[] outputArr = new int[0];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr3.length; k++) {

                    testArr = new int[]{arr1[i], arr2[j], arr3[k]};

                    testArr = Arrays.stream(testArr).sorted().toArray();

                    mean = Arrays.stream(testArr).average().getAsDouble();

                    variance = (pow(testArr[0] - mean, 2)+pow(testArr[1] - mean, 2)+pow(testArr[2] - mean, 2));

                    variance = variance / testArr.length;

                    if (variance < test) {

                        test = variance;
                        outputArr = testArr.clone();
                    }

                }
            }
        }

        return outputArr;

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getThreeClosestElements(
                new int[]{1, 4, 10},
                new int[]{2, 15, 20},
                new int[]{10, 12})));
    }
}
