/*
 * Example 10.8 : BasePlusCommissionEmployee.java BasePlusCommissionEmployee class is-a CommissionEmployee class
 */

 public class BasePlusCommissionEmployee extends CommissionEmployee
 {
     private double baseSalary;

     public BasePlusCommissionEmployee(String fNAme, String lName, String SSN, Date birthDate, double sales, double rate, double baseSalary)
     {
         super(fNAme, lName, SSN, birthDate, sales, rate);

         if ( baseSalary < 0.0)
             throw new IllegalArgumentException("Base Salary Must Be Positive");

         this.baseSalary = baseSalary;
     }

     public double getBaseSalary() {
         return baseSalary;
     }

     public void setBaseSalary(double baseSalary) {

         if ( baseSalary < 0.0)
             throw new IllegalArgumentException("Base Salary Must Be Positive");

         this.baseSalary = baseSalary;
     }

     @Override
     public double getPaymentAmount(double bonus)
     {
         return bonus + getBaseSalary() + super.getPaymentAmount(0);
     }

     @Override
     public String toString()
     {
         return String.format("%s, Base Salary :%.2f", super.toString(), getBaseSalary());
     }
 }
