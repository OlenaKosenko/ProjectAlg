package a_19_20;

import org.junit.Assert;
import org.junit.Test;

public class AddStringNTimesTest {

    @Test
    public void testAddStringNTimes() {
        String input = "Apple";
        int number = 3;
        int expectedResult = input.length() * number;

        AddStringNTimes addStringNTimes = new AddStringNTimes();
        int actualResult = addStringNTimes.addStringNTimes(input, number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAddStringNTimesTwo() {
        String input = "Apple";
        int number = 0;
        int expectedResult = -1;

        AddStringNTimes addStringNTimes = new AddStringNTimes();
        int actualResult = addStringNTimes.addStringNTimes(input, number);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
