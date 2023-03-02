package ClassP.Bank;

public class Main {
    public static void main(String[] args) {
//        BankAccount bankAccount=new BankAccount(123,500,"Jason","Jason.t@gmail.com",8888888);
        BankAccount bankAccount = new BankAccount();
//        bankAccount.setAccountNumber(567);
//        bankAccount.setAccountBalance(400);
//        bankAccount.setCustomerName("Sam wills");
//        bankAccount.setEmail("sam.wills@gmail.com");
//        bankAccount.setPhoneNumber(9898981111L);

        System.out.println(bankAccount.toString());
        bankAccount.depositFunds(100);
        bankAccount.withdrawFunds(200);
        bankAccount.withdrawFunds(301);
        System.out.println(bankAccount.toString());
        BankAccount nAccount = new BankAccount("AZ", "az@gmail.com", 66666);
        System.out.println(nAccount.toString());


    }
}
