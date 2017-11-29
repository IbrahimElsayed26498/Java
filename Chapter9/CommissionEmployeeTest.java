// Fig 9.5 CommissionEmployeeTest.java
// Commission Employee Test Program

public class CommissionEmployeeTest
{
    public static void main(String[] args )
    {
        //Instantiate Commission Employee Object
        CommissionEmployee employee = new CommissionEmployee("Suh", "Jones", "222-222-222", 10000, 0.06 );

        //get commission employment data
        System.out.println("Employee Infomration Obtained Through Getters");

        System.out.printf("%s %s%n", "First Name Is", employee.getFirstName() );
        System.out.printf("%s %s%n", "Last Name Is", employee.getLastName() );
        System.out.printf("%s %s%n", "Social Security Number Is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross Sales Is", employee.getGrossSales() );
        System.out.printf("%s %.2f%n", "Commission Rate Is", employee.getCommissionRate() );

        employee.setGrossSales(5000);
        employee.setCommissionRate(0.1);

        System.out.printf("\n%s: %s\n", "Updated Employee Information Obtained By toString", employee );
    }
}