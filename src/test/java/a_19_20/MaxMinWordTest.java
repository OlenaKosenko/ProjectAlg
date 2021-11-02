package a_19_20;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MaxMinWordTest {

    @Test
    public void testMaxMinWord() {
        String input = "What a wonderful day!";
        List<String> expectedResult = Arrays.asList("a", "wonderful");;

        MaxMinWord maxMinWord = new MaxMinWord();
        List<String> actualResult = maxMinWord.maxMinWord(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
