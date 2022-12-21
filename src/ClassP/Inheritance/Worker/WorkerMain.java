package ClassP.Inheritance.Worker;

import java.text.ParseException;

public class WorkerMain {
    public static void main(String[] args) throws ParseException {
        SalariedEmployee tim=new SalariedEmployee("Joel","11/12/1950","12/20/2022","01/01/2010",60000);
        System.out.println(tim);
        System.out.println("Paycheck: "+tim.collectPay());
        tim.retire();
        System.out.println("Pension Paycheck: "+tim.collectPay());
        System.out.println("---------");

        HourlyEmployee jane=new HourlyEmployee("Jane","11/12/1990","12/20/2022","01/01/2010",40);
        System.out.println(jane);
        System.out.println("Paycheck: "+jane.collectPay());
        System.out.println("Double Paycheck: "+jane.getDoublePay());
        System.out.println("---------");

    }

}
