package a_19_20;

import java.util.Locale;

public class Palindrome10 {
    /*
     * Task 10
     * a) Write a method that will take a string as an argument.
     * The method will return a palindrome. A palindrome is a word, phrase,
     * number, or sequence of words that reads the same backward as forward.
     * method(“А роза упала на лапу Азора”) -> “арозА упал ан алапу азор А” или  “а розА упала на лапу азорА”
     *
     * b) Написать метод, который проверяет, является ли слово палиндромом.
     * method(“Madam”) -> true это палиндром
     * method(12321) -> true
     */

    public String palindrome(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public boolean isPalindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(str.length() - (i + 1))) {
                return false;
            }
        }

        return true;
    }
}