// EmployeeTest.java

public class EmployeeTest
{
  public static void main( String[] args )
  {
    // Show that count = 0
    System.out.printf("Employees Before Instantiation : %d\n", Employee.getCount());

    Date birth1 = new Date(5, 27, 1987);
    Date birth2 = new Date(1, 21, 1969);
    Date hire1 = new Date(3, 12, 1988);
    Date hire2 = new Date(3, 2, 2017);

    //Create 2 Employees; count should be 2
    Employee E1 = new Employee("Isaac", "Kamga", birth1, hire1 );
    Employee E2 = new Employee("Check", "Nyah", birth2, hire2 );

    //Show that count is 2 after creating 2 Employees
    System.out.println("\nEmployees After Instantiation: ");
    System.out.printf("Via E1.getCount(): %d\n", E1.getCount() );
    System.out.printf("Via E2.getCount(): %d\n", E2.getCount() );
    System.out.printf("Via Employee.getCount(): %d\n", Employee.getCount() );

    //Get Names Of Employees
    System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n",
                      E1.getFirstName(), E1.getLastName(),
                      E2.getFirstName(), E2.getLastName());

    E1 = null;
    E2 = null;
  }
}
