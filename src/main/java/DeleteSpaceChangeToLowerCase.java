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
                result.append(str.toLowerCase(Locale.ROOT).charAt(i));
            }
        }

        return result.toString();
    }
}
