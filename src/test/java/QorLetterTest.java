import a_17_18.QorLetter;
import org.junit.Test;

public class QorLetterTest {

    @Test
    public void testQorLetter(){

        String input = "QAForEveryone";
        QorLetter qorLetter = new QorLetter();

        qorLetter.printLetters(input);
    }

    @Test
    public void testQorLetter2(){

        String input = "Java lessons are fun";
        QorLetter qorLetter = new QorLetter();

        qorLetter.printLetters(input);
    }

}
