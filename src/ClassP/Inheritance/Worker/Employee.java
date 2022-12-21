package ClassP.Inheritance.Worker;

public class Employee extends Worker{
    private long employeeId;
    protected String hireDate;

    private static int employeeNo=1;

    public Employee(String name,String birthDate, String endDate,String hireDate ){
        super(name,birthDate,endDate);
        this.employeeId=Employee.employeeNo++;
        this.hireDate=hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
