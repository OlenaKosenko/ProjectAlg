package a_19_20;

public class AddStringNTimes {

    /*
     * Задача 1
     * Напишите метод, который выводит строковый параметр n раз
     * и показывает количество символов в новой строке.
     */

    public int addStringNTimes(String str, int n) {

        if (n < 1) {
            return -1;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n ; i++) {
            result.append(str);
        }

        //result.append(String.valueOf(str).repeat(Math.max(0, n)));

        System.out.println(result);
        return result.length();
    }
}
