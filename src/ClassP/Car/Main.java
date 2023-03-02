package ClassP.Car;

public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        c.setMake(null);
        c.setModel("Carrera");
        c.setColor("Green");
        c.setDoors(2);
        c.setConvertible(true);

//        c.model="Carrera";
//        c.color="Red";
        System.out.println(c.getMake());
        System.out.println(c.getModel());
        c.describeCar();
    }
}
