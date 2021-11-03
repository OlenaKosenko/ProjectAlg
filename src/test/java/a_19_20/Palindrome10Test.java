package a_19_20;

import org.junit.Assert;
import org.junit.Test;

public class Palindrome10Test {

    @Test
    public void testPalindrome() {
        String input = "А роза упала на лапу Азора";
        String expectedResult = "арозА упал ан алапу азор А";

        Palindrome10 palindrome10 = new Palindrome10();
        String actualResult = palindrome10.palindrome(input);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPalindrome1() {
        String input = "Noon";

        Palindrome10 palindrome10 = new Palindrome10();

        Assert.assertTrue(palindrome10.isPalindrome(input));
    }

    @Test
    public void testIsPalindrome2() {
        String input = "Noon";

        Palindrome10 palindrome10 = new Palindrome10();

        Assert.assertTrue(palindrome10.isPalindrome(input));
    }

    @Test
    public void testIsPalindromeFalse() {
        String input = "Mama";

        Palindrome10 palindrome10 = new Palindrome10();

        Assert.assertFalse(palindrome10.isPalindrome(input));
    }

}
