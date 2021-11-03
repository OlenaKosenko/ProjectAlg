package a_19_20;

import org.junit.Assert;
import org.junit.Test;

public class UniqueLettersTest {

    @Test
    public void testUniqueLetters() {
        String input = "abcaczdbdakcazdbaz";
        String expectedResult = "abczdk";

        UniqueLetters uniqueLetters = new UniqueLetters();
        String actualResult = uniqueLetters.uniqueLetters(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testUniqueLettersTwo() {
        String input = "abcaczdbdakcaz1>dbaz";
        String expectedResult = "abczdk";

        UniqueLetters uniqueLetters = new UniqueLetters();
        String actualResult = uniqueLetters.uniqueLetters(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
