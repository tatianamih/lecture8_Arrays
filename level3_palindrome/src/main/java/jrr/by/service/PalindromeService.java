package jrr.by.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PalindromeService {
    private static final Set<Character> PUNCT_SET = new HashSet<>(Arrays.asList(
            '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-',
            '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^',
            '_', '`', '{', '|', '}', '~', ' '));


    public boolean isPalindrome(String text) {
       String newText = removePunct(text);
        toUpperCase(newText);
        int n = newText.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (newText.charAt(i) != newText.charAt(n - i - 1)) {

                return false;
            }
        }
        return true;
    }


    public static String removePunct(String text) {
               StringBuilder result = new StringBuilder(text.length());
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!PUNCT_SET.contains(Character.valueOf(c))) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public String toUpperCase(String text){
        return    text.toUpperCase();
    }
}


