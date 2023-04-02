package pl.javabasics.challenges;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static String getLongestSubstringWithoutRepeatingCharacters(String input) {

        Set<Character> characterSet = new HashSet<>();
        Set<Character> longestCharacterSet = new HashSet<>();

        StringBuilder stringBuilder = new StringBuilder(input);

        for (int i = 0; i < stringBuilder.length(); i++) {

            characterSet.add(stringBuilder.charAt(i));

            for (int j = i+1; j < stringBuilder.length()-1; j++) {

                if (characterSet.contains(stringBuilder.charAt(j))) break;
                else characterSet.add(stringBuilder.charAt(j));

            }

            if (characterSet.size() > longestCharacterSet.size()) {

                longestCharacterSet = Set.copyOf(characterSet);
            }

            characterSet.clear();

        }

        stringBuilder.delete(0, stringBuilder.length());

        for (char c : longestCharacterSet) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
