package kyu_6;

import org.junit.Test;

import static org.junit.Assert.*;


public class ExecuteTests {

    @Test
    public void testDeadFish() {
        assertArrayEquals(new int[]{8, 64}, DeadFishKata.parse("iiisdoso"));
        assertArrayEquals(new int[]{8, 64, 3600}, DeadFishKata.parse("iiisdosodddddiso"));
    }

}
