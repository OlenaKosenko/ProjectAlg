public class CompareSumOfElements {

/*    Напишите метод, который принимает массив целых положительных чисел
            (в массиве четное количество элементов), и возвращает true,
    если сумма чисел в первой половине массива больше суммы чисел
    во второй половине массива. Иначе возвращается false
    Test Data:
    Input = {4, 6, 3, 7, 1, 2}
    Expected Result = true

    Input = {12, 48, 15, 125}
    Expected Result = false*/

    public boolean isFirstHalfGreater(int[] array) {
        if (array.length % 2 != 0) {
            return false;
        }

        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                sumFirstHalf += array[i];
            } else {
                sumSecondHalf += array[i];
            }
        }

        return sumFirstHalf > sumSecondHalf;
    }
}