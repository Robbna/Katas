package kyu_6;
import java.util.Arrays;
import java.lang.StringBuilder;
public class RemoveParenthesesKata {
    /**
     * <p>💡 <b>Kata: </b><a href="https://www.codewars.com/kata/5f7c38eb54307c002a2b8cc8">Remove the parentheses</p>
     * <p>🧠 <b>Difficulty: </b>6 kyu</p>
     * <p>📃 <b>Description: </b></p>
     * <p>Your task is to remove everything inside the parentheses as well as the parentheses themselves.</p>
     * <p>🔧 <b>Expected INPUT → OUTPUT: </b></p>
     * <p>→ "example(unwanted thing)example" → "exampleexample"</p>
     */
    public static String removeParentheses(final String input) {
        StringBuilder text = new StringBuilder(input);
        int pos1 = input.indexOf('(');
        int pos2 = input.lastIndexOf(')');
        System.out.println(pos1);
        System.out.println(pos2);
        String output = text.replace(pos1, pos2 + 1, "").toString();
        System.out.println(output);
        return output;
    }
}
