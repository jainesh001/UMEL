package Polymorphism.BillBurger;

public class SideItem {
    private String type;
    private double price;


    public SideItem() {
        this("Avacado", 1);
    }

    public SideItem(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
