package a_17_18;

public class DeleteSpaceChangeToUpperCase {

    /*
     * Написать метод, который переведет строку в upper case и уберет все ЛИШНИЕ пробелы
     *
     * Test Data:
     * “QA For  Everyone ” -> “QA FOR EVERYONE”
     * “ Java lessons  are fun” -> “JAVA LESSONS ARE FUN”
     */

    public String deleteSpaceChangeToUpperCase(String str) {

        if (str == null || str.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int startIndex = -1;
        int endIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                startIndex = i;
                break;
            }
        }

        if (startIndex == -1) {
            return "";
        }

        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) != ' ') {
                endIndex = i;
                break;
            }
        }

        for (int i = startIndex; i <= endIndex; i++) {
            if (!(str.charAt(i) == ' ' && str.charAt(i - 1) == ' ')) {
                if (str.charAt(i) > 96 && str.charAt(i) < 123) {
                    result.append((char) (str.charAt(i) - 32));
                } else {
                    result.append(str.charAt(i));
                }
            }
        }

        return result.toString();
    }


    public String deleteSpaceChangeToUpperCaseTwo(String str) {

        String strNew = str.strip().toUpperCase();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strNew.length(); i++) {
            if (!(strNew.charAt(i) == ' ' && strNew.charAt(i - 1) == ' ')) {
                result.append(strNew.charAt(i));
            }
        }

        return result.toString();
    }
}
