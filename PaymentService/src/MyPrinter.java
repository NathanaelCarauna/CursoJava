import java.util.List;

import model.Installment;

public class MyPrinter {

    public static void installmentPrinter(List<Installment> installments) {
        System.out.println("Installments: ");
        for (Installment installment : installments) {
            System.out.println(installment);            
        }
    }

}
