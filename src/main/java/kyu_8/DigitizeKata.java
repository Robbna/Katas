package kyu_8;

import java.util.ArrayList;
import java.util.Collections;

public class DigitizeKata {


    /**
     * <p>💡 <b>Kata: </b><a href="https://www.codewars.com/kata/5583090cbe83f4fd8c000051">Convert number to reversed array of digits</p>
     * <p>🧠 <b>Difficulty: </b>8 kyu</p>
     * <p>📃 <b>Description: </b></p>
     * <p>Given a random non-negative number, you have to return the digits of this number within an array in reverse order.</p>
     * <p>🔧 <b>Expected INPUT → OUTPUT: </b></p>
     * <p>→ 35231  → new int[] {1,3,2,5,3}</p>
     * <p>or</p>
     * <p>→ 0 → new int[] {0}</p>
     */
    public static int[] digitize(long n) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (char c : String.valueOf(n).toCharArray()) {
            list.add(Character.getNumericValue(c));
        }
        Collections.reverse(list);

        int[] output = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            output[i] = list.get(i);
        }

        return output;
    }
}
