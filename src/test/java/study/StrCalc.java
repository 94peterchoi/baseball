package study;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class StrCalc {

    @Test
    void separate() {
        String str = "2 + 3";
        String[] strArr = new String[]{"2", "+", "3"};
        assertThat(str.split(" ")).isEqualTo(strArr);
    }

    @Test
    void operate() {

    }




}
