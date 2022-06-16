import java.util.List;

public class Operation {

    public int operate(List<String> twoNumsOneOp) {
        if (twoNumsOneOp.get(1).equals("+")) {
            return Integer.parseInt(twoNumsOneOp.get(0)) + Integer.parseInt(twoNumsOneOp.get(2));
        }
        if (twoNumsOneOp.get(1).equals("-")) {
            return Integer.parseInt(twoNumsOneOp.get(0)) - Integer.parseInt(twoNumsOneOp.get(2));
        }
        if (twoNumsOneOp.get(1).equals("*")) {
            return Integer.parseInt(twoNumsOneOp.get(0)) * Integer.parseInt(twoNumsOneOp.get(2));
        }
        if (twoNumsOneOp.get(1).equals("/")) {
            return Integer.parseInt(twoNumsOneOp.get(0)) / Integer.parseInt(twoNumsOneOp.get(2));
        }
        return 0;
    }
}
