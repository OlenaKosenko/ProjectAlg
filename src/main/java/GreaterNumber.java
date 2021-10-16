public class GreaterNumber {

    /*
     * #6
     * Напишите метод, который из двух параметров
     * типа int возвращает бОльшее значение.
     * Test Data:
     * 3333, 9999
     * Expected Result = 9999
     */

    public int greaterNumber(int a, int b) {

        int greaterNumber;

        if (a >= b) {
            greaterNumber = a;
        } else {
            greaterNumber = b;
        }

        return greaterNumber;

        //return Math.max(a, b);
    }
}
