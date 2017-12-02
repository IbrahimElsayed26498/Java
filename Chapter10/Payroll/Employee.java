/*
 * Example 10.4 : Abstract Class Employee
 */

 public abstract class Employee implements Payable
 {

     private String firstName;
     private String lastName;
     private String SSN;
     private Date birthDate;

     public Employee(String firstName, String lastName, String SSN, Date birthDate)
     {
         this.firstName = firstName;
         this.lastName = lastName;
         this.SSN = SSN;
         this.birthDate = birthDate;
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

     public Date getBirthDate() { return birthDate; }

     public String toString()
     {
         return String.format("FirstName :%s, LastName :%s, Social Security Number :%s, Birth Date :%s",
                 getFirstName(), getLastName(), getSSN(), getBirthDate().toString());
     }
 }