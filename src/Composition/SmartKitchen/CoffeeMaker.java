package Composition.SmartKitchen;

public class CoffeeMaker {

    private boolean hasWorkToDo;

    public CoffeeMaker() {
    }

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("brewing coffee");
            hasWorkToDo = false;
        }
    }
}
