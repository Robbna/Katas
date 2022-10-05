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
        assertEquals("camel Casing", BreakCamelCase.camelCase("camelCasing"));
        assertEquals("camel Casing Test", BreakCamelCase.camelCase("camelCasingTest"));
        assertEquals("camelcasingtest", BreakCamelCase.camelCase("camelcasingtest"));
    }
}
