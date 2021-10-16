public class OddEven {

    /*
     * #1
     * Создать алгоритм OddEven, который примет на вход число,
     * вернет “Odd”, если число нечетное, и “Even”, если число четное.
     * Во всех остальных случаях результат будет “Undefined”.
     *
     * Test Data:
     *       -345 -> “Odd”
     *       0 -> “Even”
     *       222222 -> “Even”
     *       2147483647 + 1 -> “Undefined”
     */

//     if (number < Integer.MIN_VALUE || number > Integer.MAX_VALUE) {
//        result = "Undefined";
//    }

    public String oddEven(int number) {

        String result = "";

        if (number % 2 == 0) {
            result = "Even";
        } else if (number % 2 != 0) {
            result = "Odd";
        } else {
            result = "Undefined";
        }

        System.out.println(number + " is " + result);
        return result;
    }

    public static void main(String[] args) {

        int a = 2147483647 + 1;
        OddEven b = new OddEven();
        System.out.println(b.oddEven(2147483647 + 1));

    }

}
