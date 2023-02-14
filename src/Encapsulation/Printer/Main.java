package Encapsulation.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer=new Printer(20,30,true);
        System.out.println(printer.addToner(90));
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.printPages(31));
    }
}
