package a_19_20;

import org.junit.Assert;
import org.junit.Test;

public class Anagram11Test {

    @Test
    public void testAnagram1() {
        String str1 = "O, Draconian devil!";
        String str2 = "!Leonardo Da Vinci,";

        Anagram11 anagram = new Anagram11();

        Assert.assertTrue(anagram.anagram(str1, str2));
    }

    @Test
    public void testAnagram2() {
        String str1 = "Oh, lame saint!";
        String str2 = "The Mona Lisa,!";

        Anagram11 anagram = new Anagram11();

        Assert.assertTrue(anagram.anagram(str1, str2));
    }

    @Test
    public void testAnagramFalse() {
        String str1 = "Hello everyone!";
        String str2 = "The Mona Lisa,!";

        Anagram11 anagram = new Anagram11();

        Assert.assertFalse(anagram.anagram(str1, str2));
    }

}
