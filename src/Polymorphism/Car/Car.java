package Polymorphism.Car;

public class Car {
    private String description;


    public void startEngine() {
        System.out.println("Car Engine started");
    }

    public void drive() {
        runEngine();
        System.out.println("Started driving");
    }

    protected void runEngine() {
        System.out.println("Engine turned On");
    }

    public static Car getCar(String type) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'E' -> new ElectricCar();
            case 'G' -> new GasPoweredCar();
            case 'H' -> new HybridCar();
            default -> new Car();
        };
    }

    public void carType() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println("Car Type " + instanceType);
    }

}
