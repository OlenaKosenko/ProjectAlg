package a_17_18;

import java.util.Locale;

public class QorLetter {

    /*
     * Написать метод, который принимает на ход строку и печатает
     * все буквы “q”, “o” и “r” из этой строки:
     *
     * Test Data
     * “QAForEveryone”
     * “Java lessons are fun”
     */

    public void printLetters(String str) {

        String strLoweCase = str.toLowerCase(Locale.ROOT);

        for (int i = 0; i < str.length(); i++) {
            if (strLoweCase.charAt(i) == 'q' || strLoweCase.charAt(i) == 'o' || strLoweCase.charAt(i) == 'r') {
                System.out.println(str.charAt(i));
            }
        }
    }
}
