package kyu_6;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
public class ExecuteTests {
    @Test
    public void testDeadFish() {
        assertArrayEquals(new int[]{8, 64}, DeadFishKata.parse("iiisdoso"));
        assertArrayEquals(new int[]{8, 64, 3600}, DeadFishKata.parse("iiisdosodddddiso"));
    }
    @Test
    public void testSmileyFaces() {
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(new String[]{":)", ":D", ":-}", ":-()"}));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(new String[]{":)", ":)", "x-]", ":ox", ";-(", ";-)", ";~(", ":~D"}));
        assertEquals(2, SmileyFacesKata.countSmileys(list1));
        assertEquals(2, SmileyFacesKata.countSmileys(list2));
    }
    @Test
    public void testBreakCamelCase() {
        assertEquals("camel Casing", BreakCamelCaseKata.camelCase("camelCasing"));
        assertEquals("camel Casing Test", BreakCamelCaseKata.camelCase("camelCasingTest"));
        assertEquals("camelcasingtest", BreakCamelCaseKata.camelCase("camelcasingtest"));
    }
    @Test
    public void testRemoveParentheses() {
        assertEquals("exampleexample", RemoveParenthesesKata.removeParentheses("example(unwanted thing)example"));
        assertEquals("a", RemoveParenthesesKata.removeParentheses("a(b(c))"));
        assertEquals("example  example", RemoveParenthesesKata.removeParentheses("example (unwanted thing) example"));
        assertEquals("  ", RemoveParenthesesKata.removeParentheses("(first group) (second group) (third group)"));
    }
}
