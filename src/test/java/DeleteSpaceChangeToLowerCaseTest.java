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


}
