import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    /*
     * Написать  алгоритм RemoveDuplicates, который принимает на вход массив чисел,
     * и возвращает массив уникальных чисел.
     *
     * Test Data
     * {3, 4, 2, 6, 4, 3, 3, 3, 2, 2} -> {3, 4, 2, 6}
     * {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0} -> {0, 1, 2, 3, 4, 5}
     */

    public List<Integer> removeDuplicates(int[] array) {

        List<Integer> list = new ArrayList<>();
        boolean isElementPresent = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (array[i] == list.get(j)) {
                    isElementPresent = true;
                    break;
                }
            }
            if (!isElementPresent) {
                list.add(array[i]);
            } else {
                isElementPresent = false;
            }
        }

        return list;
    }
}
