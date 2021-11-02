import a_17_18.ChangeZeroToO;
import org.junit.Assert;
import org.junit.Test;

public class ChangeZeroToOTest {

    @Test
    public void testChangeZeroToO() {

        String input = "QAF0rEvery0ne";
        String expectedResult = "QAForEveryone";

        ChangeZeroToO changeZeroToO = new ChangeZeroToO();
        String actualResult = changeZeroToO.changeZeroToO(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testChangeZeroToOTwo() {

        String input = "Java less0ns are fun";
        String expectedResult = "Java lessons are fun";

        ChangeZeroToO changeZeroToO = new ChangeZeroToO();
        String actualResult = changeZeroToO.changeZeroToO(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
