package a_17_18;

import java.util.Locale;

public class DeleteSpaceChangeToLowerCase {

    /*
     * Написать метод, который удалит все пробелы из входящей строки, и заменит все большие буквы на маленькие.
     *qaforeveryone
     * Test Data:
     * “QA For  Everyone ” -> “qaforeveryone”
     * “ Java lessons  are fun” -> “javalessonsarefun”
     */

    public String deleteSpaceChangeToLowerCase(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (str.charAt(i) > 64 && str.charAt(i) < 91) {
                    result.append((char) (str.charAt(i) + 32));
                } else {
                    result.append(str.charAt(i));
                }
            }
        }

        return result.toString();
    }

    public String deleteSpaceChangeToLowerCaseTwo(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result.append(str.toLowerCase(Locale.ROOT).charAt(i));
            }
        }

        return result.toString();
    }
}
