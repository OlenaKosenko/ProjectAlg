package a_19_20;

public class CheckUniqueSymbols {

    /*
     * Задача 5
     * Написать метод, который проверяет строку на уникальность символов в ней.
     * "AhdYk84>u" -> true
     * "kFy7ak" -> false
     */

    public boolean areSymbolsUnique(String str) {

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }
}
