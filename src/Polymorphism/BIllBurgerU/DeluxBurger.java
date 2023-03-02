package Polymorphism.BIllBurgerU;

public class DeluxBurger extends Burger {
    private Item deluxItem1;
    private Item deluxItem2;

    public DeluxBurger(String name, double price) {
        super(name, price);
    }

    @Override
    public double getAdjustedPrice() {
        return this.getBasePrice();
    }

    public void addToppings(String extra1, String extra2, String extra3, String deluxItem1, String deluxItem2) {
        super.addToppings(extra1, extra2, extra3);
        this.deluxItem1 = new Item("TOPPING", deluxItem1, 0);
        this.deluxItem1 = new Item("TOPPING", deluxItem1, 0);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (deluxItem1 != null) {
            deluxItem1.printItem();
        }
        if (deluxItem2 != null) {
            deluxItem2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}