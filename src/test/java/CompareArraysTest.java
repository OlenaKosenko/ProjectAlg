import org.junit.Assert;
import org.junit.Test;

public class CompareArraysTest {

    @Test
    public void testCompareArraysOne() {
        int[] inputArray1 = {1, 2, 3, 4, 5};
        int[] inputArray2 = {1, 2, 3, 4, 5};

        CompareArrays compareArrays = new CompareArrays();

        Assert.assertTrue(compareArrays.areArraysEqual(inputArray1, inputArray2));
   }

    @Test
    public void testCompareArraysTwo() {
        int[] inputArray1 = {1, 2, 3, 4, 5};
        int[] inputArray2 = {1, 2, 3, 4, 6};

        CompareArrays compareArrays = new CompareArrays();

        Assert.assertFalse(compareArrays.areArraysEqual(inputArray1, inputArray2));
    }

    @Test
    public void testCompareArraysThree() {
        int[] inputArray1 = {1, 2};
        int[] inputArray2 = {1, 2, 3, 4, 6};

        CompareArrays compareArrays = new CompareArrays();

        Assert.assertFalse(compareArrays.areArraysEqual(inputArray1, inputArray2));
    }

}
