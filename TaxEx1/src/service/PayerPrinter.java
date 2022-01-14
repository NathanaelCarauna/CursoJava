package service;

import java.util.ArrayList;

import models.TaxPayer;

public class PayerPrinter {
    public static void printPayer(ArrayList<TaxPayer> payerList){        
        System.out.println("\nTAXES PAID");
        for (TaxPayer taxPayer : payerList) {
            System.out.printf("%s: $ %.2f\n", taxPayer.getName(), taxPayer.tax());                        
        }
        double total =  payerList.stream().map(payer -> payer.tax()).reduce(0.0, Double::sum);
        System.out.printf("\nTOTAL TAXES: $ %.2f", total);
    }
}
