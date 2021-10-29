public class OddIndices {

    /*
     * Написать метод, который принимает строку и возвращает строку,
     * которая состоит только из букв на нечетных индексах
     * (для построения новой строки использовать метод concat() или просто +):
     *
     * Test Data:
     * “QAForEveryone” -> “AoEeyn”
     * “JavaLessonsAreFun” -> “aaesnAeu”
     */
    public String oddIndices(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                result += str.charAt(i);
            }
        }

        return result;
    }

    public StringBuilder oddIndices2(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                result.append(str.charAt(i));
            }
        }

       return result;
    }

}
