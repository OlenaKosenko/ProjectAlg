import org.junit.Assert;
import org.junit.Test;

public class CompareSumOfElementsTest {

    @Test
    public void testCompareSumOfElementsOne() {
        int[] input = {4, 6, 3, 7, 1, 2};
        boolean expectedResult = true;

        CompareSumOfElements compareSumOfElements = new CompareSumOfElements();
        boolean actualResult = compareSumOfElements.isFirstHalfGreater(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCompareSumOfElementsTwo() {
        int[] input = {12, 48, 15, 125};
        boolean expectedResult = false;

        CompareSumOfElements compareSumOfElements = new CompareSumOfElements();
        boolean actualResult = compareSumOfElements.isFirstHalfGreater(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCompareSumOfElementsThree() {
        int[] input = {12, 48, 15};
        boolean expectedResult = false;

        CompareSumOfElements compareSumOfElements = new CompareSumOfElements();
        boolean actualResult = compareSumOfElements.isFirstHalfGreater(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
