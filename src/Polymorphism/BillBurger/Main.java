package Polymorphism.BillBurger;

public class Main {
    public static void main(String[] args) {
        Meal meal = new Meal();
        meal.itemizedBill();

        System.out.println("*".repeat(20));
        Meal meal1 = new Meal("Delux", 2);
        meal1.itemizedBill();

        System.out.println("*".repeat(20));
        Meal meal2 = new Meal("Custom", 1);
        meal2.itemizedBill();
        System.out.println("*".repeat(20));
        meal2.changeSizeOfDrink("medium");
        meal2.itemizedBill();
        System.out.println("*".repeat(20));
        meal2.addTopping(1);
        meal2.itemizedBill();

    }
}
