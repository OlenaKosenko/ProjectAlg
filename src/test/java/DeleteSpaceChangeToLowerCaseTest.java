import a_17_18.DeleteSpaceChangeToLowerCase;
import org.junit.Assert;
import org.junit.Test;

public class DeleteSpaceChangeToLowerCaseTest {

    @Test
    public void testDeleteSpaceChangeToLowerCase() {
        String input = "QA For  Everyone ";
        String expectedResult = "qaforeveryone";

        DeleteSpaceChangeToLowerCase deleteSpaceChangeToLowerCase = new DeleteSpaceChangeToLowerCase();
        String actualResult = deleteSpaceChangeToLowerCase.deleteSpaceChangeToLowerCase(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeleteSpaceChangeToLowerCaseTwo() {
        String input =  " Java lessons  are fun";
        String expectedResult = "javalessonsarefun";

        DeleteSpaceChangeToLowerCase deleteSpaceChangeToLowerCase = new DeleteSpaceChangeToLowerCase();
        String actualResult = deleteSpaceChangeToLowerCase.deleteSpaceChangeToLowerCase(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeleteSpaceChangeToLowerCaseThree() {
        String input =  "  ";
        String expectedResult = "";

        DeleteSpaceChangeToLowerCase deleteSpaceChangeToLowerCase = new DeleteSpaceChangeToLowerCase();
        String actualResult = deleteSpaceChangeToLowerCase.deleteSpaceChangeToLowerCase(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeleteSpaceChangeToLowerCaseFour() {
        String input =  "";
        String expectedResult = "";

        DeleteSpaceChangeToLowerCase deleteSpaceChangeToLowerCase = new DeleteSpaceChangeToLowerCase();
        String actualResult = deleteSpaceChangeToLowerCase.deleteSpaceChangeToLowerCase(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
