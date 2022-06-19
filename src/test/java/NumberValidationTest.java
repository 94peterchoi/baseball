import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class NumberValidationTest {

    @Test
    void 숫자_1부터_9까지_유효성검사() {
        NumberValidation numberValidation = new NumberValidation();

        assertThat(numberValidation.isValidNumber(1)).isEqualTo(true);
        assertThat(numberValidation.isValidNumber(9)).isEqualTo(true);
        assertThat(numberValidation.isValidNumber(0)).isEqualTo(false);
        assertThat(numberValidation.isValidNumber(10)).isEqualTo(false);
    }

}
