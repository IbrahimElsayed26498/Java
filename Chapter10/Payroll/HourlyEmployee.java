/*
 * Example 10.6 : HourlyEmployee.java is-a Employee
 */

 public class HourlyEmployee extends Employee
 {
     private double hourlyWage;
     private double hoursWorked;

     public HourlyEmployee(String firstName, String lastName, String SSN, Date birthDate, double hourlyWage, double hoursWorked)
     {
         super(firstName, lastName, SSN, birthDate);
         if ( hourlyWage <= 0.0 )
             throw new IllegalArgumentException("Hourly Wage Must Be Positive");
         else // hourlyWage > 0
             this.hourlyWage = hourlyWage;

         if ( (hoursWorked <= 0.0) || (hoursWorked > 168.0))
             throw new IllegalArgumentException("Hours Worked Must Be In Positive Interval ]0,168]");
         else
             this.hoursWorked = hoursWorked;
     }

     public double getHourlyWage()
     {
         return hourlyWage;
     }

     public void setHourlyWage(double hourlyWage)
     {

         if ( hourlyWage <= 0.0 )
             throw new IllegalArgumentException("Hourly Wage Must Be Positive");
         else // hourlyWage > 0
             this.hourlyWage = hourlyWage;
     }

     public double getHoursWorked()
     {
         return hoursWorked;
     }

     public void setHoursWorked(double hoursWorked)
     {

         if ( (hoursWorked <= 0.0) || (hoursWorked > 168.0))
             throw new IllegalArgumentException("Hours Worked Must Be In Positive Interval ]0,168]");
         else
             this.hoursWorked = hoursWorked;
     }

     // calculate earnings by overriding abstract method earnings()
     @Override
     public double getPaymentAmount(double bonus)
     {
         if ( getHoursWorked() <= 40.0)
             return bonus + getHoursWorked() * getHourlyWage();
         else
             return bonus + 40.0 * getHourlyWage() + (getHoursWorked() - 40.0 ) * 1.5 * getHourlyWage();
     }

     // return String representation of Employee
     @Override
     public String toString()
     {
         return String.format("%s, Hourly Wage : %.2f, Hours Worked : %.2f", super.toString(), getHourlyWage(), getHoursWorked() );
     }
 }