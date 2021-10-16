import java.util.Arrays;

public class FizzBuzzWoof {

/*    Print integers 1 to N, 1 < N < 100
 but print:
 “Fizz” if an integer is divisible by 3
 “Fizz” if an integer contains 3,
 “Buzz” if an integer is divisible by 5
 “Buzz” if an integer contains 5,
 “Woof” if an integer is divisible by 7
 “Woof” if an integer contains 7

Fizz Buzz Woof: одна вариация расширилась до такой степени,
что получила собственное имя.
В этом случае число 3 становится Fizz,
5 становится Buzz,
а 7 становится Woof.
Основные правила в этой игре: любое число,
которое содержит число или делится на это число, заменяется вхождением слова.
Если число имеет 2 экземпляра этого числа (т. Е. 33 или 55) и делится на это число,
то слово произносится в этом примере три раза.*/

    public static boolean isDigitPresent(int a, int b) {

        while (a > 0) {
            if (a % 10 == b) {
                break;
            }
            a /= 10;
        }

        return a > 0;
    }


    public static String fizzBuzzWoofNumber(int a) {

        int number1 = 3;
        int number2 = 5;
        int number3 = 7;
        String result = "";

        if (a % number1 == 0) {
            result += "Fizz";
        }
        if (FizzBuzzWoof.isDigitPresent(a, number1)) {
            result += "Fizz";
        }
        if (a % number2 == 0) {
            result += "Buzz";
        }
        if (FizzBuzzWoof.isDigitPresent(a, number2)) {
            result += "Buzz";
        }
        if (a % number3 == 0) {
            result += "Woof";
        }
        if (FizzBuzzWoof.isDigitPresent(a, number3)) {
            result += "Woof";
        }

        return result;
    }

    public String[] fizzBuzzWoof(int n) {

        String[] array = new String[n];
        String result = "";

        for (int i = 0; i < array.length; i++) {
            String text = FizzBuzzWoof.fizzBuzzWoofNumber(i + 1);
            if (text.equals("")) {
                result = Integer.toString(i + 1);
            } else {
                result = text;
            }
            array[i] = result;
        }

        System.out.println(Arrays.toString(array));
        return array;
    }
}
