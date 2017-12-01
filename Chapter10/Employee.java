/*
 * Example 10.4 : Abstract Class Employee
 */

 public abstract class Employee
 {

     private String firstName;
     private String lastName;
     private String SSN;

     public Employee(String firstName, String lastName, String SSN)
     {
         this.firstName = firstName;
         this.lastName = lastName;
         this.SSN = SSN;
     }

     public String getFirstName()
     {
         return firstName;
     }

     public String getLastName()
     {
         return lastName;
     }

     public String getSSN()
     {
         return SSN;
     }

     public String toString()
     {
         return String.format("FirstName : %s\nLastName : %s\nSocial Security Number : %s\n", getFirstName(), getLastName(), getSSN());
     }

     //Abstract earnings() method
     public abstract double earnings(); // Implementation not here
 }