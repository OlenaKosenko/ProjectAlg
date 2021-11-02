import a_17_18.DeleteSpaceChangeToUpperCase;
import org.junit.Assert;
import org.junit.Test;

public class DeleteSpaceChangeToUpperCaseTest {

    @Test
    public void testDeleteSpaceChangeToUpperCaseOne() {
        String input = "QA For  Everyone ";
        String expectedResult = "QA FOR EVERYONE";

        DeleteSpaceChangeToUpperCase deleteSpaceChangeToUpperCase = new DeleteSpaceChangeToUpperCase();
        String actualResult = deleteSpaceChangeToUpperCase.deleteSpaceChangeToUpperCase(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeleteSpaceChangeToUpperCaseTwo() {
        String input = " Java lessons  are fun";
        String expectedResult = "JAVA LESSONS ARE FUN";

        DeleteSpaceChangeToUpperCase deleteSpaceChangeToUpperCase = new DeleteSpaceChangeToUpperCase();
        String actualResult = deleteSpaceChangeToUpperCase.deleteSpaceChangeToUpperCase(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeleteSpaceChangeToUpperCaseThree() {
        String input = " Java         lessons  are fun ";
        String expectedResult = "JAVA LESSONS ARE FUN";

        DeleteSpaceChangeToUpperCase deleteSpaceChangeToUpperCase = new DeleteSpaceChangeToUpperCase();
        String actualResult = deleteSpaceChangeToUpperCase.deleteSpaceChangeToUpperCase(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeleteSpaceChangeToUpperCaseFour() {
        String input = "     ";
        String expectedResult = "";

        DeleteSpaceChangeToUpperCase deleteSpaceChangeToUpperCase = new DeleteSpaceChangeToUpperCase();
        String actualResult = deleteSpaceChangeToUpperCase.deleteSpaceChangeToUpperCase(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeleteSpaceChangeToUpperCaseFive() {
        String input = "";
        String expectedResult = "";

        DeleteSpaceChangeToUpperCase deleteSpaceChangeToUpperCase = new DeleteSpaceChangeToUpperCase();
        String actualResult = deleteSpaceChangeToUpperCase.deleteSpaceChangeToUpperCase(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeleteSpaceChangeToUpperCaseSix() {
        String input = "  p   p ";
        String expectedResult = "P P";

        DeleteSpaceChangeToUpperCase deleteSpaceChangeToUpperCase = new DeleteSpaceChangeToUpperCase();
        String actualResult = deleteSpaceChangeToUpperCase.deleteSpaceChangeToUpperCase(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
