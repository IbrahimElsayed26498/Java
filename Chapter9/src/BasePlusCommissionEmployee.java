/**
 * Exercise 9.15
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commmissionRate, double baseSalary )
    {
        super(firstName, lastName, socialSecurityNumber, grossSales, commmissionRate);
        setBaseSalary( baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {

        if ( baseSalary <= 0.0)
            throw new IllegalArgumentException("Base Salary Must Be Positive");

        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings()
    {
        return getBaseSalary() + getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee { " + super.toString() +
                ", baseSalary=" + baseSalary +
                " }";
    }
}