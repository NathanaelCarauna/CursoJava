package factories;

import models.TaxPayer;

public class Company extends TaxPayer {
    int employeesNumber;

    /**
     * @param name
     * @param anualIncome
     * @param employeesNumber
     */
    public Company(String name, double anualIncome, int employeesNumber) {
        super(name, anualIncome);
        this.employeesNumber = employeesNumber;
    }

    @Override
    public double tax() {
        var tax = 0.16;
        if(employeesNumber >10)
            tax = 0.14;            
        return this.getAnualIncome() * tax;
    }

}
