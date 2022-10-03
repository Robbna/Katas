<!-- HEADER -->

<h1 align="center">
  Katas from <a href="https://www.codewars.com/dashboard">codewars</a>
</h1>

<p align="center">
  <a href="https://www.codewars.com/users/Robbna">
    <img src="https://www.codewars.com/users/Robbna/badges/large"/>
  </a>
</p>

<!-- DETAILS -->
## 🔧 IDE, project settings and libraries
IDE: [IntelliJ IDEA](https://www.jetbrains.com/idea/)

Java SDK: [1.8](https://docs.oracle.com/javase/8/docs/api/)

Test-Driven Development: [JUnit](https://junit.org/junit5/)



<!-- JAVADOC -->
## 📃 Javadoc
### Basic structure
```java
/**
 * <p>💡 <b>Kata: </b><a href="{URL}">{TITLE}</p>
 * <p>🧠 <b>Difficulty: </b>{LEVEL} kyu</p>
 * <p>📃 <b>Description: </b></p>
 * <p>{DESCRIPTION}</p>
 * <p>🔧 <b>Expected INPUT → OUTPUT: </b></p>
 * <p>→ {INPUT} → {OUTPUT}</p>
 * <p>or</p>
 * <p>→ {INPUT 2} → {OUTPUT 2}</p>
 */
```
### Sample Javadoc
```java
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
     * <p>→ "   space WALK   " → "   Space Walk   " </p>
     */

    public static String dropCap(String text) {...}
}
```
