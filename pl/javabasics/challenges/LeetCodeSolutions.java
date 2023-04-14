package pl.javabasics.challenges;

import java.util.*;
import java.util.stream.Collectors;

//leetcode.com
public class LeetCodeSolutions {

    //https://leetcode.com/problems/removing-stars-from-a-string/
    public static String removeStars(String s) {

        if (Objects.equals(s, "")) return s;

        StringBuilder stringBuilder = new StringBuilder(s);

        if (stringBuilder.charAt(0) == '*') stringBuilder.deleteCharAt(0);

        int i = 1;

        while (i < stringBuilder.length()) {

            if (stringBuilder.charAt(i) == '*') {
                stringBuilder.deleteCharAt(i-1); //deletes char to the left
                stringBuilder.deleteCharAt(i-1); //deletes star
                i=1;

            } else {

                i++;
            }
        }
        return stringBuilder.toString();
    }

    //https://leetcode.com/problems/container-with-most-water/
    public static int maxArea(int[] height) {

        if (height.length <2) return 0;

        Set<Integer> possibleAreas = new HashSet<>();

        int lowerContainerWall;

        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {

                if (i == j) continue;

                if (height[i] > height[j]) lowerContainerWall = height[j];
                else lowerContainerWall = height[i];

                possibleAreas.add(lowerContainerWall * (j-i));
            }
        }

        return possibleAreas.stream().max(Comparator.comparingInt(m -> m)).orElse(0);
    }

    public static int threeSumClosest(int[] nums, int target) {

        Set<Integer> sums = new TreeSet<>();

        int difference = target;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (i == j) continue;

                for (int k = 0; k < nums.length; k++) {

                    if ((j == k) || (i == k)) continue;

                    sums.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        List<Integer> sumsList = new ArrayList<>(sums);
        List<Integer> differences = sums.stream().map(e -> Math.abs(e-target)).collect(Collectors.toList());

        Map<Integer, Integer> sumsWithDifferenceToTarget = new HashMap<>();

        for (int i = 0; i < sumsList.size(); i++) {
            sumsWithDifferenceToTarget.put(differences.get(i), sumsList.get(i));
        }

        int closestElementDiff = differences.stream().min(Integer::compareTo).get();

        return sumsWithDifferenceToTarget.get(closestElementDiff);
    }
}
