package a_19_20;

import org.junit.Assert;
import org.junit.Test;

public class CheckUniqueSymbolsTest {

    @Test
    public void testCheckUniqueSymbols() {
        String input = "AhdYk84";

        CheckUniqueSymbols checkUniqueSymbols = new CheckUniqueSymbols();
        boolean actualResult = checkUniqueSymbols.areSymbolsUnique(input);

        Assert.assertTrue(actualResult);
    }

    @Test
    public void testCheckUniqueSymbolsTwo() {
        String input = "kFy7ak";

        CheckUniqueSymbols checkUniqueSymbols = new CheckUniqueSymbols();
        boolean actualResult = checkUniqueSymbols.areSymbolsUnique(input);

        Assert.assertFalse(actualResult);
    }

}
