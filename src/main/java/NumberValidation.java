public class NumberValidation {

    private final int MIN_NO = 1;
    private final int MAX_NO = 9;

    public boolean isValidNumber(int number) {
        if (MIN_NO <= number && number <= MAX_NO) {
            return true;
        }
        return false;
    }
}
