
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicatesOne() {
        int[] input = {3, 4, 2, 6, 4, 3, 3, 3, 2, 2};
        List<Integer> expectedResult = Arrays.asList(3, 4, 2, 6);

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        List<Integer> actualResult = removeDuplicates.removeDuplicates(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesTwo() {
        int[] input = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        List<Integer> expectedResult = Arrays.asList(0, 1, 2, 3, 4, 5);

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        List<Integer> actualResult = removeDuplicates.removeDuplicates(input);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
