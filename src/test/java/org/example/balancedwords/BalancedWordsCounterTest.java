package org.example.balancedwords;

import org.example.bubblesort.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedWordsCounterTest {

    @Test
    void basicInputTest() {
        BalancedWordsCounter counter = new BalancedWordsCounter();
        int expectedResult = 28;
        int actualResult = counter.count("aabbabcccba");
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void emptyInputTest() {
        BalancedWordsCounter counter = new BalancedWordsCounter();
        int expectedResult = 0;
        int actualResult = counter.count("");
        assertEquals(expectedResult,actualResult);
    }
    @Test
    void wrongInput() {
        BalancedWordsCounter counter = new BalancedWordsCounter();
        assertThrows(RuntimeException.class, () ->{counter.count("abababa1");});
    }
    @Test
    void nullInput() {
        BalancedWordsCounter counter = new BalancedWordsCounter();
        assertThrows(RuntimeException.class, () ->{counter.count(null);});
    }

}
