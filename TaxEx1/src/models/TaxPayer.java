package models;


public abstract class TaxPayer {
    String name;
    double anualIncome;

    /**
     * @param name
     * @param anualIncome
     */
    public TaxPayer(String name, double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public abstract double tax();

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the anualIncome
     */
    public double getAnualIncome() {
        return anualIncome;
    }

    /**
     * @param anualIncome the anualIncome to set
     */
    public void setAnualIncome(double anualIncome) {
        this.anualIncome = anualIncome;
    }
}
