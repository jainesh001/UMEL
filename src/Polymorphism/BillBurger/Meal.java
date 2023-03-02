package Polymorphism.BillBurger;

public class Meal {
    private String type;
    private Hamburger hamburger;
    private Drink drink;
    private SideItem sideItem;
    private double price;

    public Meal() {
        hamburger = new Hamburger("regular");
        drink = new Drink();
        sideItem = new SideItem();
        this.price = 10;
    }

    public Meal(String type, int toppings) {
        this.hamburger = new Hamburger(type);
        hamburger.addTopping(toppings);
        drink = new Drink();
        sideItem = new SideItem();
        this.price = hamburger.getPrice();
    }

    public void addTopping(int topping) {
        hamburger.addTopping(topping);
    }

    public void changeSizeOfDrink(String size) {
        drink.changeDrinkSize(size);
    }

    public void itemizedBill() {

        this.price = hamburger.getPrice() + drink.getPrice() + sideItem.getPrice();
        if (hamburger.getType().equals("Delux")) {
            System.out.println("Delux combo price upto 7 topping is " + hamburger.getPrice() + " toppings ordered " + hamburger.getTopping());
        } else {
            System.out.println("Burger price :" + (hamburger.getPrice() - (2 * hamburger.getTopping())));
            System.out.println("Toppings ordered :" + hamburger.getTopping() + " price is :" + (2 * hamburger.getTopping()));
            System.out.println("Drink price for size :" + drink.getSize() + " is :" + drink.getPrice());
            System.out.println("Side Item price :" + sideItem.getPrice());
            System.out.println("total price:" + this.price);
        }
    }
}
