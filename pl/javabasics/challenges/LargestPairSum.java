package pl.javabasics.challenges;

public class LargestPairSum {

    public static int calculatePairSum(int[] arr) {

        // new int[]{-2, -5, 4, 0, 1, 3, 2, -3, -1}

        if (arr.length < 2) return -1;

        int largest = arr[0];
        int secondLargest = arr[1];

        if (arr.length == 2) return largest+secondLargest;

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] > secondLargest) {

                secondLargest = arr[i];

            }

            if (largest < secondLargest) {

                largest = largest + secondLargest;

                secondLargest = largest - secondLargest;

                largest = largest - secondLargest;
            }

        }

        return largest + secondLargest;
    }

    public static void main(String[] args) {

        System.out.println(LargestPairSum.calculatePairSum(new int[]{-2, -5, 5, 0, 1, 3, 2, -3, -1}));
    }
}
