package Day_04;

import java.util.Scanner;

public class ATMObj {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ATM atm = new ATM(1000,1234);

		while (true) {
			System.out.println("\n==== ATM Menu ====");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				atm.checkBalance(choice);
				System.out.println("Enter the pin:");
				int pin= scanner.nextInt();
				atm.checkBalance(pin);
				break;
			case 2:
				System.out.print("Enter amount to deposit: ₹");
				double depositAmount = scanner.nextDouble();
				atm.deposit(depositAmount);
				break;
			case 3:
				System.out.print("Enter amount to withdraw: ₹");
				double withdrawAmount = scanner.nextDouble();
				atm.withdraw(withdrawAmount);
				break;
			case 4:
				System.out.println("Thank you for using the ATM. Goodbye!");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
