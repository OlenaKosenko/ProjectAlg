public class TwoSum {

/*    Написать алгоритм TwoSum, который принимает на вход массив целых чисел,
      и возвращает массив из двух ИНДЕКСОВ значений, сумма которых равна таргетному числу.

    Test Data:
    Input = {68, 5, 2, 100, 9, 12, 8}
    targetNumber = 10
    Expected Result =  {2, 6}

    Input = {1, 20, 40, 60, -40, -20, -1}
    targetNumber = -19
    Expected Result =  {0, 5}

    Input = {8, 5, 2, 0, 9, 12, 8}
    targetNumber = 12
    Expected Result =  {3, 5}*/

    public int[] twoSum(int[] array, int targetNumber) {
        int[] newArray = new int[2];

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetNumber) {
                    newArray[0] = i;
                    newArray[1] = j;
                    break;
                }
            }
        }

        return newArray;
    }

    public int[] twoSum2(int[] array, int targetNumber) {

        if (array != null) {

            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == targetNumber) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[1];
    }
}
