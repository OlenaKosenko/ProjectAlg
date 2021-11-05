package a_19_20;

public class GenerateRandomLetters14And15 {

    /*
     * Задача 14
     * Написать метод, который генерирует строку
     * случайных букв русского алфавита.
     */

    public static String generateRandomRussianLetters() {

        StringBuilder result = new StringBuilder();
        int length = (int) ((Math.random() * 100) + 1); //from 1 to 100

        for (int i = 0; i < length; i++) {
            result.append((char) ((Math.random() * 32) + 1072)); // from 1072 to 1103
        }

        return result.toString();
    }

    /*
     * Задача 15
     * Написать метод, который генерирует строку слов случайной длины,
     * состоящую из случайных букв английского алфавита.
     */

    public static String generateRandomEnglishLetters() {

        StringBuilder result = new StringBuilder();
        int length = (int) ((Math.random() * 100) + 1);

        for (int i = 0; i < length; i++) {
            result.append((char) ((Math.random() * 26) + 97)); // 97 - 122
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(generateRandomRussianLetters());
        System.out.println(generateRandomEnglishLetters());
    }

}
