package pl.javabasics.challenges;

import objects.VariablesInit;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println(Arrays.toString(TwoSum.pointTwoSumNumbers(new int[] {2, 3, 6, 7, 1, 0}, 6)));

        System.out.println(AddTwoNumbers.addTwoNumbers(new LinkedList<>(Arrays.asList(0, 2, 3)), new LinkedList<>(Arrays.asList(0, 0, 1))));

        System.out.println(LongestSubstring.getLongestSubstringWithoutRepeatingCharacters("abcabcbb"));

        Integer integer = new Integer(1);

        VariablesInit variablesInit = new VariablesInit();

        int[] nums1 = new int[] {1, 3, 5};
        int[] nums2 = new int[] {2, 4};

        System.out.println(MedianOfTwoSortedArrays.median(nums1, nums2));

        System.out.println(IntegerToRoman.intToRoman(2166)); //MMCLXVI
        System.out.println(IntegerToRoman.intToRoman(2014)); //MMXIV
        System.out.println(IntegerToRoman.intToRoman(1025)); //MXXV
        System.out.println(IntegerToRoman.intToRoman(1009)); //MIX
        System.out.println(IntegerToRoman.intToRoman(900)); //CM
        System.out.println(IntegerToRoman.intToRoman(95)); //XCV

        System.out.println(Arrays.toString(NumberPhoneCombinations.getAllCombinations("23")));
    }
}
