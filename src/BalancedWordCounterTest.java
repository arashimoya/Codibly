import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedWordCounterTest {
    private static BalancedWordCounter balancedWordCounter;

    @BeforeAll
    static void init(){
        balancedWordCounter = new BalancedWordCounter();
    }

    @Test
    void test_realString(){
       String input = "aabbabcccba";
       int expected = 28;

       assertEquals(expected, balancedWordCounter.count(input));
    }

    @Test
    void test_emptyString(){
        String input = "";
        int expected = 0;

        assertEquals(expected, balancedWordCounter.count(input));
    }

    @Test
    void test_stringWithNonLetterCharacter(){
        String input = "abababa1";
        assertThrows(RuntimeException.class, ()-> balancedWordCounter.count(input));
    }

    @Test
    void test_nullInput(){
        assertThrows(RuntimeException.class, ()-> balancedWordCounter.count(null));
    }

}