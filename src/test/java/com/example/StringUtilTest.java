package com.example;

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
    void reverOnlyletters_Emptystring_returnsEmpty() {
        assertEquals("", StringUtil.reverseOnlyLetters(""));
    }

    @Test
    void reverOnlyletters_AStringOfLettersOnly() {
        assertEquals("cba", StringUtil.reverseOnlyLetters("abc"));
    }

    @Test
    void reverOnlyletters_OnlyFromNonLetters() {
        assertEquals("123!@#", StringUtil.reverseOnlyLetters("123!@#"));
    }

    @Test
    void reverOnlyletters_OnlyOneSymbol() {
        assertEquals("A", StringUtil.reverseOnlyLetters("A"));
    }

    @Test
    void reverOnlyletters_OnlyOneNonAlpSymbol() {
        assertEquals("@", StringUtil.reverseOnlyLetters("@"));
    }

    @Test
    void reverOnlyletters_EvenNumber() {
        assertEquals("abcdef", StringUtil.reverseOnlyLetters("fedcba"));
    }

    @Test
    void reverOnlyletters_WithSpace() {
        assertEquals("a b c", StringUtil.reverseOnlyLetters("c b a"));
    }
}