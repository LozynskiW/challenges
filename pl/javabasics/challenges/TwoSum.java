package pl.javabasics.challenges;

public class TwoSum {

    public static int[] pointTwoSumNumbers(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > target) continue;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) continue;

                if (nums[i] + nums[j] == target) return new int[] {nums[i], nums[j]};
            }
        }

        return new int[]{};

    }
}
