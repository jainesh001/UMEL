package Polymorphism.Car;

public class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public void nextStop() {
        System.out.println("Charging station mandatory");
    }

    @Override
    public void drive() {
        System.out.println("Electric car driving started engin");
    }


}