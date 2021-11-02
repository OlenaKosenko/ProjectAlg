import a_17_18.OddIndices;
import org.junit.Assert;
import org.junit.Test;

public class OddIndicesTest {

    @Test
    public void testOddIndicesOne() {
        String input = "QAForEveryone";
        String expectedResult = "AoEeyn";

        OddIndices oddIndices = new OddIndices();
        String actualResult = oddIndices.oddIndices(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesTwo() {
        String input = "JavaLessonsAreFun";
        String expectedResult = "aaesnAeu";

        OddIndices oddIndices = new OddIndices();
        String actualResult = oddIndices.oddIndices(input);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
