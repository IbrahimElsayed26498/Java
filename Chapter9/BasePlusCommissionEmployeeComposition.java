/*
 * Fig 9.8 : BasePlusCommissionEmployeeComposition.java
 * Implementing BasePlusCommissionEmployee - CommissionEmployee as a has-a relationship
 */

public class BasePlusCommissionEmployeeComposition
{
    private CommissionEmployee theCommissionEmployee;
    private double baseSalary; // base salary per week

    // six-argument constructor
    public BasePlusCommissionEmployeeComposition(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                                                 double commissionRate, double baseSalary)
    {
        this.theCommissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        setBaseSalary( baseSalary );
    }

    public void setFirstName( String firstName)
    {
        theCommissionEmployee.setFirstName(firstName);
    }

    public void setLastName( String lastName)
    {
        theCommissionEmployee.setLastName(lastName);
    }

    public void setSocialSecurityNumber( String socialSecurityNumber)
    {
        theCommissionEmployee.setSocialSecurityNumber(socialSecurityNumber);
    }

    public void setGrossSales( double grossSales)
    {
        theCommissionEmployee.setGrossSales(grossSales);
    }

    public void setCommissionRate ( double commissionRate )
    {
        theCommissionEmployee.setCommissionRate(commissionRate);
    }

    public void setBaseSalary ( double baseSalary )
    {
        this.baseSalary = baseSalary;
    }

    public String getFirstName(){
        return theCommissionEmployee.getFirstName();
    }
    public String getLastName(){
        return theCommissionEmployee.getLastName();
    }
    public String getSocialSecurityNumber(){
        return theCommissionEmployee.getSocialSecurityNumber();
    }
    public double getGrossSales(){
        return theCommissionEmployee.getGrossSales();
    }
    public double getCommissionRate(){
        return theCommissionEmployee.getCommissionRate();
    }
    public double getBaseSalary(){
        return this.baseSalary;
    }
    // calculate earnings
    public double earnings(){
        return getBaseSalary() + theCommissionEmployee.earnings();
    }
    // return String representation of object
    public String toString(){
        return String.format(
                "%s %s\n%s: %.2f", "base salaried", theCommissionEmployee.toString(),
                "base salary", getBaseSalary());
    }
} // end class BasePlusCommissionEmployee