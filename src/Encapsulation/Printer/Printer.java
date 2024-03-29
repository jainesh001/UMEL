package Encapsulation.Printer;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if ((tonerAmount <= 0 || tonerAmount > 100) || (this.tonerLevel + tonerAmount > 100)) {
            return -1;
        }
        this.tonerLevel = this.tonerLevel + tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages) {

        int pagesToPrint = pages;
        if (duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = (pages / 2) + (pages % 2);
        }
        this.pagesPrinted = this.pagesPrinted + pagesToPrint;
        return pagesToPrint;
    }
}
