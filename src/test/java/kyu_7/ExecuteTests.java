package kyu_7;
import org.junit.Test;

import static org.junit.Assert.*;
public class ExecuteTests {
    @Test
    public void testDropCap() {
        assertEquals("  Leading Spaces", DropCapKata.dropCap("  leading spaces"));
        assertEquals("Apple Banana", DropCapKata.dropCap("Apple Banana"));
        assertEquals("Apple", DropCapKata.dropCap("Apple"));
        assertEquals("", DropCapKata.dropCap(""));
        assertEquals("of", DropCapKata.dropCap("of"));
        assertEquals("Revelation of The Contents Outraged American Public Opinion, And Helped Generate", DropCapKata.dropCap("Revelation of the contents outraged American public opinion, and helped generate"));
        assertEquals("More  Than    One Space Between Words", DropCapKata.dropCap("more  than    one space between words"));
        assertEquals("Trailing Spaces   ", DropCapKata.dropCap("trailing spaces   "));
        assertEquals("All Caps Craziness", DropCapKata.dropCap("ALL CAPS CRAZINESS"));
        assertEquals("Random Caps Craziness", DropCapKata.dropCap("rAnDoM CaPs CrAzInEsS"));
    }
}
