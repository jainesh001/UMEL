package Polymorphism.BIllBurgerU;

public class Main {
    public static void main(String[] args) {
//        Item coke=new Item("drink","coke",1.50);
//        coke.printItem();
//        coke.setSize("LRGE");
//        coke.printItem();
//
//        Item avocado=new Item("Topping","avocado",1.50);
//        avocado.printItem();
//
//        Burger burger=new Burger("regular",4.00);
//        burger.addToppings("BACON","CHEESE","MAYO");
//        burger.printItem();

//        MealOrder regularMeal=new MealOrder();
//        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal=new MealOrder("turkey","7-up","chilli");
//        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxMeal = new MealOrder("deluxe", "7-up", "chilli");
        deluxMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO", "AVOCADO", "BACON");
        deluxMeal.setDrinkSize("SMALL");
        deluxMeal.printItemizedList();
    }
}
