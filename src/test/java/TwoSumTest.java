import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void testTwoSumOne() {
        int[] input = {68, 5, 2, 100, 9, 12, 8};
        int targetNumber = 10;
        int[] expectedResult = {2, 6};

        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.twoSum(input, targetNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testTwoSumTwo() {
        int[] input = {1, 20, 40, 60, -40, -20, -1};
        int targetNumber = -19;
        int[] expectedResult = {0, 5};

        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.twoSum(input, targetNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testTwoSumThree() {
        int[] input = {8, 5, 2, 0, 9, 12, 8};
        int targetNumber = 12;
        int[] expectedResult = {3, 5};

        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.twoSum(input, targetNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testTwoSumNoMatch() {
        int[] input = {8, 5, 2, 0, 9, 12, 8};
        int targetNumber = 15;
        int[] expectedResult = {0, 0};

        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.twoSum(input, targetNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testTwoSumFour() {
        int[] input = {8, 1};
        int targetNumber = 9;
        int[] expectedResult = {0, 1};

        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.twoSum(input, targetNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }



}
