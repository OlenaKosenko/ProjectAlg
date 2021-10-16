import org.junit.Assert;
import org.junit.Test;

public class OddIndicesArrayTest {

    @Test
    public void testOddIndicesArray() {
        int[] inputArray = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndicesArray oddIndicesArray = new OddIndicesArray();
        int[] actualResult = oddIndicesArray.oddIndicesArray(inputArray);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesArrayZero() {
        int[] inputArray = {};
        int[] expectedResult = {};

        OddIndicesArray oddIndicesArray = new OddIndicesArray();
        int[] actualResult = oddIndicesArray.oddIndicesArray(inputArray);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesArrayOdd() {
        int[] inputArray = {5, 15, -60};
        int[] expectedResult = {15};

        OddIndicesArray oddIndicesArray = new OddIndicesArray();
        int[] actualResult = oddIndicesArray.oddIndicesArray(inputArray);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesArrayOne() {
        int[] inputArray = {-5};
        int[] expectedResult = {};

        OddIndicesArray oddIndicesArray = new OddIndicesArray();
        int[] actualResult = oddIndicesArray.oddIndicesArray(inputArray);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }


}
