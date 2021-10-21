public class SortedArray {

/*    Написать алгоритм SortedArray, который принимает массив чисел int[],
    и возвращает отсортированный массив

    Test Data:
    {12, 2, 3, 4, 5} -> {2, 3, 4, 5, 12}
    {-3, 0, 155, -39, 1003} -> {-39, -3, 0, 155, 1003}*/

    public int[] sortedArray(int[] array) {
        int[] sortedArray = new int[array.length];
        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    index = i;
                }
            }
            array[index] = Integer.MAX_VALUE;
            sortedArray[j] = min;
            min = Integer.MAX_VALUE;
         }

        return sortedArray;
    }
}
