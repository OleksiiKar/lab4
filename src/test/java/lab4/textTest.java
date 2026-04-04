package lab4;
import textPackage.*;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class textTest {
    @Test
    void testLetterCreation() {
        Letter letter = new Letter('A');
        assertEquals('A', letter.getChars());
        assertEquals("A", letter.toString());
    }
    @Test
    void testWordSplitIntoLetters() {
        Word word = new Word("Java");
        assertEquals(4, word.getLetters().size());
        assertEquals("Java", word.toString());
    }
    @Test
    void testCompareTo() {
        Word apple = new Word("Apple");
        Word banana = new Word("Banana");

        assertTrue(apple.compareTo(banana) < 0);
        assertTrue(banana.compareTo(apple) > 0);
        assertEquals(0, apple.compareTo(new Word("Apple")));
    }
    @Test
    void testSentenceSplit() {
        Sentence sentence = new Sentence("Привіт, світ");
        List<textElements> elements = sentence.getSplitSentence();
        assertEquals(3, elements.size());
        assertTrue(elements.get(0) instanceof Word);
        assertTrue(elements.get(1) instanceof Punctuation);
        assertEquals("Привіт, світ", sentence.toString());
    }
    @Test
    void testCompareToByFirstWord() {
        Sentence s1 = new Sentence("Яблуко червоне");
        Sentence s2 = new Sentence("Банан жовтий");
        assertTrue(s1.compareTo(s2) > 0);
    }
    @Test
    void testTextParsing() {
        String input = "Привіт! Як справи?";
        Text text = new Text(input);
        assertEquals(input, text.toString());
        assertFalse(text.getSplitText().isEmpty());
    }

    @Test
    void testComplexText() {
        String input = "Це перше речення... А це друге!";
        Text text = new Text(input);
        assertEquals(input, text.toString());
    }
    @Test
    void testNullInputs() {
        assertThrows(NullPointerException.class, () -> new Word(null));
        assertThrows(NullPointerException.class, () -> new Sentence(null));
        assertThrows(NullPointerException.class, () -> new Text(null));
    }
}
