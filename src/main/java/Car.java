public class Car {

    Name name;
    int position;

    public Car(String name) {
        this.name = new Name(name);
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
