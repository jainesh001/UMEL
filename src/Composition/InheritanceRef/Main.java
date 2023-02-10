package Composition.InheritanceRef;

public class Main {
    public static void main(String[] args) {
        ComputerCase computerCase=new ComputerCase("2209","Dell","200");
        Monitor monitor=new Monitor("23 inch Large", "Acer", 27, "2540*1440");
        Motherboard motherboard= new Motherboard("AJ-200","Asus",4,6,"v1.22");

        PersonalComputer personalComputer=new PersonalComputer("2209","Dell", computerCase,monitor,motherboard);
//        personalComputer.getMonitor().drawPixelAt(10,10,"red");
//        personalComputer.getMotherboard().loadProgram("Windows OS");
//        personalComputer.getComputerCase().pressPowerButton();
        personalComputer.powerUp();


    }
}
