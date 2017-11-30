/**
 * Exercise 9.15
 */
public class HourlyEmployeeTest {

    public static void main(String[] args)
    {
        HourlyEmployee hour_employee
                = new HourlyEmployee("Chi", "Jude", "123-123-123", 108, 350 );

        //get basepluscommission employment data
        System.out.println("Employee Information Obtained Through Getters");

        System.out.printf("%s %s%n", "First Name Is", hour_employee.getFirstName() );
        System.out.printf("%s %s%n", "Last Name Is", hour_employee.getLastName() );
        System.out.printf("%s %s%n", "Social Security Number Is", hour_employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Hours Worked Is", hour_employee.getHoursWorked());
        System.out.printf("%s %.2f%n", "Commission Rate Is", hour_employee.getHourlyWage());

        System.out.printf("\n%s: %s\n", "Hourly Employee Information Obtained By toString", hour_employee.toString() );

        hour_employee.setHoursWorked( 120 );
        hour_employee.setHourlyWage( 500 );

        System.out.printf("\n%s: %s\n", "Updated Employee Information Obtained By toString", hour_employee.toString() );
    }
}
