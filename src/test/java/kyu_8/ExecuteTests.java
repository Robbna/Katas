package kyu_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExecuteTests {


    @Test
    public void testDigitize() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, DigitizeKata.digitize(35231));
        assertArrayEquals(new int[]{5, 5, 0, 5}, DigitizeKata.digitize(5055));
        assertArrayEquals(new int[]{3, 2, 5, 5, 8}, DigitizeKata.digitize(85523));
        assertArrayEquals(new int[]{7, 1, 3}, DigitizeKata.digitize(317));
        assertArrayEquals(new int[]{2, 9, 7, 5, 8}, DigitizeKata.digitize(85792));
    }

    @Test
    public void testNoSpace() {
        assertEquals("8j8mBliB8gimjB8B8jlB", NoSpaceKata.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", NoSpaceKata.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", NoSpaceKata.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", NoSpaceKata.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", NoSpaceKata.noSpace("8j aam"));
    }
}