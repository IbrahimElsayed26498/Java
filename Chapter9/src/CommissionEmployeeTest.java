/**
 * Exercise 9.14
 */
public class CommissionEmployeeTest {

    public static void main(String[] args )
    {
        //Instantiate Commission Employee Object
        CommissionEmployee comm_employee = new CommissionEmployee("Suh", "Jones", "222-222-222", 10000, 0.06 );

        //get commission employment data
        System.out.println("Employee Information Obtained Through Getters");

        System.out.printf("%s %s%n", "First Name Is", comm_employee.getFirstName() );
        System.out.printf("%s %s%n", "Last Name Is", comm_employee.getLastName() );
        System.out.printf("%s %s%n", "Social Security Number Is", comm_employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross Sales Is", comm_employee.getGrossSales() );
        System.out.printf("%s %.2f%n", "Commission Rate Is", comm_employee.getCommissionRate() );

        System.out.printf("\n%s: %s\n", "Same Employee Information Obtained By toString", comm_employee.toString() );

        comm_employee.setGrossSales(5000);
        comm_employee.setCommissionRate(0.1);

        System.out.printf("\n%s: %s\n", "Updated Employee Information Obtained By toString", comm_employee.toString() );
    }
}
