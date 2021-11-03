package a_19_20;

import java.util.Locale;

public class Anagram11 {

    /*
     * Task 11
     * Write a method, which checks if two given strings are Anagram of each other.
     * Two String is said to be an anagram of each other, if they contain exactly
     * the same characters but in a different order.
     *
     * Пример:
     * method("O, Draconian devil!", "!Leonardo Da Vinci,")  -> true
     * method("Oh, lame saint!", "The Mona Lisa,!") -> true
     */

    public boolean anagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        boolean isSymbolPresent = false;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.toLowerCase(Locale.ROOT).charAt(i) == str2.toLowerCase(Locale.ROOT).charAt(j)) {
                    isSymbolPresent = true;
                    break;
                }
            }

            if (!isSymbolPresent) {
                return false;
            } else {
                isSymbolPresent = false;
            }
        }

        return true;
    }


}
