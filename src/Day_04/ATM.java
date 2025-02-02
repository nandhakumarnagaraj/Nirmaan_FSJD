package Day_04;

public class ATM {
     double balance;
     int pin;
     //constructor
    public ATM(int i,int pin) {
        this.balance = i;
        this.pin=pin;
    }
    //check balance
    public void checkBalance( int pin) { 
    	if(pin==this.pin)
        System.out.println("Current Balance: ₹" + balance);
    }
    //deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    //withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}
