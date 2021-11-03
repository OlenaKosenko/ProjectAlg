package a_19_20;

import org.junit.Assert;
import org.junit.Test;

public class CommonPrefix7Test {

    @Test
    public void testCommonPrefix7One() {
        String[] array = {"flower","flow","flight"};
        String expectedResult = "fl";

        CommonPrefix7 commonPrefix7 = new CommonPrefix7();
        String actualResult = commonPrefix7.commonPrefix(array);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCommonPrefix7Two() {
        String[] array = {"dog","racecar","car"};
        String expectedResult = "";

        CommonPrefix7 commonPrefix7 = new CommonPrefix7();
        String actualResult = commonPrefix7.commonPrefix(array);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCommonPrefix7Three() {
        String[] array = {"flower","flow","flowerst", "flo"};
        String expectedResult = "flo";

        CommonPrefix7 commonPrefix7 = new CommonPrefix7();
        String actualResult = commonPrefix7.commonPrefix(array);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCommonPrefix7Four() {
        String[] array = {"flower","flower","flower", "flower"};
        String expectedResult = "flower";

        CommonPrefix7 commonPrefix7 = new CommonPrefix7();
        String actualResult = commonPrefix7.commonPrefix(array);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
