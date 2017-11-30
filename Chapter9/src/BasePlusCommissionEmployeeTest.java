/**
 * Exercise 9.14
 */
public class BasePlusCommissionEmployeeTest {

    public static void main(String[] args )
    {
        //Instantiate BasePlusCommission Employee Object
        BasePlusCommissionEmployee base_comm_employee = new BasePlusCommissionEmployee("Chamaya", "Jude", "222-222-222", 10000, 0.06, 500 );

        //get basepluscommission employment data
        System.out.println("Employee Information Obtained Through Getters");

        System.out.printf("%s %s%n", "First Name Is", base_comm_employee.getFirstName() );
        System.out.printf("%s %s%n", "Last Name Is", base_comm_employee.getLastName() );
        System.out.printf("%s %s%n", "Social Security Number Is", base_comm_employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross Sales Is", base_comm_employee.getGrossSales() );
        System.out.printf("%s %.2f%n", "Commission Rate Is", base_comm_employee.getCommissionRate() );
        System.out.printf("%s %.2f%n", "Base Salary Is", base_comm_employee.getBaseSalary() );

        System.out.printf("\n%s: %s\n", "Same Employee Information Obtained By toString", base_comm_employee.toString() );

        base_comm_employee.setGrossSales(5000);
        base_comm_employee.setCommissionRate(0.1);
        base_comm_employee.setBaseSalary(600);

        System.out.printf("\n%s: %s\n", "Updated Employee Information Obtained By toString", base_comm_employee.toString() );
    }
}
