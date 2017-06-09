// Employee.java

public class Employee
{
  private String firstName;
  private String lastName;
  private double monthlySalary;

  public Employee( String fName, String lName, double salary)
  {
    setFirstName( fName );
    setLastName( lName );
    setMonthlySalary( salary );
  }

  public void setFirstName ( String fName )
  {
    firstName = fName;
  }

  public void setLastName( String lName )
  {
    lastName = lName;
  }

  public void setMonthlySalary( double salary )
  {
    if ( salary > 0.0 )
      monthlySalary = salary;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public double getMonthlySalary()
  {
    return monthlySalary;
  }
}
