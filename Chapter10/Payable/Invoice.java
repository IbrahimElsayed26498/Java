/*
 * Figure 10.12 :  Invoice.java
 * Class Invoice implements Payable interface
 */

 public class Invoice implements Payable
 {
     private final String partNumber;
     private final String partDescription;
     private int quantity;
     private double pricePerItem;

     public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem)
     {
         if (quantity < 0.0 )
             throw new IllegalArgumentException("Quantity Must Be Positive");

         if (pricePerItem < 0.0)
             throw new IllegalArgumentException("Price Per Item Must be Positive");

         this.partNumber = partNumber;
         this.partDescription = partDescription;
         this.quantity = quantity;
         this.pricePerItem = pricePerItem;
     }

     public String getPartNumber() {
         return partNumber;
     }

     public String getPartDescription() {
         return partDescription;
     }

     public int getQuantity() {
         return quantity;
     }

     public void setQuantity(int quantity) {

         if (quantity < 0.0 )
             throw new IllegalArgumentException("Quantity Must Be Positive");

         this.quantity = quantity;
     }

     public double getPricePerItem() {
         return pricePerItem;
     }

     public void setPricePerItem(double pricePerItem) {

         if (pricePerItem < 0.0 )
             throw new IllegalArgumentException("Quantity Must Be Positive");

         this.pricePerItem = pricePerItem;
     }

     public String toString()
     {
        return String.format("%s%s,%s%s,%s%2d, %s%.2f\n", "Part Number :", getPartNumber(),
                "Part Description :", getPartDescription(),
                "Quantity :", getQuantity(),
                "Price Per Item :", getPricePerItem() );
     }

     @Override
     public double getPaymentAmount()
     {
         return getQuantity() * getPricePerItem();
     }
 }