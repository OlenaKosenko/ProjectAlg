public class MaxMinAvg {

    /*
     * #5
     * Написать алгоритм, который принимает массив чисел int[]
     * и возвращает массив,
     * который содержит максимальное число, минимальное число и среднее.
     *
     * Test Data:
     * {1, 2, 3, 4, 5} -> {5, 1, 3}
     * {-3, 0, 155, -39, 1003} -> {1003, -39, 223}
     */

    public int[] maxMinAvg(int[] array) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            sum += array[i];
        }

        int avg = sum / array.length;

        return new int[]{max, min, avg};
    }
}
