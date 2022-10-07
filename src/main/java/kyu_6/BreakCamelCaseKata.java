package kyu_6;
public class BreakCamelCaseKata {
    /**
     * <p>💡 <b>Kata: </b><a href="https://www.codewars.com/kata/5208f99aee097e6552000148">Break camelCase</p>
     * <p>🧠 <b>Difficulty: </b>6 kyu</p>
     * <p>📃 <b>Description: </b></p>
     * <p>Complete the solution so that the function will break up camel casing, using a space between words.</p>
     * <p>🔧 <b>Expected INPUT → OUTPUT: </b></p>
     * <p>→ "camelCasing" → "camel Casing"</p>
     * <p>→ "identifier" → "identifier"</p>
     */
    public static String camelCase(String input) {
        return String.join(" ", input.split("(?=[A-Z])"));
    }
}
