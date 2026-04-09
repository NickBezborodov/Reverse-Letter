package com.example;

public class StringUtil {

    private StringUtil() {
    }

    public static String reverseOnlyLetters(String str) {
        char[] ch = str.toCharArray();

        for (int left = 0, right = str.length() - 1; left < right; ) {
            if (!Character.isLetter(ch[left])) {
                left++;
            } else if (!Character.isLetter(ch[right])) {
                right--;
            } else {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }
        }
        return new String(ch);
    }
}