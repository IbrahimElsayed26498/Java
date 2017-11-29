/*
 * Fig 9.8 : BasePlusCommissionEmployee.java
 * Only protected and public superclass members can be inherited by subclasses
 */

public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseSalary; // base salary per week

    //six-argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName,
                                         String socialSecurityNumber, double grossSales,
                                         double commissionRate, double baseSalary)
    {
        // explicit call to the superclass CommissionEmployee constructor
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        // if baseSalary is invalid, then throw exception
        if (baseSalary < 0.0 )
            throw new IllegalArgumentException("Base Salary Must Be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // set base salary
    public void setBaseSalary(double baseSalary)
    {
        if (baseSalary < 0.0 )
            throw new IllegalArgumentException("Base Salary Must Be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // return base salary
    public double getBaseSalary()
    {
        return baseSalary;
    }

    //calculate earnings
    @Override
    public double earnings()
    {
        return getBaseSalary() + super.earnings();
    }

    // return String representation of BasePlusCommissionEmployee
    @Override
    public String toString()
    {
        // not allowed : attempt to access private superclass members
        return String.format("%s: %s \n%s : %.2f",
                "Base-salaried Commission Employee", super.toString(), "Base Salary", getBaseSalary() );
    }
} // end class BasePlusCommissionEmployee