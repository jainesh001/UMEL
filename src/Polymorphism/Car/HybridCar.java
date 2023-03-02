package Polymorphism.Car;

public class HybridCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public void nextstop() {
        System.out.println("Gas Station or Charging station");
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid car start Engine");
    }
}
