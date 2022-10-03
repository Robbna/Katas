package kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DropCapKata {


    /**
     * <p>💡 <b>Kata: </b><a href="https://www.codewars.com/kata/559e5b717dd758a3eb00005a">Dropcaps</p>
     * <p>🧠 <b>Difficulty: </b>7 kyu</p>
     * <p>📃 <b>Description: </b></p>
     * <p>DropCaps means that the first letter of the starting word of the paragraph should be in caps and the remaining lowercase, just like you see in the newspaper.</p>
     * <p>But for a change, let"s do that for each and every word of the given String. Your task is to capitalize every word that has length greater than 2, leaving smaller words as they are.</p>
     * <p>*should work also on Leading and Trailing Spaces and caps.</p>
     * <p>🔧 <b>Expected INPUT → OUTPUT: </b></p>
     * <p>→ "apple" → "Apple"</p>
     * <p>or</p>
     * <p>→ "&nbsp &nbsp &nbsp space WALK &nbsp &nbsp &nbsp" → "&nbsp &nbsp &nbsp Space Walk &nbsp &nbsp &nbsp" </p>
     */

    public static String dropCap(String text) {
        return Arrays.stream(text.split(" ", -1)).map(word -> {
            if (!word.equals("")) {
                if (word.length() > 2) {
                    return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                } else {
                    return word;
                }
            }
            return "";
        }).collect(Collectors.joining(" "));
    }
}
