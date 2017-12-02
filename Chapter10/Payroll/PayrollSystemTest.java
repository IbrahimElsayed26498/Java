/*
 * Figure 10.9 PayrollSystemTest.java
 * Employee Hierarchy Test Program
 */

 public class PayrollSystemTest
 {
     public static void main(String[] args)
     {
         //Create subclass objects
         SalariedEmployee salariedEmployee = new SalariedEmployee("Ayuk", "Etta", "111-111", 800.00 );
         HourlyEmployee hourlyEmployee = new HourlyEmployee("Awasum", "Yannick", "111-222", 16.75, 40.0 );
         CommissionEmployee commissionEmployee = new CommissionEmployee("Isaac", "Kamga", "111-333", 10000, 0.06 );
         BasePlusCommissionEmployee basePlusCommissionEmployee
                 = new BasePlusCommissionEmployee("Acha", "Rolence", "111-444", 5000, 0.04, 300 );

         System.out.println("Employees processed individually:");

         System.out.printf("%sEarned %.2f\n\n", salariedEmployee, salariedEmployee.earnings() );
         System.out.printf("%sEarned %.2f\n\n", hourlyEmployee, hourlyEmployee.earnings() );
         System.out.printf("%sEarned %.2f\n\n", commissionEmployee, commissionEmployee.earnings() );
         System.out.printf("%sEarned %.2f\n\n", basePlusCommissionEmployee, basePlusCommissionEmployee.earnings() );

         // Create a new Employee array
         Employee[] employees = new Employee[4];

         // Initialise Employees with objects
         employees[0] = salariedEmployee;
         employees[1] = hourlyEmployee;
         employees[2] = commissionEmployee;
         employees[3] = basePlusCommissionEmployee;

         System.out.printf("Employees processed polymorphically:\n\n");

         //Generically process all employeees in array
         for( Employee currentEmployee : employees  )
         {
             System.out.println(currentEmployee);

             //determine if employee is a basePlusCommissionEmployee
             if ( currentEmployee instanceof BasePlusCommissionEmployee )
             {
                 BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                 employee.setBaseSalary(1.10 * employee.getBaseSalary());

                 System.out.printf("New Base Salary with 10 Percent increase is: %.2f\n", employee.getBaseSalary());
             }

             System.out.printf("Earned %.2f\n\n", currentEmployee.earnings());
         }
     }
 }