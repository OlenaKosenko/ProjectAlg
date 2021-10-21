import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortedArrayTest {

    @Test
    public void testSortedArrayOne() {

        int[] input = {12, 2, 3, 4, 5};
        int[] expectedResult = {2, 3, 4, 5, 12};

        SortedArray sortedArray = new SortedArray();
        int[] actualResult = sortedArray.sortedArray(input);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortedArrayTwo() {

        int[] input = {-3, 0, 155, -39, 1003};
        int[] expectedResult = {-39, -3, 0, 155, 1003};

        SortedArray sortedArray = new SortedArray();
        int[] actualResult = sortedArray.sortedArray(input);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
