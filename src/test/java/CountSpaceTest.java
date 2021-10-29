import org.junit.Assert;
import org.junit.Test;

public class CountSpaceTest {

    @Test
    public void testOddIndicesOne() {
        String input = "QA For Everyone";
        int expectedResult = 2;

        CountSpace countSpace = new CountSpace();
        int actualResult = countSpace.countSpace(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesOneTeo() {
        String input = "Java lessons  are fun";
        int expectedResult = 4;

        CountSpace countSpace = new CountSpace();
        int actualResult = countSpace.countSpace(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
