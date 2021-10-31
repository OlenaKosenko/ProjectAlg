import java.util.ArrayList;
import java.util.List;

public class IntegerArray {

    /*
     * Написать метод, который все цифры из входящей строки вернет в виде List<Integer>.
     *
     * Test Data:
     * “QA 4 Every1” -> [4, 1]
     * “45 тысяч 378” -> [4, 5, 3, 7, 8]
     */

    public List<Integer> integerList(String str) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                list.add(Character.getNumericValue(str.charAt(i)));
            }
        }

        return list;
    }
}
