package se.cygni.palmithor.tdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class StringUtilsTest {

    private StringUtils stringUtils = new StringUtils();

    @Test
    public void isPalindrome() {
        assertThat(stringUtils.isPalindrome("aabb")).isFalse();
        assertThat(stringUtils.isPalindrome(null)).isFalse();
        assertThat(stringUtils.isPalindrome("NotEvenClose")).isFalse();
        assertThat(stringUtils.isPalindrome("")).isTrue();
        assertThat(stringUtils.isPalindrome("abba")).isTrue();
        assertThat(stringUtils.isPalindrome("tattarrattat")).isTrue();
    }

    /**
     * For the following function, you choose if you want to use TDD or not
     */
    @Test
    public void isBlank() {
        assertThat(stringUtils.isBlank("")).isTrue();
        assertThat(stringUtils.isBlank(null)).isTrue();
        assertThat(stringUtils.isBlank("      \t")).isTrue();
        assertThat(stringUtils.isBlank("Hello Foo\tEtc")).isFalse();
    }
}