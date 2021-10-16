import org.junit.Assert;
import org.junit.Test;

public class PositiveNumberTest {

    @Test
    public void testPositiveNumberPositive() {

        int number = 555;
        boolean expectedResult = true;

        PositiveNumber positiveNumber = new PositiveNumber();
        boolean actualResult = positiveNumber.positiveNumber(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveNumberZero() {

        int number = 0;
        boolean expectedResult = true;

        PositiveNumber positiveNumber = new PositiveNumber();
        boolean actualResult = positiveNumber.positiveNumber(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveNumberNegative() {

        int number = -555;
        boolean expectedResult = false;

        PositiveNumber positiveNumber = new PositiveNumber();
        boolean actualResult = positiveNumber.positiveNumber(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveNumberPositiveOne() {

        int number = 1;
        boolean expectedResult = true;

        PositiveNumber positiveNumber = new PositiveNumber();
        boolean actualResult = positiveNumber.positiveNumber(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveNumberNegativeOne() {

        int number = -1;
        boolean expectedResult = false;

        PositiveNumber positiveNumber = new PositiveNumber();
        boolean actualResult = positiveNumber.positiveNumber(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
