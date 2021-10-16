public class SumOrSubtractionArray {

    /*
     * #4
     * Написать алгоритм, который возвращает сумму всех чисел от 1 до n,
     * если последовательность чисел возрастающая; и возвращает разницу всех чисел,
     * если последовательность чисел убывающая.
     *
     * Test Data:
     * n = 222;
     * Expected result = 24 753
     * n = -10;
     * Expected result = 56;
     */

    public int sumOrSubtractionArray(int n) {
        int result = 1;

        if (n == 1) {
            return result;
        } else if (n > 1) {
            for (int i = 2; i <= n; i++) {
                result += i;
            }
        } else if (n < 1) {
            for (int i = 0; i >= n; i--) {
                result -= i;
            }
        }

        return result;
    }
}
