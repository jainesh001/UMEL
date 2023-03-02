package Polymorphism.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.drive();
        car.runEngine();
        System.out.println("*".repeat(10));
        Car eCar = new ElectricCar();
        eCar.startEngine();
        eCar.drive();
        eCar.runEngine();
        ((ElectricCar) eCar).nextStop();
        System.out.println("-".repeat(10));
        ElectricCar enCar = new ElectricCar();
        enCar.startEngine();
        enCar.drive();
        enCar.runEngine();
        System.out.println("*".repeat(10));
        Car gCar = new GasPoweredCar();
        gCar.startEngine();
        gCar.drive();
        gCar.runEngine();
        if (gCar instanceof GasPoweredCar) {
            ((GasPoweredCar) gCar).nextstop();
        }
        System.out.println("-".repeat(10));
        GasPoweredCar gpCar = new GasPoweredCar();
        gpCar.startEngine();
        gpCar.drive();
        gpCar.runEngine();
        System.out.println("*".repeat(10));
        Car hCar = new HybridCar();
        hCar.startEngine();
        hCar.drive();
        hCar.runEngine();
        if (hCar instanceof HybridCar ref) {
            ref.nextstop();
        }
        System.out.println("*".repeat(10));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter car type or to exit q: ");
            String type = sc.nextLine();
            if (type.toLowerCase().equals("q")) {
                break;
            }
            Car newC = Car.getCar(type);
            newC.carType();
            if (newC.getClass().getSimpleName().equals("ElectricCar")) {
                ElectricCar eC = (ElectricCar) newC;
                eC.nextStop();
            } else if (newC instanceof GasPoweredCar) {
                ((GasPoweredCar) newC).nextstop();
            } else if (newC instanceof HybridCar hC) {
                hC.nextstop();
            }
        }


    }
}
