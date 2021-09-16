package bankEx1;

import java.util.Scanner;

import model.Account;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = null;

		int number;
		double value = 0;
		String holder;
		char initialDeposit;
		boolean canContinue = false;

		System.out.print("Enter account number: ");
		number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		holder = sc.nextLine();
		do {
			System.out.print("Is there an initial deposit (y/n)? ");
			initialDeposit = sc.next().charAt(0);
			if (initialDeposit == 'y') {
				canContinue = true;
				System.out.print("Enter initial deposit value: ");
				value = sc.nextDouble();
			}
			else if (initialDeposit == 'n')
				canContinue = true;
			else {
				System.out.printf("\"%s\" is not a valid answer\n", initialDeposit);
			}
		} while (!canContinue);

		try {
			account = new Account(number, holder, value);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\nAccount data: ");
		System.out.println(account);

		System.out.print("\nEnter a deposit value: ");
		value = sc.nextDouble();
		try {
			account.deposit(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.print("\nEnter a withdraw value: ");
		value = sc.nextDouble();
		try {
			account.withdraw(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Updated account data: ");
		System.out.println(account);
		sc.close();
	}
}
