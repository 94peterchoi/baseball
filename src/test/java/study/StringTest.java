package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");

        String[] actual2 = "1,2".split(",");
        assertThat(actual2).contains("1", "2");
    }

    @Test
    void substring() {
        String str = "(1,2)";
        String actual = str.substring(1, str.length()-1);

        assertThat(actual).isEqualTo("1,2");
    }

    @DisplayName("search")
    @Test
    void findCharacterByIndex() {
        assertThatThrownBy(() -> {
            char ch = "abc".charAt(4);
            assertThat(ch).isEqualTo('a');
        }).hasMessageContaining("range: 4");
    }

    @Test
    void exceptionTest() {
        assertThatNullPointerException().isThrownBy(() -> {
            String str = null;
            str.length();
        }).withMessage(null);
    }



}
