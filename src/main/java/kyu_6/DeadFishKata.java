package kyu_6;

import java.util.ArrayList;

public class DeadFishKata {


    /**
     * <p>💡 <b>Kata: </b><a href="https://www.codewars.com/kata/51e0007c1f9378fa810002a9">Make the Deadfish Swim</p>
     * <p>🧠 <b>Difficulty: </b>6 kyu</p>
     * <p>📃 <b>Description: </b></p>
     * <p>Write a simple parser that will parse and run Deadfish.</p>
     * <p>Deadfish has 4 commands, each 1 character long:</p>
     * <ul>
     *      <li><code>i</code> increments the value (initially <code>0</code>)</li>
     *      <li><code>d</code> decrements the value</li>
     *      <li><code>s</code> squares the value</li>
     *      <li><code>o</code> outputs the value into the return array</li>
     * </ul>
     * <p>Invalid characters should be ignored.</p>
     * <p>🔧 <b>Expected INPUT → OUTPUT: </b></p>
     * <p>→ "iiisdoso" → new int[] {8, 64}</p>
     */

    public static int[] parse(String data) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        int n = 0;

        for (char chr : data.toCharArray()) {
            switch (chr) {
                case 'i':
                    n++;
                    break;
                case 'd':
                    n--;
                    break;
                case 's':
                    n *= n;
                    break;
                case 'o':
                    list.add(n);
                    break;
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
