package Polymorphism.BillBurger;

public class Hamburger {
    private String type;
    private double price;
    private int topping;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTopping() {
        return topping;
    }

    public void setTopping(int topping) {
        this.topping = topping;
    }

    public Hamburger(String type) {
        this(type, 3);
    }

    public Hamburger(String type, double price) {
        this.type = type;
        if (type.equals("regular")) {
            this.type = "regular";
            this.price = 5;
        } else if (type.equals("Delux")) {
            this.type = "Delux";
            this.price = 7;
        } else {
            this.price = price;
        }
    }

    public void addTopping(int topping) {
        if (this.type.equals("Delux")) {
            System.out.println("Delux Meal");
            if (this.topping + topping > 7) {
                System.out.println("More than 7 topping is not allowed");
                this.topping = 7;
            } else {
                this.topping += topping;
                System.out.printf("Topping requested %d : is free%n", topping);
            }
            System.out.printf("Total Topping : %d and total price: %d %n", this.topping, 0);
        } else {
            System.out.println("Not a Delux Meal");
            if (this.topping + topping <= 3) {
                System.out.printf("Topping requested %d : is allowed and 2 dollars each%n", topping);
                this.topping += topping;
                for (int i = 0; i < topping; i++) {
                    this.price += 2;
                }
            } else {
                System.out.println("More than 3 topping is not allowed");
                this.topping = 3;
                this.price += 6;
            }
            System.out.printf("Total Topping : %d and total topping price : %d and total price: %f %n ", this.topping, (2 * this.topping), this.price);
        }
    }
}
