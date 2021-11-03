package a_19_20;

public class UniqueLetters {

    /*
     * Задача 4
     * Написать метод, который принимает на вход строку букв,  и  возвращает строку,
     * в которой только уникальные буквы
     *
     * Пример:
     * method(“abcaczdbdakcazdbaz”) -> “abcdkz"
     */

    public String uniqueLetters(String str) {


        StringBuilder result = new StringBuilder();
        boolean isElementPresent = false;

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                for (int j = 0; j < result.length(); j++) {
                    if (str.charAt(i) == result.charAt(j)) {
                        isElementPresent = true;
                    }
                }
                if (!isElementPresent) {
                    result.append(str.charAt(i));
                } else {
                    isElementPresent = false;
                }
            }
        }

        return result.toString();
    }
}
