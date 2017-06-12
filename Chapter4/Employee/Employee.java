// Employee.java

public class Employee
{
  private double basicTime;
  private double overTime;

  public Employee( double basic, double overtime )
  {
    setBasicTime( basic );
    setOverTime( overtime );
  }

  public void setBasicTime( double basicT )
  {
    basicTime = basicT;
  }

  public void setOverTime( double overtimeT )
  {
    overTime = overtimeT;
  }

  public double getBasicTime( )
  {
    return basicTime;
  }

  public double getOverTime( )
  {
    return overTime;
  }
}
