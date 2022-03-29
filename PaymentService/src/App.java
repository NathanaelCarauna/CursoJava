import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Contract;
import service.IPaymentService;
import service.PaypalService;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
        int number, installmentsNumber;
        Date date;
        double value;
        Scanner sc = new Scanner(System.in);                

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        number = sc.nextInt();
        sc.nextLine();
        System.out.print("Date (dd/MM/yy): ");
        date = simpleDateFormat.parse(sc.nextLine());
        System.out.print("Contract value: ");
        value = sc.nextDouble();
        System.out.print("Enter number of installments: ");
        installmentsNumber = sc.nextInt();

        Contract contract = new Contract(number, date, value);
        IPaymentService paymentService = new PaypalService();
        paymentService.processContract(contract, installmentsNumber);
        
        MyPrinter.installmentPrinter(contract.getInstallments());

    }
}
