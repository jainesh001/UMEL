package ClassP.Inheritance.Worker;

import java.text.ParseException;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, String hireDate, double annualSalary) {
        super(name, birthDate, endDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire(){
        //as long as parent class doesn't override base class method we can use them
       terminate("12/12/2025");
       isRetired=true;
    }

    @Override
    public int getAge() throws ParseException {
        if(super.getAge()>60){
            isRetired=true;
        }else {
            isRetired=false;
        }
        return super.getAge();
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return adjustedPay;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
