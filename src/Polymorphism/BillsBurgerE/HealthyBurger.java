package Polymorphism.BillsBurgerE;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public HealthyBurger(String name, String meat, double price, String breadRollType, String healthyExtra1Name, String healthyExtra2Name, double healthyExtra1Price, double healthyExtra2Price) {
        super(name, meat, price, breadRollType);
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra1Price = healthyExtra1Price;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double burgerTotal = super.itemizeHamburger();
        if (healthyExtra1Name != null) {
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }
        if (healthyExtra2Name != null) {
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
        }
        return burgerTotal + healthyExtra1Price + healthyExtra2Price;
    }
}
