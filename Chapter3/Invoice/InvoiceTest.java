// InvoiceTest.java

import java.util.Scanner;

public class InvoiceTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);

    String number, description;
    int quantity;
    double price;

    System.out.println("Enter Invoice Number ");
    number = input.nextLine();

    System.out.println("Enter Invoice Description ");
    description = input.nextLine();

    System.out.println("Enter Quantity Ordered ");
    quantity = input.nextInt();

    System.out.println("Enter Item Price ");
    price = input.nextDouble();

    Invoice invoice1 = new Invoice( number, description, quantity, price );

    System.out.printf("\n");
    System.out.printf("Invoice Number : %s\n", number );
    System.out.printf("Invoice Description : %s\n", description );
    System.out.printf("Quantity Ordered : %d Units\n", quantity );
    System.out.printf("Item Price : %.2f USD\n", price );

    System.out.printf("Your Invoice Amount Is %.2f USD\n", invoice1.getInvoiceAmount() );

  }
}
