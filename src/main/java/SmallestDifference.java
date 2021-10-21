public class SmallestDifference {

    /*    Написать алгоритм SmallestDifference, который принимает на вход массив целых чисел
    и возвращает ту пару чисел, абсолютная разница между которыми наименьшая

    Test Data:
    Input = {8, 5, 2, 0, 9, 12, 8}
    Expected Result =  {9, 8}

    Input = {8, -55, 2, -54, -12}
    Expected Result =  {-55, -54}*/

    public int[] smallestDifference(int[] array) {

        if (array.length == 2) {
            return array;
        }

        int[] newArray = new int[2];
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                int absDifference = Math.abs(array[i] - array[j]);

                if (absDifference < minDifference) {
                    minDifference = absDifference;
                    newArray = new int[]{array[i], array[j]};

                }
            }
        }

        return newArray;
    }
}
