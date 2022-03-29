package model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private int number;
    private Date date;
    private double value;
    private List<Installment> installments;

    /**
     * @param number
     * @param date
     * @param value
     */
    public Contract(int number, Date date, double value) {
        this.number = number;
        this.date = date;
        this.value = value;
        installments = new ArrayList<>();
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * @return the installments
     */
    public List<Installment> getInstallments() {
        return installments;
    }

}
