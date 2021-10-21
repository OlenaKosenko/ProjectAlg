import org.junit.Assert;
import org.junit.Test;

public class ZeroSumTest {

    @Test
    public void testZeroSumMatch() {
        int[] array = {35, 23, 12, 89, -23, -48, 100};
        int[] expectedResult = {23, -23};

        ZeroSum zeroSum = new ZeroSum();
        int[] actualResult = zeroSum.zeroSum(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testZeroSumNoMatch() {
        int[] array = {35, 23, 12, 89, 23, -48, 100};
        int[] expectedResult = {0, 0};

        ZeroSum zeroSum = new ZeroSum();
        int[] actualResult = zeroSum.zeroSum(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
