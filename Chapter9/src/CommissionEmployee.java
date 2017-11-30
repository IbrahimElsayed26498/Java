/**
 * Exercise 9.14.
 */
public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee( String fName, String lName, String sSN, double sales, double rate)
    {
        super(fName, lName, sSN);
        this.grossSales = sales;
        this.commissionRate = rate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSales(double sales) {

        if ( sales <= 0.0 )
            throw new IllegalArgumentException("Gross Sales Must Be Positive");

        this.grossSales = sales;
    }

    public void setCommissionRate(double rate) {

        if ( rate <= 0.0 )
            throw new IllegalArgumentException("Commission Rate Must Be Positive");

        this.commissionRate = rate;
    }

    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return "CommissionEmployee { " + super.toString() +
                " grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                " }";
    }
}
