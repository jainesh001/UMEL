package Polymorphism.BillBurger;

public class Drink {
    private String type;
    private String size;
    private double price;


    public Drink() {
        this("Fanta", "small");
    }

    public Drink(String type, String size) {
        switch (size.toLowerCase().charAt(0)) {
            case 'm' -> {
                this.price = 2.00;
                this.size = "Medium";
                this.type = type;
            }
            case 'l' -> {
                this.price = 3.00;
                this.size = "Large";
                this.type = type;
            }
            default -> {
                this.price = 1.00;
                this.size = "small";
                this.type = type;
            }
        }
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void changeDrinkSize(String size) {
        switch (size.toLowerCase().charAt(0)) {
            case 'm' -> {
                this.price = 2.00;
                this.size = "Medium";
            }
            case 'l' -> {
                this.price = 3.00;
                this.size = "Large";
            }
            default -> {
                this.price = 1.00;
                this.size = "small";
            }
        }
    }
}
