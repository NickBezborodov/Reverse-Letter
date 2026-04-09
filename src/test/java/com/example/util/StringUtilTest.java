package com.example.util;

import com.example.StringUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilTest {

    @Test
    void reverseOnlyLetters_mixedString_reverseLettersOnly() {
        // Arrange (подготовка)
        String input = "J@va the be$t!123";
        String expected = "t@eb eht av$J!123";

        // Act (вызов метода)
        String actualresult = StringUtil.reverseOnlyLetters(input);

        // Assert (проверка)
        assertEquals(expected, actualresult);
    }

    @Test
    void reverOnlyLetters_emptyString_returnsEmpty() {
        assertEquals("", StringUtil.reverseOnlyLetters(""));
    }

    @Test
    void reverOnlyLetters_aStringOfLettersOnly() {
        assertEquals("cba", StringUtil.reverseOnlyLetters("abc"));
    }

    @Test
    void reverOnlyLetters_onlyFromNonLetters() {
        assertEquals("123!@#", StringUtil.reverseOnlyLetters("123!@#"));
    }

    @Test
    void reverOnlyLetters_onlyOneSymbol() {
        assertEquals("A", StringUtil.reverseOnlyLetters("A"));
    }

    @Test
    void reverOnlyLetters_onlyOneNonAlpSymbol() {
        assertEquals("@", StringUtil.reverseOnlyLetters("@"));
    }

    @Test
    void reverOnlyLetters_evenNumber() {
        assertEquals("abcdef", StringUtil.reverseOnlyLetters("fedcba"));
    }

    @Test
    void reverOnlyLetters_withSpace() {
        assertEquals("a b c", StringUtil.reverseOnlyLetters("c b a"));
    }
}