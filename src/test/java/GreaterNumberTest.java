import org.junit.Assert;
import org.junit.Test;

public class GreaterNumberTest {

    @Test
    public void testGreaterNumberSecondGreaterPositive() {

        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        GreaterNumber greaterNumber = new GreaterNumber();
        int actualResult = greaterNumber.greaterNumber(a,b);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGreaterNumberFirstGreaterPositive() {

        int a = 9999;
        int b = 3333;
        int expectedResult = 9999;

        GreaterNumber greaterNumber = new GreaterNumber();
        int actualResult = greaterNumber.greaterNumber(a,b);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGreaterNumberFirstGreaterNegative() {

        int a = -10;
        int b = -30;
        int expectedResult = -10;

        GreaterNumber greaterNumber = new GreaterNumber();
        int actualResult = greaterNumber.greaterNumber(a,b);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGreaterNumberSecondGreaterNegative() {

        int a = -40;
        int b = -5;
        int expectedResult = -5;

        GreaterNumber greaterNumber = new GreaterNumber();
        int actualResult = greaterNumber.greaterNumber(a,b);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGreaterNumberZero() {

        int a = 0;
        int b = 5;
        int expectedResult = 5;

        GreaterNumber greaterNumber = new GreaterNumber();
        int actualResult = greaterNumber.greaterNumber(a,b);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGreaterNumberEqual() {

        int a = 5;
        int b = 5;
        int expectedResult = 5;

        GreaterNumber greaterNumber = new GreaterNumber();
        int actualResult = greaterNumber.greaterNumber(a,b);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
