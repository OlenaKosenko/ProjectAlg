package a_19_20;

import org.junit.Assert;
import org.junit.Test;

public class ReverseString9Test {

    @Test
    public void testReverseString1() {
        String input = "apple";
        String expectedResult = "elppa";

        ReverseString9 reverseString9 = new ReverseString9();
        String actualResult = reverseString9.reverseString(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseString2() {
        String input = "А роза упала на лапу Азора";
        String expectedResult = "арозА упал ан алапу азор А";

        ReverseString9 reverseString9 = new ReverseString9();
        String actualResult = reverseString9.reverseString(input);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
