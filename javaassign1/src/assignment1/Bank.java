
package assignment1;


public class Bank {
    
    private int accountNumber;
    private double balance;

    Bank(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    public void display() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank b = new Bank(12345, 4000);
        b.deposit(3000);
        b.withdraw(1000);
        b.display();
    }

}
