package pl.javabasics.challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepetitiveCharactersPrinter {

    public static void printAllRepeatedCharactersFromString(String str) {

        Map<Character, Integer> charsHistogram = new HashMap<>();

        for (char c : str.toCharArray()) {

            if (charsHistogram.containsKey(c)) {

                int oldCal = charsHistogram.get(c);

                charsHistogram.replace(c, oldCal+1);

            } else {
                charsHistogram.put(c, 1);
            }
        }

        Set<Character> repeatedChars = new HashSet<>();

        for (char key : charsHistogram.keySet()) {

            if (charsHistogram.get(key) > 1) repeatedChars.add(key);

        }

        System.out.println(repeatedChars);
    }

    public static void main(String[] args) {

        printAllRepeatedCharactersFromString("Repeateda");
        printAllRepeatedCharactersFromString("Revenga");
        printAllRepeatedCharactersFromString("When angels are forced out of haven they become devils");

    }
}
