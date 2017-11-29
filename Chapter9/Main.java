public class Main
{
    public static void main(String[] args )
    {
       // CommissionEmployee thisCommissionEmployee = new CommissionEmployee("Isaac", "Kamga", "222-222-222", 10000.00, 0.06 );
        BasePlusCommissionEmployeeComposition bp = new BasePlusCommissionEmployeeComposition( "Isaac", "Kamga", "222-222-222", 10000.00, 0.06 , 3000.00);

        bp.toString();
    }
}