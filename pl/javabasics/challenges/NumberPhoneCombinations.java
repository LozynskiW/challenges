package pl.javabasics.challenges;

import java.util.*;

public class NumberPhoneCombinations {

    private static Map<Integer, List<Character>> lettersForPhoneButton = Map.of(
            2, List.of('a', 'b', 'c'),
            3, List.of('d', 'e', 'f'),
            4, List.of('g', 'h', 'i'),
            5, List.of('j', 'k', 'l'),
            6, List.of('m', 'n', 'o'),
            7, List.of('p', 'q', 'r', 's'),
            8, List.of('t', 'u', 'v'),
            9, List.of('w', 'x', 'y', 'z')
    );

    public static String[] getAllCombinations(String digits) {

        StringBuilder stringBuilder = new StringBuilder(digits);

        int num;
        char c;

        String[] combinations = new String[(int) Math.pow(3, digits.length())];

        for (int i = 0; i < stringBuilder.length(); i++) {

            num = Integer.parseInt(String.valueOf(stringBuilder.charAt(i)));

            for (int j = 0; j < lettersForPhoneButton.get(num).size(); j++) {

                c = lettersForPhoneButton.get(num).get(j);

                combinations[3*j + 3*i] += String.valueOf(c);
                combinations[3*j + 1] += String.valueOf(c);
                combinations[3*j + 2] += String.valueOf(c);

            }

        }

        return combinations;

    }
}
