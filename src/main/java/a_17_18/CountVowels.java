package a_17_18;

import java.util.Locale;

public class CountVowels {

    /*
     * Написать метод, который посчитает количество гласных букв в строке.
     *
     * Для нахождения гласных букв использовать метод contains()
     * (гласные буквы - “a”, “e”, “i”, “o”, “u”)
     *
     * Test Data:
            “QA For Everyone” -> 6
            “Java lessons are fun” -> 7
     */

    public int countVowels(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase(Locale.ROOT).charAt(i) == 'a' ||
                    str.toLowerCase(Locale.ROOT).charAt(i) == 'e' ||
                    str.toLowerCase(Locale.ROOT).charAt(i) == 'i' ||
                    str.toLowerCase(Locale.ROOT).charAt(i) == 'o' ||
                    str.toLowerCase(Locale.ROOT).charAt(i) == 'u') {
                count++;
            }
        }

        return count;
    }

    public int countVowelsTwo(String str) {

        String vowels = "aeiou";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (str.toLowerCase(Locale.ROOT).charAt(i) == vowels.charAt(j)) {
                    count++;
                }
            }
        }

        return count;
    }
}
