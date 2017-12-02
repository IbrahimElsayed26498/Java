/*
 * PayableInterfaceTest.java
 * Payable interface test program processing Invoices and Employees porlymorphically
 */

 public class PayableInterfaceTest
 {
     public static void main(String[] args)
     {
         Payable[] payableObjects = new Payable[6];

         Date firstDate = new Date(12,2,2017);
         Date secondDate = new Date(1,3,2017);
         payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
         payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
         payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", firstDate, 800.00 );
         payableObjects[3] = new HourlyEmployee("Lisa", "Barnes", "222-22-2222", secondDate, 12.00, 96.00);
         payableObjects[4] = new CommissionEmployee("Cardinal", "Cody", "333-33-3333", new Date(1,3,1997), 8000.00, 0.06 );
         payableObjects[5] = new BasePlusCommissionEmployee("Blender", "Barnes", "444-44-4444", new Date(11,3,1986), 10000.00, 0.06, 120.00);

         System.out.println("Invoices and Employees processed polymorphically:\n");

         for (Payable currentPayables : payableObjects)
         {
             System.out.printf("%s", currentPayables);

             //determine if employee is a basePlusCommissionEmployee
             if ( currentPayables instanceof BasePlusCommissionEmployee )
             {
                 BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayables;

                 employee.setBaseSalary(1.10 * employee.getBaseSalary());

                 System.out.printf(" New Base Salary with 10 Percent increase is: %.2f", employee.getBaseSalary());
             }

             if (currentPayables instanceof Invoice )
                 System.out.printf("Costs %.2f USD\n\n", currentPayables.getPaymentAmount());
             else
                System.out.printf(" Has Earned %.2f USD\n", currentPayables.getPaymentAmount());
         }
     }
 }