public class ZeroSum {

    /*
     * Написать алгоритм ZeroSum, который принимает на вход массив целых чисел
     * и возвращает массив из двух чисел, сумма которых равна 0.
     * Test Data:
     * {35, 23, 12, 89, -23, -48, 100}
     * Expected result = {23, -23}
     */

    public int[] zeroSum(int[] array) {

        int[] newArray = new int[2];

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++)
                if (array[i] + array[j] == 0) {
                    newArray[0] = array[i];
                    newArray[1] = array[j];
                    break;
                }
        }

        return newArray;
    }

    public int[] zeroSum2(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++)
                if (array[i] + array[j] == 0) {
                    return new int[]{array[i], array[j]};
                }
        }

        return new int[1];
    }


}
