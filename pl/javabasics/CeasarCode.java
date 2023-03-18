package pl.javabasics;

import java.util.ArrayList;

public class CeasarCode {

    private int n = 5;
    private final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private final StringBuilder alphabetStringBuilder = new StringBuilder(this.alphabet.toLowerCase());

    public String decode(String code) {

        StringBuilder decodedStringBuilder = new StringBuilder();

        int indexOfLetter;

        for (int i = 0; i < code.length(); i++) {

            indexOfLetter = alphabet.indexOf(String.valueOf(code.charAt(i)).toUpperCase());

            if ( (indexOfLetter - this.n) < 0 ) {

                decodedStringBuilder.append(alphabet.charAt(alphabet.length() - (this.n - indexOfLetter)));
            } else {

                decodedStringBuilder.append(alphabet.charAt(indexOfLetter-this.n));
            }

        }

        System.out.println(decodedStringBuilder.toString());
        return decodedStringBuilder.toString();
    }

    public static void main(String[] args) {

        CeasarCode test = new CeasarCode();

        test.decode("asdf");
    }
}
