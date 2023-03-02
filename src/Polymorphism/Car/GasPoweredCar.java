package Polymorphism.Car;

public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public void nextstop() {
        System.out.println("Gas Station mandatory");
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas Powered Engine started");
    }
}
