import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseballTest {

    @Test
    public void 랜덤세자리_생성() {
        Baseball baseball = new Baseball();
        System.out.println(baseball.getStrNumber());
    }

}