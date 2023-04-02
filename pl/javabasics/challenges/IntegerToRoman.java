package pl.javabasics.challenges;

import java.util.*;

public class IntegerToRoman {

    private static final Map<Integer, List<String>> intToRomanMap = Map.of(
            4, List.of("M", "MM", "MMM"),
            3, List.of("C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"),
            2, List.of("X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"),
            1, List.of("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
    );

    public static String intToRoman(int num) {

        String numStr;
        StringBuilder output = new StringBuilder();
        int numPartIndex;

        while (num >0) {

            numStr = String.valueOf(num);

            numPartIndex = Integer.parseInt(String.valueOf(numStr.charAt(0)));

            output.append(intToRomanMap
                    .get(numStr.length())
                    .get(numPartIndex - 1));

            num -= numPartIndex * Math.pow(10,(numStr.length() -1));

        }

        return output.toString();
    }
}
