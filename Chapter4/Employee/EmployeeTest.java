// EmployeeTest.java

import java.util.Scanner;

public class EmployeeTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner( System.in );

    double basicRate, overtimeRate, hoursWorked;

    Employee Angela = new Employee( 40.0, 0.0 );
    Employee Berka = new Employee( 40.0, 0.0 );
    Employee Carlson = new Employee( 40.0, 0.0 );
    Employee Dedey = new Employee( 40.0, 0.0 );

    System.out.println("Enter The Basic Hourly Rate : ");
    basicRate = input.nextDouble();

    System.out.println("Enter The Overtime Hourly Rate : ");
    overtimeRate = input.nextDouble();

    System.out.println("Enter Hours Worked For Employee 1 Angela : ");
    hoursWorked = input.nextDouble();
    if ( hoursWorked > 40 )
    {
      Angela.setBasicTime( 40.0 );
      Angela.setOverTime( hoursWorked - 40.0 );
    }
    else
    {
      Angela.setBasicTime( hoursWorked );
      Angela.setOverTime( 0.0 );
    }

    System.out.printf("Your weekly wage is USD %.2f\n", Angela.getBasicTime() * basicRate + Angela.getOverTime() * overtimeRate );

    System.out.println("Enter Hours Worked For Employee 2 Berka : ");
    hoursWorked = input.nextDouble();
    if ( hoursWorked > 40 )
    {
      Berka.setBasicTime( 40.0 );
      Berka.setOverTime( hoursWorked - 40.0 );
    }
    else
    {
      Berka.setBasicTime( hoursWorked );
      Berka.setOverTime( 0.0 );
    }

    System.out.printf("Your weekly wage is USD %.2f\n", Berka.getBasicTime() * basicRate + Berka.getOverTime() * overtimeRate );

    System.out.println("Enter Hours Worked For Employee 3 Carlson : ");
    hoursWorked = input.nextDouble();
    if ( hoursWorked > 40 )
    {
      Carlson.setBasicTime( 40.0 );
      Carlson.setOverTime( hoursWorked - 40.0 );
    }
    else
    {
      Carlson.setBasicTime( hoursWorked );
      Carlson.setOverTime( 0.0 );
    }

    System.out.printf("Your weekly wage is USD %.2f\n", Carlson.getBasicTime() * basicRate + Carlson.getOverTime() * overtimeRate );

    System.out.println("Enter Hours Worked For Employee 2 Dedey : ");
    hoursWorked = input.nextDouble();
    if ( hoursWorked > 40 )
    {
      Dedey.setBasicTime( 40.0 );
      Dedey.setOverTime( hoursWorked - 40.0 );
    }
    else
    {
      Dedey.setBasicTime( hoursWorked );
      Dedey.setOverTime( 0.0 );
    }

    System.out.printf("Your weekly wage is USD %.2f\n", Dedey.getBasicTime() * basicRate + Dedey.getOverTime() * overtimeRate );

  }
}
