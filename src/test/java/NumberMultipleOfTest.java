import org.junit.Assert;
import org.junit.Test;


public class NumberMultipleOfTest {

    @Test
    public void testOneMultipleOf() {

        int m = 1;
        String expectedResult = "-1";

        NumberMultipleOf numberMultipleOf = new NumberMultipleOf();
        String actualResult = numberMultipleOf.numberMultipleOf(m);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFiveMultipleOf() {

        int m = 5;
        String expectedResult = "Poor Number";

        NumberMultipleOf numberMultipleOf = new NumberMultipleOf();
        String actualResult = numberMultipleOf.numberMultipleOf(m);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testThreeMultipleOf() {

        int m = 3;
        String expectedResult = "Bad Number";

        NumberMultipleOf numberMultipleOf = new NumberMultipleOf();
        String actualResult = numberMultipleOf.numberMultipleOf(m);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFifteenMultipleOf() {

        int m = 15;
        String expectedResult = "Good Number";

        NumberMultipleOf numberMultipleOf = new NumberMultipleOf();
        String actualResult = numberMultipleOf.numberMultipleOf(m);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
