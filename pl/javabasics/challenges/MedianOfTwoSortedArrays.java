package pl.javabasics.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class MedianOfTwoSortedArrays {

    public static double median(int[] nums1, int[] nums2) {

        int[] nums = new int[nums1.length+ nums2.length];

        int nums1CurrentIndex = 0;
        int nums2CurrentIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums1[nums1CurrentIndex] > nums2[nums2CurrentIndex]) {

                nums[i] = nums2[nums2CurrentIndex];
                nums2CurrentIndex++;
            } else {

                nums[i] = nums1[nums1CurrentIndex];
                nums1CurrentIndex++;
            }

            if (nums1CurrentIndex == nums1.length) nums1CurrentIndex--;
            if (nums2CurrentIndex == nums2.length) nums2CurrentIndex--;
        }

        if (nums.length %2 != 0) return nums[nums.length/2];

        else {
            return (nums[nums.length/2 -1] + nums[nums.length/2 +1])/2.0;
        }
    }
}
