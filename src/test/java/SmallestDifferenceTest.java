import org.junit.Assert;
import org.junit.Test;

public class SmallestDifferenceTest {

    @Test
    public void testSmallestDifferenceOne() {
        int[] input = {8, 5, 2, 0, 9, 12, 8};
        int[] expectedResult = {8, 8};

        SmallestDifference smallestDifference = new SmallestDifference();
        int[] actualResult = smallestDifference.smallestDifference(input);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSmallestDifferenceTwo() {
        int[] input = {8, -55, 2, -54, -12};
        int[] expectedResult = {-55, -54};

        SmallestDifference smallestDifference = new SmallestDifference();
        int[] actualResult = smallestDifference.smallestDifference(input);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSmallestDifferenceThree() {
        int[] input = {8, 5, 2, 0, 9, 12};
        int[] expectedResult = {8, 9};

        SmallestDifference smallestDifference = new SmallestDifference();
        int[] actualResult = smallestDifference.smallestDifference(input);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSmallestDifferenceFour() {
        int[] input = {8, 6, 2, 0, 9, 5};
        int[] expectedResult = {8, 9};

        SmallestDifference smallestDifference = new SmallestDifference();
        int[] actualResult = smallestDifference.smallestDifference(input);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSmallestDifferenceFive() {
        int[] input = {8, 100};
        int[] expectedResult = {8, 100};

        SmallestDifference smallestDifference = new SmallestDifference();
        int[] actualResult = smallestDifference.smallestDifference(input);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
