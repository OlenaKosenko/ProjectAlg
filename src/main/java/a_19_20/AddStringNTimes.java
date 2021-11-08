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

        for (int i = 0; i < n; i++) {
            result.append(str);
        }

        //result.append(String.valueOf(str).repeat(Math.max(0, n)));

        return result.length();
    }

    public void addStringNTimes2(String str, int n) {

        if (n >= 1 && str.length() > 0) {

            str = str.repeat(n);
            System.out.println(str + " " + str.length());
        }
    }
}
