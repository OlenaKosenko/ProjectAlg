package a_19_20;

public class NonRepeatingLength8 {

    /*
     * Задача 8
     * Find the non-repeating length of the longest substring in a string
     * Example: aabcb -> Output expected: 3
     * Example2: aaaaa -> Output expected: 1
     */

    public String nonRepeatingLength(String str) {

        StringBuilder subString = new StringBuilder();
        int maxLength = 0;
        boolean isLetterPresent = false;
        int indexOfSameLetter = -1;
        String maxSubstring = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < subString.length(); j++) {
                if (str.charAt(i) == subString.charAt(j)) {
                    isLetterPresent = true;
                    indexOfSameLetter = j;
                    break;
                } else {
                    isLetterPresent = false;
                }
            }
            if (!isLetterPresent) {
                subString.append(str.charAt(i));
            } else {
                if (subString.length() > maxLength) {
                    maxLength = subString.length();
                    maxSubstring = subString.toString();
                }
                for (int j = indexOfSameLetter; j > 0; j--) {
                    subString.deleteCharAt(j);
                }
            }
        }
        System.out.println();
        return maxSubstring;
    }
}
