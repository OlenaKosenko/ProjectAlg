public class CompareNumbers {

    /*
     * #8
     * Напишите метод, который принимает на вход 2 любых int числа, и возвращает
     * 0, если числа равны
     * -1, если первое число меньше второго
     * 1, если первое число больше второго
     * Test Data:
     *       89, 89
     * Expected result: 0
     *       -89, 89
     * Expected result: -1
     *       89, -89
     * Expected result: 1
     */

    public int compareNumbers(int a, int b) {

        int result;

        if (a == b) {
            result = 0;
        } else if (a > b) {
            result = 1;
        } else {
            result = -1;
        }

        return result;

        //return Integer.compare(a,b);
    }
}
