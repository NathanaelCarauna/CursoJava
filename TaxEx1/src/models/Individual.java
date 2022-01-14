package models;

public class Individual extends TaxPayer {
    double healthExpenditures;

    /**
     * @param name
     * @param anualIncome
     * @param healthExpenditures
     */
    public Individual(String name, double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double tax;
        if(this.anualIncome < 20000)
            tax = 0.15;
        else
            tax = 0.25;        
        return (this.getAnualIncome() * tax) - (this.healthExpenditures * 0.5);
    }

}
