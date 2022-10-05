package kyu_6;
import java.util.Arrays;
import java.util.List;
public class SmileyFacesKata {
    /**
     * <p>💡 <b>Kata: </b><a href="https://www.codewars.com/kata/583203e6eb35d7980400002a">Count the smiley faces!</p>
     * <p>🧠 <b>Difficulty: </b>6 kyu</p>
     * <p>📃 <b>Description: </b></p>
     * <p>Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.</p>
     * <p>Rules for a smiling face:</p>
     * <ul>
     *     <li>Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;</li>
     *     <li>A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~</li>
     *     <li>Every smiling face must have a smiling mouth that should be marked with either ) or D</li>
     * </ul>
     * <p>No additional characters are allowed except for those mentioned.</p>
     * <p>Valid smiley face examples: :) :D ;-D :~)</p>
     * <p>Invalid smiley faces: ;( :> :} :]</p>
     * <p>🔧 <b>Expected INPUT → OUTPUT: </b></p>
     * <p>→ [":)", ";(", ";}", ":-D"] → 2</p>
     * <p>or</p>
     * <p>→ [";]", ":[", ";*", ":$", ";-D"] → 1</p>
     */
    public static int countSmileys(List<String> arr) {
        List<Character> smileFaces = Arrays.asList('(', '[', '{');
        arr.forEach(face -> {
            System.out.printf("FACE: %s\n", face);
            System.out.println("Chars: ");
            for (char c : face.toCharArray()) {
                if (!smileFaces.contains(c)) {
                    return;
                }
            }
            System.out.println("---------------");
        });
        return 0;
    }
}
