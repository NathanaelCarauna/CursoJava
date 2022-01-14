import java.util.ArrayList;
import java.util.Scanner;

import factories.PayerFactory;
import models.TaxPayer;
import service.PayerPrinter;

public class App {
    

    public static void main(String[] args) throws Exception {
        ArrayList<TaxPayer> payerList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tax payers: ");
        int payersQtt = sc.nextInt();
        for (int i = 0; i < payersQtt; i++) {
            System.out.print(String.format("Tax payer #%s data:\n", i + 1));
            System.out.print("Individual or company (i/c)? ");
            char charAt = sc.next().charAt(0);
            payerList = PayerFactory.createPayer(charAt, sc);            
        }
        PayerPrinter.printPayer(payerList);
        sc.close();
    }
}
