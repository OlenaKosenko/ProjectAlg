package a_19_20;

import org.junit.Assert;
import org.junit.Test;

public class NewString2Test {

    @Test
    public void testNewString2() {
        String input = "QAForEveryone";
        String expectedResult = "oneQAF";

        NewString2 newString2 = new NewString2();
        String actualResult = newString2.newString(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNewString2Two() {
        String input = "Java";
        String expectedResult = "avavavav";

        NewString2 newString2 = new NewString2();
        String actualResult = newString2.newString(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNewString2Three() {
        String input = "ABC";
        String expectedResult = "BBB";

        NewString2 newString2 = new NewString2();
        String actualResult = newString2.newString(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNewString2Four() {
        String input = "AB";
        String expectedResult = "ABAB";

        NewString2 newString2 = new NewString2();
        String actualResult = newString2.newString(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNewString2Five() {
        String input = "A";
        String expectedResult = "A";

        NewString2 newString2 = new NewString2();
        String actualResult = newString2.newString(input);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
