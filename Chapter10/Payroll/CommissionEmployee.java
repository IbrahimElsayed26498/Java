/*
 * Example 10.7 : CommissionEmployee Class is-a Employee Class
 */

 public class CommissionEmployee extends Employee
 {
     private double grossSales;
     private double commissionRate;

     public CommissionEmployee(String firstName, String lastName, String SSN, Date birthDate, double grossSales, double commissionRate)
     {
         super(firstName, lastName, SSN, birthDate);
         if (grossSales < 0.0)
             throw new IllegalArgumentException("Gross Sales Must Be Positive");

         this.grossSales = grossSales;

         if ((commissionRate < 0.0) || (commissionRate >= 1.0))
             throw new IllegalArgumentException("Commission Rate Must Be In [0,1]");

         this.commissionRate = commissionRate;
     }

     public double getGrossSales() {
         return grossSales;
     }

     public void setGrossSales(double grossSales) {

         if (grossSales < 0.0)
             throw new IllegalArgumentException("Gross Sales Must Be Positive");

         this.grossSales = grossSales;
     }

     public double getCommissionRate() {
         return commissionRate;
     }

     public void setCommissionRate(double commissionRate) {

         if ((commissionRate < 0.0) || (commissionRate >= 1.0))
             throw new IllegalArgumentException("Commission Rate Must Be In [0,1]");

         this.commissionRate = commissionRate;
     }

     @Override
     public double getPaymentAmount(double bonus)
     {
         return bonus + getCommissionRate() * getGrossSales();
     }

     @Override
     public String toString()
     {
         return String.format("%s, Gross Sales :%.2f, Commission Rate :%.2f", super.toString(), getGrossSales(), getCommissionRate());
     }
 }