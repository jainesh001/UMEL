package Encapsulation.Printer;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if(tonerLevel<0){
            this.tonerLevel=0;
        }else if(tonerLevel>100){
            this.tonerLevel=100;
        }else{
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerLevel){
        if(this.tonerLevel+tonerLevel<0 || this.tonerLevel+tonerLevel>100) {
            return -1;
        }
        this.tonerLevel=this.tonerLevel+tonerLevel;
        return this.tonerLevel;
    }

    public int printPages(int pagesPrinted){
        if(duplex){
            System.out.println("It's a duplex printer");
            int sheetsOfPaper=(pagesPrinted/2)+(pagesPrinted%2);
            this.pagesPrinted=this.pagesPrinted+sheetsOfPaper;
        }else{
            this.pagesPrinted=this.pagesPrinted+pagesPrinted;
        }
        return this.pagesPrinted;
    }
}
