package a_19_20;

public class NewString2 {

    /*
     * Задача 2
     * Напишите метод, который принимает строковый параметр и возвращает слово,
     * которое состоит из последних трех и первых трех букв слова-параметра,
     * если длина строки больше 5. Иначе метод возвращает слово, состоящее из
     * средней/средних буквы/букв слова-параметра, повторенных столько раз, какова длина строки.
     *
     * Пример:
     * method(“QAForEveryone”) -> “oneQAF”
     * method(“Java”) -> “avavavav”
     * method(“ABC”) -> “BBB”
     * method(“AB”) -> “ABAB”
     * method(“A”) -> “A”
     */

    public String newString(String str) {

        StringBuilder result = new StringBuilder();
        int length = str.length();

        if (length > 5) {
            for (int i = 3; i > 0; i--) {
                result.append(str.charAt(length - i));
            }
            for (int i = 0; i < 3; i++) {
                result.append(str.charAt(i));
            }
        } else {
            for (int i = 0; i < length; i++) {
                if (length % 2 == 0) {
                    result.append(str.charAt(length / 2 - 1)).append(str.charAt(length / 2));
                } else {
                    result.append(str.charAt(length / 2));
                }
            }
        }

        return result.toString();
    }
}
