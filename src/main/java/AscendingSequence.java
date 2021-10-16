import java.util.Arrays;

public class AscendingSequence {

    /*
     * #2
     * Написать алгоритм AscendingSequence, который строит возврастающую последовательность чисел от a до b с шагом n.
    Test Data:
    a =  10
    b =  25
    n =  5
    Expected result = {10, 15, 20, 25}

    a =  10
    b =  -25
    n =  -5
    Expected result = {-1}

    a =  10
    b =  10
    n =  2
    Expected result = {-1}
    */

    public int[] ascendingSequence(int a, int b, int n) {

        if (a >= b || n <= 0) {
            return new int[]{-1};
        }

        int[] array = new int[(b - a) / n + 1];
        int number = a;

        for (int i = 0; i < array.length; i++) {
            array[i] = number;
            number += n;
        }

        System.out.println(Arrays.toString(array));
        return array;
    }

}
