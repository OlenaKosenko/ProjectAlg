import org.junit.Assert;
import org.junit.Test;

public class OddEvenTest {

    @Test
    public void testOddEvenNegativeNumber() {

        int number = -345;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenPositiveNumber() {

        int number = 222222;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenPositiveZero() {

        int number = 0;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }



}
