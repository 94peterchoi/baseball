public class Name {
    
    String name;
    
    public Name(String name) {
        checkValidation(name);
        this.name = name;
    }

    private void checkValidation(String name) {
        String carName = name.trim();

        if (carName.equals("")) {
            throw new IllegalArgumentException("자동차 이름을 최소 하나 입력하세요.");
        }
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하로 입력하세요.");
        }

    }


}
