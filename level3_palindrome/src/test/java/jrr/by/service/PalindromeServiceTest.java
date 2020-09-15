package jrr.by.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeServiceTest {
    @Test
public void isPalindromeTrue() {

    PalindromeService palindrome = new PalindromeService();
    String text = "А роза упала на лапу Азора";
    boolean expected = true;
    boolean actual = palindrome.isPalindrome("А РОЗА УПАЛА НА ЛАПУ АЗОРА");

    assertEquals(expected, actual);
}
    @Test
    public void removePunct() {
        PalindromeService palindrome = new PalindromeService();
        String text = "Кот - умное животное";
        String expected = "Котумноеживотное";
        String actual = palindrome.removePunct(text);
        assertEquals(expected, actual);
    }

    @Test
    public void toUpperCase() {
        PalindromeService palindrome = new PalindromeService();
        String  text = "око за око";
        String expected = "ОКО ЗА ОКО";
        String actual = palindrome.toUpperCase(text);

        assertEquals(expected, actual);

    }


}

