/*
 * Exercise 10.17 : Bicycle class
 */

 public class Bicycle implements CarbonFootprint
 {
     private String bikeMake;
     private double mileage;
     private double emissionFactor;

     public Bicycle(String bikeMake, double mileage, double emissionFactor)
     {
         this.bikeMake = bikeMake;

         if (mileage < 0.0)
             throw new IllegalArgumentException("Mileage Must Be Positive");
         else
             this.bikeMake = bikeMake;

         if (emissionFactor < 0.0)
             throw new IllegalArgumentException("Emission Factor Must Be Positive");
         else
             this.emissionFactor = emissionFactor;
     }

     public String getBikeMake() {
         return bikeMake;
     }

     public void setBikeMake(String bikeMake) {
         if (mileage < 0.0)
             throw new IllegalArgumentException("Mileage Must Be Positive");
         else
             this.bikeMake = bikeMake;
     }

     public double getMileage() {
         return mileage;
     }

     public void setMileage(double mileage) {
         if (emissionFactor < 0.0)
             throw new IllegalArgumentException("Emission Factor Must Be Positive");
         else
             this.emissionFactor = emissionFactor;
     }

     public double getEmissionFactor() {
         return emissionFactor;
     }

     public void setEmissionFactor(double emissionFactor) {
         this.emissionFactor = emissionFactor;
     }

     public String toString()
     {
         return String.format("Bike Make :%s, Mileage :%f, Emission Factor :%f,", getBikeMake(), getMileage(), getEmissionFactor() );
     }

     @Override
     public double getCarbonFootprint()
     {
         return 0.0001 * getMileage() * getEmissionFactor();
     }
 }