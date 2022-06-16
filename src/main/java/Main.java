import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operation operation = new Operation();

        System.out.print("type expression to calculate: ");
        String value = scanner.nextLine();
        String[] values = value.split(" ");
        int result = 0;
        List<String> twoNumsOneOp = new ArrayList<>();

        for (String el : values) {
            twoNumsOneOp.add(el);

            if (twoNumsOneOp.size() == 3) {
                result = operation.operate(twoNumsOneOp);
                System.out.println(result);
                twoNumsOneOp.clear();
                twoNumsOneOp.add(result + "");
            }
        }

        System.out.println("result => " + result);

    }

}
