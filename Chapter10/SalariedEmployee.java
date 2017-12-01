/*
 * Example 10.5 : SalariedEmployee Class is-a Employee
 */

 public class SalariedEmployee extends Employee
 {
     private double weeklySalary;

     public SalariedEmployee( String firstName, String lastName, String SSN, double weeklySalary )
     {
        super(firstName, lastName, SSN);

        if ( weeklySalary < 0.0 )
            throw new IllegalArgumentException("Weekly Salary Must Be Positive");
        this.weeklySalary = weeklySalary;
     }

     public void setWeeklySalary(double weeklySalary) {

         if( weeklySalary < 0.0)
             throw new IllegalArgumentException("Weekly Salary Must Be Positive");

         this.weeklySalary = weeklySalary;
     }

     public double getWeeklySalary() {
         return weeklySalary;
     }

     @Override
     public double earnings()
     {
         return getWeeklySalary();
     }

     @Override
     public String toString()
     {
         return String.format("%sWeekly Salary : %.2f", super.toString(), getWeeklySalary());
     }
 }