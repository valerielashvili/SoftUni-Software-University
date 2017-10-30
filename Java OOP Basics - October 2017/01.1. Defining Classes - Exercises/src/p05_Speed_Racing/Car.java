package p05_Speed_Racing;

public class Car {
    private static final int DEFAULT_DISTANCE_TRAVALLED = 0;

    private String model;
    private double fuelAmount;
    private double fuelCost;
    private int distanceTravelled;

    Car(String model, double fuelAmount, double fuelCost) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.distanceTravelled = DEFAULT_DISTANCE_TRAVALLED;
    }

    void calculateDistance(int distance) {
        if (distance * this.fuelCost <= fuelAmount) {
            fuelAmount -= distance * this.fuelCost;
            this.distanceTravelled += distance;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distanceTravelled);
    }
}
