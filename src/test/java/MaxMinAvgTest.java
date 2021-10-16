import org.junit.Assert;
import org.junit.Test;

public class MaxMinAvgTest {

    @Test
    public void testMaxMinAvg() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 1, 3};

        MaxMinAvg maxMinAvg = new MaxMinAvg();
        int[] actualResult = maxMinAvg.maxMinAvg(inputArray);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxMinAvg2() {
        int[] inputArray = {-3, 0, 155, -39, 1003};
        int[] expectedResult = {1003, -39, 223};

        MaxMinAvg maxMinAvg = new MaxMinAvg();
        int[] actualResult = maxMinAvg.maxMinAvg(inputArray);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxMinAvg3() {
        int[] inputArray = {1, 4};
        int[] expectedResult = {4, 1, 2};

        MaxMinAvg maxMinAvg = new MaxMinAvg();
        int[] actualResult = maxMinAvg.maxMinAvg(inputArray);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
