package ClassP.Bank;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds(double funds){
        accountBalance=accountBalance+funds;
        System.out.println(accountBalance);
    }
    public void withdrawFunds(double funds){
        if(accountBalance-funds<0){
            System.out.println("Not allowed");
        }else {
            accountBalance = accountBalance - funds;
            System.out.println(accountBalance);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
