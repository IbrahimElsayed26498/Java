// Employee.java

public class Employee
{
  private String firstName;
  private String lastName;
  private Date birthDate;
  private Date hireDate;
  private static int count = 0; // number of employees created

  public Employee( String first, String last, Date dateOfBirth, Date dateOfHire )
  {
    firstName = first;
    lastName = last;
    birthDate = dateOfBirth;
    hireDate = dateOfHire;

    ++count;
    System.out.printf("Employee constructor: %s %s Hired : %s Birthday: %s; count = %d\n",
            firstName, lastName, birthDate, hireDate, count);
  }

  public String toString()
  {
    return String.format("%s, %s Hired : %s Birthday : %s", firstName, lastName, hireDate, birthDate);
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public static int getCount()
  {
    return count;
  }
}
