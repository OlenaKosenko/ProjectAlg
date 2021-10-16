import org.junit.Assert;
import org.junit.Test;

public class CompareNumbersTest {

    @Test
    public void testCompareNumbersEqual() {

        int a = 89;
        int b = 89;
        int expectedResult = 0;

        CompareNumbers compareNumbers = new CompareNumbers();
        int actualResult = compareNumbers.compareNumbers(a, b);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCompareNumbersFirstGreater() {

        int a = 89;
        int b = -89;
        int expectedResult = 1;

        CompareNumbers compareNumbers = new CompareNumbers();
        int actualResult = compareNumbers.compareNumbers(a, b);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCompareNumbersSecondGreater() {

        int a = -89;
        int b = 89;
        int expectedResult = -1;

        CompareNumbers compareNumbers = new CompareNumbers();
        int actualResult = compareNumbers.compareNumbers(a, b);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
