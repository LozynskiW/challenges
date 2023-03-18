package pl.javabasics.challenges;

import static java.lang.Math.pow;

public class ArmstrongNumber {

    public static boolean isArmstrongNumber(int val) {

        String valString = String.valueOf(val);

        char[] charsVal = valString.toCharArray();

        int armstrongVal = 0;

        for (char c : charsVal) {

            int temp = Integer.valueOf(String.valueOf(c));

            armstrongVal += pow(temp, charsVal.length);

        }

        return armstrongVal == val;
    }

    public static void main(String[] args) {

        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(12));

    }
}
