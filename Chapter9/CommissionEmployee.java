/*
 *  Fig 9.4 CommisionEmployee.java
 *  CommisionEMployee represents an employee paid a salary based on gross sales
 */

 public class CommissionEmployee extends Object {
     // protected access specifier used so that subclasses of CommissionEmployee can access it's members
     private  String firstName;
     private  String lastName;
     private  String socialSecurityNumber;
     private double grossSales; // gross sales
     private double commissionRate; // commission percentage

     public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
         // throw exception if grossSales is invalid
         if (grossSales < 0.0)
             throw new IllegalArgumentException("Gross sales must be >= 0.0");

         // throw exception if comissionRate is invalid
         if (commissionRate <= 0.0 || commissionRate > 1.0)
             throw new IllegalArgumentException("CommissionRate must be within closed interval [0.00, 1.00]");

         this.firstName = firstName;
         this.lastName = lastName;
         this.socialSecurityNumber = socialSecurityNumber;
         this.grossSales = grossSales;
         this.commissionRate = commissionRate;
     }

     public String getFirstName() {
         return firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public String getSocialSecurityNumber() {
         return socialSecurityNumber;
     }

     public double getGrossSales() {
         return grossSales;
     }

     public double getCommissionRate() {
         return commissionRate;
     }

     public void setFirstName( String firstName )
     {
         this.firstName = firstName;
     }

     public void setLastName( String lastName )
     {
         this.lastName = lastName;
     }

     public void setSocialSecurityNumber( String socialSecurityNumber)
     {
         this.socialSecurityNumber = socialSecurityNumber;
     }

     public void setGrossSales(double grossSales) {
         if (grossSales < 0.0)
             throw new IllegalArgumentException("Gross Sales Must Be >= 0.0");

         this.grossSales = grossSales;
     }

     public void setCommissionRate(double commissionRate) {
         if (commissionRate < 0.0 || commissionRate > 1.0)
             throw new IllegalArgumentException("Commission Rate Must Be In Closed Interval [0.00, 1.00]");

         this.commissionRate = commissionRate;
     }

     //calculate earnings
     public double earnings() {
         return getCommissionRate() * getGrossSales();
     }

     // return string representation of CommissionObject
     @Override // indicates that this method overrides a superclass method
     public String toString() {
         return String.format("\n\n%s%s%s: \n%s%s\n%s: %.2f\n%s: %.2f",
                         "Commission Employee : ", getFirstName(), getLastName(),
                         "Social Security Number : ", getSocialSecurityNumber(),
                         "Gross Sales : ", getGrossSales(),
                         "Commission Rate : ", getCommissionRate());
     }
 }