public class DeleteSpaceChangeToUpperCase {

    /*
     * Написать метод, который переведет строку в upper case и уберет все ЛИШНИЕ пробелы
     *
     * Test Data:
     * “QA For  Everyone ” -> “QA FOR EVERYONE”
     * “ Java lessons  are fun” -> “JAVA LESSONS ARE FUN”
     */

    public String deleteSpaceChangeToUpperCase(String str) {

        String strNew = str.strip().toUpperCase();
        String result = "";

        for (int i = 0; i < strNew.length(); i++) {

            if (!(strNew.charAt(i) == ' ' && strNew.charAt(i - 1) == ' ')) {
                result += strNew.charAt(i);
            }
        }

        return result;
    }

}
