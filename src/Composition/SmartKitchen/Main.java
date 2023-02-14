package Composition.SmartKitchen;

public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker(false);
        DishWasher dishWasher = new DishWasher(true);
        Refrigerator refrigerator = new Refrigerator(false);

        SmartKitchen smartKitchen = new SmartKitchen(refrigerator, dishWasher, coffeeMaker);
        smartKitchen.getRefrigerator().orderFood();
        smartKitchen.getCoffeeMaker().brewCoffee();
        smartKitchen.getDishWasher().doDishes();

        System.out.println("*".repeat(20));

        SmartKitchen sk = new SmartKitchen();
        sk.setKitchenState(true, false, true);
        sk.getRefrigerator().orderFood();
        sk.getCoffeeMaker().brewCoffee();
        sk.getDishWasher().doDishes();


        System.out.println("*".repeat(20));
        SmartKitchen smartKitchen1 = new SmartKitchen();

        smartKitchen1.addWater();
        smartKitchen1.doKitchenWork();


    }
}
