package a_17_18;

public class CountSpace {

    /*
     * Написать метод, который принимает строку, и возвращает
     * количество пробелов в этой строке
     *
     * Test Data:
     * “QA For Everyone” -> 2
     * “Java lessons  are fun” -> 4
     */

    public int countSpace(String str) {

        if (str == null || str.length() == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
