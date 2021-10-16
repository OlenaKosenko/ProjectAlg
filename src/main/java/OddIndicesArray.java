public class OddIndicesArray {

    /*
     * #3
     * Написать алгоритм, который принимает массив чисел, и возвращает массив значений нечетных индексов
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */
    public int[] oddIndicesArray(int[] array) {
        int[] newArray = new int[array.length / 2];
        int number = 1;

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[number];
            number += 2;
        }

        return newArray;
    }


}
