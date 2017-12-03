/*
 * Exercise 10.17 : Car is-a CarbonFootprint interface
 */

 public class Car implements CarbonFootprint
 {
     private String carMake;
     private int chasisseNumber;
     private double mileage; // distance covered
     private double emissionFactor;

     public Car(String carMake, int chasisseNumber, double mileage, double emissionFactor )
     {
         this.carMake = carMake;
         this.chasisseNumber = chasisseNumber;

         if (mileage <= 0.0)
             throw new IllegalArgumentException("Mileage Is Supposed To Be Positive");

         this.mileage = mileage;

         if (emissionFactor <= 0.0)
             throw new IllegalArgumentException("EmmissionFactor Is Supposed To Be Positive");

         this.emissionFactor = emissionFactor;
     }

     public String getCarMake() {
         return carMake;
     }

     public void setCarMake(String carMake) {
         this.carMake = carMake;
     }

     public int getChasisseNumber() {
         return chasisseNumber;
     }

     public void setChasisseNumber(int chasisseNumber) {
         this.chasisseNumber = chasisseNumber;
     }

     public double getMileage() {
         return mileage;
     }

     public void setMileage(double mileage) {
         if (mileage <= 0.0)
             throw new IllegalArgumentException("Mileage Is Supposed To Be Positive");
         else
             this.mileage = mileage;
     }

     public double getEmissionFactor() {
         return emissionFactor;
     }

     public void setEmissionFactor(double emissionFactor) {
         if (emissionFactor <= 0.0)
             throw new IllegalArgumentException("EmmissionFactor Is Supposed To Be Positive");
         else
             this.emissionFactor = emissionFactor;
     }

     public String toString()
     {
         return String.format("Car Make :%s, Chassisse Number: %d, Mileage :%f, Emission Factor : %f,",
                                getCarMake(), getChasisseNumber(), getMileage(), getEmissionFactor() );
     }

     @Override
     public double getCarbonFootprint()
     {
         return 0.001 * getMileage() * getEmissionFactor();
     }
 }