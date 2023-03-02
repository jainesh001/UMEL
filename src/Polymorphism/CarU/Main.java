package Polymorphism.CarU;

public class Main {
    public static void main(String[] args) {


        Car car = new Car("Ferrari 298 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red tesla model 3", 568, 75);
        runRace(tesla);

        Car prius = new HybridCar("2022 Toyota prius hybrid", 16, 8, 8);
        runRace(prius);


    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
