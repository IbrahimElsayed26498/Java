/*
 *  Fig 9.7 BasePlusCommissioinEmployeeTest.java
 * BasePlusCommissionEmployee Test Program
 */

public class BasePlusCommissionEmployeeTest
{
    public static void main(String[] args)
    {
        // instantiate BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Bob", "Lewis", "333-33-3333", 5000, 0.04, 300);

        // get base-salaried commission employee data
        System.out.println("Employee information obtained by get methods:\n");
        System.out.printf("%s %s\n", "First Name Is ", employee.getFirstName());
        System.out.printf("%s %s\n", "Last Name Is ", employee.getLastName());
        System.out.printf("%s %s\n", "Social Security Number Is ", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross Sales Is ", employee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission  Rate Is ", employee.getCommissionRate());
        System.out.printf("%s %.2f\n", "Base Salary Is ", employee.getBaseSalary());

        employee.setBaseSalary(1000);

        System.out.printf("\n%s : \n\n%s\n", "Updated Employee Information Obtained By toStringFirst Name Is ", employee.toString());
    } // end main
} // end class BasePlusEmployeeTest