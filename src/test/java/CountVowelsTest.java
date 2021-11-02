import a_17_18.CountVowels;
import org.junit.Assert;
import org.junit.Test;

public class CountVowelsTest {

    @Test
    public void testCountVowelsOne() {

        String input = "QA For Everyone";
        int expectedResult = 6;

        CountVowels countVowels = new CountVowels();
        int actualResult = countVowels.countVowels(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountVowelsTwo() {

        String input = "Java lessons are fun";
        int expectedResult = 7;

        CountVowels countVowels = new CountVowels();
        int actualResult = countVowels.countVowels(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
