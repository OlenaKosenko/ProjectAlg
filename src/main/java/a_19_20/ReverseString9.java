package a_19_20;

public class ReverseString9 {

    /*
     * Task 9
     * Write a method that will take one string as an argument
     * and will return the reverse version of this string.
     * reverseStr("apple")  -> “elppa”
     */

    public String reverseString(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
