package a_19_20;

import java.util.Locale;

public class CreateNewString {

    /*
     * Задача 6
     * Даны две строки. Определите, можно ли из некоторых символов
     * первой строки составить вторую строку.
     *
     * Пример:
     * method( “QAForEveryone”, “Verona”) -> true
     * method( “QAForEveryone”, “frog”) -> false
     */

    public boolean createSecondString(String str1, String str2) {

        if (str1.length() < str2.length()) {
            return false;
        }

        StringBuilder str0 = new StringBuilder(str1.toLowerCase(Locale.ROOT));

        boolean isSymbolPresent = false;

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str0.length(); j++) {
                if (str2.toLowerCase(Locale.ROOT).charAt(i) == str0.charAt(j)) {
                    isSymbolPresent = true;
                    str0.deleteCharAt(j);
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
