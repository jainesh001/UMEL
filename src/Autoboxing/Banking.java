package Autoboxing;


import java.util.ArrayList;
import java.util.List;

record Customer(String customerName, List<Double> transactions) {
    Customer(String name, double initialDeposit) {
        this(name, new ArrayList<Double>(5000));
        transactions.add(initialDeposit);
    }
}

class Bank {
    String bankName;
    List<Customer> customers = new ArrayList<>(5000);


    public boolean addCustomer(Customer customer) {
        for (Customer c : customers) {
            if (c.customerName().equalsIgnoreCase(customer.customerName())) {
                System.out.println("Duplicate");
                return false;
            }
        }
        customers.add(customer);
        return true;
    }

    public void addTrasaction(String name, double amount) {
        for (Customer customer : customers) {
            if (customer.customerName().equalsIgnoreCase(name)) {
                customer.transactions().add(amount);
            }
        }
    }

    public void printStatment() {
        for (Customer customer : customers) {
            System.out.println(customer.customerName());
            int i = 1;
            for (double d : customer.transactions()) {
                System.out.printf("Transaction %d : $%10.2f (%s)%n", i, d, d < 0 ? "debit" : "credit");
                i++;
            }
        }
    }
}

public class Banking {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.bankName = "HDFC";
        bank.addCustomer(new Customer("Sam", 500));
        bank.addCustomer(new Customer("Peter", 1000));
        bank.addCustomer(new Customer("Sam", 1000));
        bank.addTrasaction("Sam", 20000.121);
        bank.addTrasaction("Sam", -22.44);


        bank.printStatment();

    }

}
