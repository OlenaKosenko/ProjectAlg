public class ChangeZeroToO {

    /*
     * Написать метод, который принимает строку и заменяет все цифры 0 на букву “o”.
     *
     * Test Data:
     * “QAF0rEvery0ne” -> “QAForEveryone” ”
     * “Java less0ns are fun” -> “Java lessons are fun”
     */

    public String changeZeroToO(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                result.append("o");
            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
