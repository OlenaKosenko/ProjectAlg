package a_19_20;

import org.junit.Assert;
import org.junit.Test;

public class CreateNewStringTest {

    @Test
    public void testCreateNewString() {
        String str1 = "QAForEveryone";
        String str2 = "Verona";

        CreateNewString createNewString = new CreateNewString();

        Assert.assertTrue(createNewString.createSecondString(str1, str2));
    }

    @Test
    public void testCreateNewStringTwo() {
        String str1 = "QAForEveryone";
        String str2 = "frog";

        CreateNewString createNewString = new CreateNewString();

        Assert.assertFalse(createNewString.createSecondString(str1, str2));
    }

    @Test
    public void testCreateNewStringThree() {
        String str1 = "QAForEveryone";
        String str2 = "far";

        CreateNewString createNewString = new CreateNewString();

        Assert.assertTrue(createNewString.createSecondString(str1, str2));
    }

    @Test
    public void testCreateNewStringFour() {
        String str1 = "QAForEveryone";
        String str2 = "ffar";

        CreateNewString createNewString = new CreateNewString();

        Assert.assertFalse(createNewString.createSecondString(str1, str2));
    }
}
