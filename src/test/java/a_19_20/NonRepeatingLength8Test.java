package a_19_20;

import org.junit.Assert;
import org.junit.Test;

public class NonRepeatingLength8Test {

    @Test
    public void testMaxSubstringLength1() {
        String input = "aabcb";
        int expectedResult = 3;

        NonRepeatingLength8 nonRepeatingLength8 = new NonRepeatingLength8();
        int actualResult = nonRepeatingLength8.maxSubstringLength(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxSubstringLength2() {
        String input = "aaaaa";
        int expectedResult = 1;

        NonRepeatingLength8 nonRepeatingLength8 = new NonRepeatingLength8();
        int actualResult = nonRepeatingLength8.maxSubstringLength(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxSubstringLength3() {
        String input = "abvvautccabbyuo";
        int expectedResult = 5;

        NonRepeatingLength8 nonRepeatingLength8 = new NonRepeatingLength8();
        int actualResult = nonRepeatingLength8.maxSubstringLength(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxSubstringLength4() {
        String input = "abvmubtcvcabbyuo";
        int expectedResult = 6;

        NonRepeatingLength8 nonRepeatingLength8 = new NonRepeatingLength8();
        int actualResult = nonRepeatingLength8.maxSubstringLength(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxSubstring1() {
        String input = "aabcb";
        String expectedResult = "abc";

        NonRepeatingLength8 nonRepeatingLength8 = new NonRepeatingLength8();
        String actualResult = nonRepeatingLength8.maxSubstring(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxSubstring2() {
        String input = "aaaaa";
        String expectedResult = "a";

        NonRepeatingLength8 nonRepeatingLength8 = new NonRepeatingLength8();
        String actualResult = nonRepeatingLength8.maxSubstring(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxSubstring3() {
        String input = "abvvautccabbyuo";
        String expectedResult = "vautc";

        NonRepeatingLength8 nonRepeatingLength8 = new NonRepeatingLength8();
        String actualResult = nonRepeatingLength8.maxSubstring(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxSubstring4() {
        String input = "abvmubtcvcabbyuo";
        String expectedResult = "vmubtc";

        NonRepeatingLength8 nonRepeatingLength8 = new NonRepeatingLength8();
        String actualResult = nonRepeatingLength8.maxSubstring(input);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
