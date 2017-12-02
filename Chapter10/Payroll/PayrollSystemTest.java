/*
 * Figure 10.9 PayrollSystemTest.java
 * Employee Hierarchy Test Program
 */

 public class PayrollSystemTest
 {
     public static void main(String[] args)
     {
         //Create subclass objects
         SalariedEmployee salariedEmployee = new SalariedEmployee("Ayuk", "Etta", "111-111", new Date(10,10,1991), 800.00 );
         HourlyEmployee hourlyEmployee = new HourlyEmployee("Awasum", "Yannick", "111-222", new Date(12, 5,1991), 16.75, 40.0 );
         CommissionEmployee commissionEmployee = new CommissionEmployee("Isaac", "Kamga", "111-333", new Date(5,27,1987), 10000, 0.06 );
         BasePlusCommissionEmployee basePlusCommissionEmployee
                 = new BasePlusCommissionEmployee("Acha", "Rolence", "111-444", new Date(12, 23, 1995), 5000, 0.04, 300 );
         PieceWorker pieceWorkerEmployee = new PieceWorker("Akoko", "Bill-Elton", "111-555", new Date(12, 5, 1992), 4.50, 100 );

         System.out.println("Employees processed individually:\n");

         System.out.printf("%s Has Earned %.2f USD\n\n", salariedEmployee, salariedEmployee.getPaymentAmount(0) );
         System.out.printf("%s has Earned %.2f USD\n\n", hourlyEmployee, hourlyEmployee.getPaymentAmount(0) );
         System.out.printf("%s Has Earned %.2f USD\n\n", commissionEmployee, commissionEmployee.getPaymentAmount(0) );
         System.out.printf("%s Has Earned %.2f USD\n\n", basePlusCommissionEmployee, basePlusCommissionEmployee.getPaymentAmount(0) );
         System.out.printf("%s Has Earned %.2f USD\n\n", pieceWorkerEmployee, pieceWorkerEmployee.getPaymentAmount(0));

         // Create a new Employee array
         Employee[] employees = new Employee[5];

         int currentMonth = 12; // December

         double birthMonthPresent = 100.00; // birth month present

         // Initialise Employees with objects
         employees[0] = salariedEmployee;
         employees[1] = hourlyEmployee;
         employees[2] = commissionEmployee;
         employees[3] = basePlusCommissionEmployee;
         employees[4] = pieceWorkerEmployee;

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

             if ( currentEmployee.getBirthDate().getMonth() == currentMonth )
                 System.out.printf("Has Earned %.2f USD\n", currentEmployee.getPaymentAmount(birthMonthPresent));
             else
                 System.out.printf("Has Earned %.2f USD\n", currentEmployee.getPaymentAmount(0.00));
         }
     }
 }