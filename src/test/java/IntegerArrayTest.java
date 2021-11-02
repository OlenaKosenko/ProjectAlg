import a_17_18.IntegerArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class IntegerArrayTest {

    @Test
    public void testIntegerArrayOne() {
        String input = "QA 4 Every1";
        List<Integer> expectedResult = Arrays.asList(4, 1);

        IntegerArray integerArray = new IntegerArray();
        List<Integer> actualResult = integerArray.integerList(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntegerArrayTwo() {
        String input = "45 тысяч 378";
        List<Integer> expectedResult = Arrays.asList(4, 5, 3, 7, 8);

        IntegerArray integerArray = new IntegerArray();
        List<Integer> actualResult = integerArray.integerList(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntegerArrayThree() {
        String input = "Java";
        List<Integer> expectedResult = Arrays.asList();

        IntegerArray integerArray = new IntegerArray();
        List<Integer> actualResult = integerArray.integerList(input);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
