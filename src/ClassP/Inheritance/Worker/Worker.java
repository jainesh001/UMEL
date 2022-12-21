package ClassP.Inheritance.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name,String birthDate, String endDate){
        this.name=name;
        this.birthDate=birthDate;
        this.endDate=endDate;
    }

    public int getAge() throws ParseException {
        Date birthDate=new SimpleDateFormat("dd/MM/yyyy").parse(this.birthDate);
        Date currentDate=new Date();
        return (int)((currentDate.getTime()-birthDate.getTime())/ (1000l * 60 * 60 * 24 * 365));
    }

    public double collectPay(){
        return 1;
    }

    public void terminate(String endDate){
        this.endDate=endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
