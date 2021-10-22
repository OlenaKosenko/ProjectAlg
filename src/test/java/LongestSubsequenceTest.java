import org.junit.Assert;
import org.junit.Test;

public class LongestSubsequenceTest {

    @Test
    public void testLongestSubsequenceOne() {
        int[] input = {1, 1, 1, 0, 0, 0, 1, 1};
        int[] expectedResult = {1, 1, 1};

        LongestSubsequence longestSubsequence = new LongestSubsequence();
        int[] actualResult = longestSubsequence.longestSubsequence(input);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testLongestSubsequenceTwo() {
        int[] input = {1, 0, 1, 1, 0, 1};
        int[] expectedResult = {1, 1};

        LongestSubsequence longestSubsequence = new LongestSubsequence();
        int[] actualResult = longestSubsequence.longestSubsequence(input);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testLongestSubsequenceThree() {
        int[] input = {1, 0, 1, 1, 0, 0, 0, 0, 1};
        int[] expectedResult = {0, 0, 0, 0};

        LongestSubsequence longestSubsequence = new LongestSubsequence();
        int[] actualResult = longestSubsequence.longestSubsequence(input);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testLongestSubsequenceFour() {
        int[] input = {1, 0, 9, 9, 9, 9, 0, 0, 1};
        int[] expectedResult = {9, 9, 9, 9};

        LongestSubsequence longestSubsequence = new LongestSubsequence();
        int[] actualResult = longestSubsequence.longestSubsequence(input);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
