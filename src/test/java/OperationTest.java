import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.*;


class OperationTest {

    @Test
    void operation_test() {
        Operation operation = new Operation();
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("+");
        strings.add("2");

        int result = operation.operate(strings);
        assertThat(result).isEqualTo(3);

    }

}