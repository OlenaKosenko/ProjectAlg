package a_19_20;

import org.junit.Assert;
import org.junit.Test;

public class NonRepeatingLength8Test {

    @Test
    public void testNonRepeatingLength83() {
        String input = "aabcb";
        //int expectedResult = 3;
        String expectedResult = "abc";

        NonRepeatingLength8 nonRepeatingLength8 = new NonRepeatingLength8();
        String actualResult = nonRepeatingLength8.nonRepeatingLength(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNonRepeatingLength84() {
        String input = "aaaaa";
       // int expectedResult = 1;
        String expectedResult = "a";

        NonRepeatingLength8 nonRepeatingLength8 = new NonRepeatingLength8();
        String actualResult = nonRepeatingLength8.nonRepeatingLength(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNonRepeatingLength81() {
        String input = "abvvautccabbyuo";
       // int expectedResult = 5;
        String expectedResult = "vautc";

        NonRepeatingLength8 nonRepeatingLength8 = new NonRepeatingLength8();
        String actualResult = nonRepeatingLength8.nonRepeatingLength(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNonRepeatingLength82() {
        String input = "abvmubtcvcabbyuo";
        //int expectedResult = 6;
        String expectedResult = "vmubtc";

        NonRepeatingLength8 nonRepeatingLength8 = new NonRepeatingLength8();
        String actualResult = nonRepeatingLength8.nonRepeatingLength(input);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
