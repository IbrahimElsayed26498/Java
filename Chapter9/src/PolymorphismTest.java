/*
 * Figure 10.1
 */

public class PolymorphismTest
{

    public static void main(String[] args)
    {
        // Assign superclass reference to superclass variable
        CommissionEmployee commissionEmployee
                = new CommissionEmployee("Suh", "Joseph", "123-456-789", 10000, 0.06);

        // Assign subclass reference to subclass variable
        BasePlusCommissionEmployee basePlusCommissionEmployee
                = new BasePlusCommissionEmployee("Che", "Lewis" , "123-456-123", 5000, 0.06, 300 );

        // invoke toString on superclass object using superclass variable
        System.out.printf("%s %s:\n\n%s\n\n", "Call CommissionEmployee's toString with superclass reference", "to superclass object",
                commissionEmployee.toString());

        // invoke toString on subclass object using subclass variable
        System.out.printf("%s %s:\n\n%s\n\n", "Call BasePlusCommissionEmployee's toString with subclass reference", "to subclass object",
                basePlusCommissionEmployee.toString());

        // invoke toString on subclass object using superclass variable
        CommissionEmployee commissionEmployeeTwo = basePlusCommissionEmployee; //This shows that basePlusCommissionEmloyee is a commissionEmployee
        System.out.printf("%s %s:%n%n%s%n", "Call BasePlusCommissionEmployee's toString with superclass", "reference to subclass object",
                commissionEmployeeTwo.toString());
    }
}