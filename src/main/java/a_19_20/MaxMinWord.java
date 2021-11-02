package a_19_20;

import java.util.ArrayList;
import java.util.List;

public class MaxMinWord {

    /*
     * Задача 3
     * Напишите метод, который в строке находит слова минимальной и
     * максимальной длины, и количество слов одинаковой длины (максимально одинаковой).
     *
     * “What a wonderful day!” -> [“a”, “wonderful”, “0”]
     * “I love to learn Java!” -> [“I”, “learn”, “2”]
     */

    public List<String> maxMinWord(String str) {

        List<String> result = new ArrayList<>();
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;
        StringBuilder word = new StringBuilder();
        String minLengthWord = "";
        String maxLengthWord = "";

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                word.append(str.charAt(i));

            } else {

                if (word.length() > maxLength) {
                    maxLength = word.length();
                    maxLengthWord = word.toString();
                }
                if (word.length() < minLength) {
                    minLength = word.length();
                    minLengthWord = word.toString();
                }

                word.setLength(0);
            }
        }

        result.add(minLengthWord);
        result.add(maxLengthWord);

        return result;
    }
}
