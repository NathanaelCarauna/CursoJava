package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");

    private Date date;
    private double value;
    /**
     * @param date
     * @param value
     */
    public Installment(Date date, double value) {
        this.date = date;
        this.value = value;
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
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return  String.format("%s - R$ %.2f", simpleDateFormat.format(date), value);
    }

    
}
