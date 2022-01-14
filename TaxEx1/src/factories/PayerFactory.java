package factories;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Individual;
import models.TaxPayer;

public class PayerFactory {
    static ArrayList payerList = new ArrayList<TaxPayer>();

    public static ArrayList<TaxPayer> createPayer(char type, Scanner sc2) throws Exception {
        String name;
        double income;
        double healthExpenditures;
        int employeesNumber;
        if (type == 'i') {
            System.out.print("Name: ");
            name = sc2.next();
            System.out.print("Anual income: ");
            income = sc2.nextDouble();
            System.out.print("Health expenditures: ");
            healthExpenditures = sc2.nextDouble();
            payerList.add(new Individual(name, income, healthExpenditures));
        } else if (type == 'c') {
            System.out.print("Name: ");
            name = sc2.next();
            System.out.print("Anual income: ");
            income = sc2.nextDouble();
            System.out.print("Number of employees: ");
            employeesNumber = sc2.nextInt();
            payerList.add(new Company(name, income, employeesNumber));
        } else {
            sc2.close();
            throw new Exception("Invalid payer type");
        }
        return payerList;
    }
}
