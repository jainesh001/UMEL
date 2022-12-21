package ClassP.Inheritance.Animal;

public class Fish extends Animal{
    private int fins;
    private int grills;

    public Fish(String type, double weight, int fins, int grills) {
        super(type, "small", weight);
        this.fins = fins;
        this.grills = grills;
    }

    private void moveMuscles(){
        System.out.println("muscles moving");
    }

    private void moveBackFin(){
        System.out.println("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed=="fast"){
            moveBackFin();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", grills=" + grills +
                "} " + super.toString();
    }
}
