/*
 * Exercise 10.17 : CarbonFootprint class
 */

 import java.util.ArrayList;

 public class CarbonFootprintInterfaceTest
 {
     public static void main(String[] args)
     {
        ArrayList<CarbonFootprint> globalWarming = new ArrayList<CarbonFootprint>();

        Bicycle a = new Bicycle("NewBikes", 1234.00, 0.000172);
        Building b = new Building("Brown", "Bungalow", 3000.00);
        Car c = new Car("Sedan", 1112223333, 2345.00, 0.00172 );

        globalWarming.add(0, a);
        globalWarming.add(b);
        globalWarming.add(c);

        for (CarbonFootprint footprint : globalWarming)
            System.out.printf("%s Carbon Footprint: %f POUNDS\n\n", footprint, footprint.getCarbonFootprint());
     }
 }