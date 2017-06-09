// EmployeeTest.java

public class EmployeeTest
{
    public static void main( String[] args)
    {
      System.out.println("This program tests the Employee class");

      Employee employee1 = new Employee("Isaac", "Kamga", 100000 );
      Employee employee2 = new Employee("Akoko", "Bill", 90000);

      System.out.println("Employee 1 Details : ");
      System.out.printf("First Name : %s\n", employee1.getFirstName());
      System.out.printf("Last Name : %s\n", employee1.getLastName());
      System.out.printf("Monthly Salary : %.2f\n", employee1.getMonthlySalary());

      System.out.println("Employee 2 Details : ");
      System.out.printf("First Name : %s\n", employee2.getFirstName());
      System.out.printf("Last Name : %s\n", employee2.getLastName());
      System.out.printf("Monthly Salary : %.2f", employee2.getMonthlySalary());

      System.out.println("Employer Announces A Company-wide 10% Raise In Salaries");

      System.out.println("Employee 1 Details : ");
      System.out.printf("First Name : %s\n", employee1.getFirstName());
      System.out.printf("Last Name : %s\n", employee1.getLastName());
      System.out.printf("Monthly Salary : %.2f\n", employee1.getMonthlySalary() * 1.1 );

      System.out.println("Employee 2 Details : ");
      System.out.printf("First Name : %s\n", employee2.getFirstName());
      System.out.printf("Last Name : %s\n", employee2.getLastName());
      System.out.printf("Monthly Salary : %.2f", employee2.getMonthlySalary() * 1.1 );

    }
}
