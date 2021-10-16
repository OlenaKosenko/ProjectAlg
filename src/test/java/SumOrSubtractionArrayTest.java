import org.junit.Assert;
import org.junit.Test;

public class SumOrSubtractionArrayTest {

    @Test
    public void testSumOrSubtractionArrayAscending() {
        int n = 222;
        int expectedResult = 24753;

        SumOrSubtractionArray sumOrSubtractionArray = new SumOrSubtractionArray();
        int actualResult = sumOrSubtractionArray.sumOrSubtractionArray(n);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOrSubtractionArrayDescending() {
        int n = -10;
        int expectedResult = 56;

        SumOrSubtractionArray sumOrSubtractionArray = new SumOrSubtractionArray();
        int actualResult = sumOrSubtractionArray.sumOrSubtractionArray(n);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testSumOrSubtractionArrayOne() {
        int n = 1;
        int expectedResult = 1;

        SumOrSubtractionArray sumOrSubtractionArray = new SumOrSubtractionArray();
        int actualResult = sumOrSubtractionArray.sumOrSubtractionArray(n);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOrSubtractionArrayZero() {
        int n = 0;
        int expectedResult = 1;

        SumOrSubtractionArray sumOrSubtractionArray = new SumOrSubtractionArray();
        int actualResult = sumOrSubtractionArray.sumOrSubtractionArray(n);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOrSubtractionArrayTwo() {
        int n = 2;
        int expectedResult = 3;

        SumOrSubtractionArray sumOrSubtractionArray = new SumOrSubtractionArray();
        int actualResult = sumOrSubtractionArray.sumOrSubtractionArray(n);

        Assert.assertEquals(expectedResult, actualResult);
    }


}
