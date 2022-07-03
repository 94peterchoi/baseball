public class Car {

    int fuelEfficiency = 10;

    public double calcFuel(int distance) {
        return (double)distance / fuelEfficiency;
    }
}
