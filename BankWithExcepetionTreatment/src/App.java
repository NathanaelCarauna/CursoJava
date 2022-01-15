import java.util.Scanner;

import model.entities.Account;
import model.exceptions.InvalidValueParameterException;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);
            
            System.out.print("\nEnter amount for withdraw: ");
            account.withdraw(sc.nextDouble());

            System.out.printf("New balance: $ %.2f", account.getBalance());
        } catch (InvalidValueParameterException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
