package kyu_8;


public class NoSpaceKata {

    /**
     * <p>💡 <b>Kata: </b><a href="https://www.codewars.com/kata/57eae20f5500ad98e50002c5">Remove String Spaces</p>
     * <p>🧠 <b>Difficulty: </b>8 kyu</p>
     * <p>📃 <b>Description: </b></p>
     * <p>Simple, remove the spaces from the string, then return the resultant string.</p>
     * <p>🔧 <b>Expected INPUT → OUTPUT: </b></p>
     * <p>→ "jfBm &nbsp &nbsp gk &nbsp lf8hg &nbsp &nbsp88lbe8 &nbsp" → "jfBmgklf8hg88lbe8"</p>
     */

    public static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }
}
