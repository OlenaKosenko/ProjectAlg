import java.util.Arrays;

public class LongestSubsequence {

/*    Написать метод, который принимает на вход массив чисел 0 и 1,
    и возвращает самую длинную последовательность единиц из входящего массива
    Test Data:
    Input = {1, 1, 1, 0, 0, 0, 1, 1}
    Expected Result = {1, 1, 1}

    Input = {1, 0, 1, 1, 0, 1}
    Expected Result = {1, 1}*/

    public int[] longestSubsequence(int[] array) {
        int number = array[0];
        int count = 1;
        int maxCount = 1;
        int longestSubsequenceNumber = 0;

        for (int i = 1; i < array.length; i++) {
            if (number == array[i]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    longestSubsequenceNumber = array[i];
                }
            } else {
                count = 1;
                number = array[i];
            }
        }

        int[] newArray = new int[maxCount];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = longestSubsequenceNumber;
        }

        return newArray;
    }
}
