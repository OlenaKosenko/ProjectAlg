import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test
    public void testAscendingSequencePositiveNumbers() {
        int a =  10;
        int b =  25;
        int n =  5;
        int[] expectedResult = {10, 15, 20, 25};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceAGreaterB() {
        int a =  10;
        int b =  -25;
        int n =  -5;
        int[] expectedResult = {-1};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceAEqualsB() {
        int a =  10;
        int b =  10;
        int n =  2;
        int[] expectedResult = {-1};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceNumbersLessThanZero() {
        int a =  -20;
        int b =  -10;
        int n =  5;
        int[] expectedResult = {-20, -15, -10};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceNegativeStep() {
        int a =  10;
        int b =  30;
        int n =  -5;
        int[] expectedResult = {-1};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceZeroStep() {
        int a =  10;
        int b =  30;
        int n =  0;
        int[] expectedResult = {-1};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
