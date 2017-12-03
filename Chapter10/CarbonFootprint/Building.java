/*
 * Exercise 10.17 : Building Class
 */

 public class Building implements CarbonFootprint
 {
     private String roofColour;
     private String buildingType;
     private double totalWeight;

     public Building(String roofColour, String buildingType, double totalWeight)
     {
         this.roofColour = roofColour;
         this.buildingType = buildingType;

         if (totalWeight <= 1.0)
             throw new IllegalArgumentException("Building Must Be Over A Metric ton");
         else
             this.totalWeight = totalWeight;
     }

     public String getRoofColour() {
         return roofColour;
     }

     public void setRoofColour(String roofColour) {
         this.roofColour = roofColour;
     }

     public String getBuildingType() {
         return buildingType;
     }

     public void setBuildingType(String buildingType) {
         this.buildingType = buildingType;
     }

     public double getTotalWeight() {
         return totalWeight;
     }

     public void setTotalWeight(double totalWeight) {

         if (totalWeight <= 1.0)
             throw new IllegalArgumentException("Building Must Be Over A Metric ton");

         this.totalWeight = totalWeight;
     }

     public String toString()
     {
         return String.format("Roof Colour :%s, Building Type :%s, Total Mass :%f,",
                    getRoofColour(), getBuildingType(), getTotalWeight() );
     }

     @Override
     public double getCarbonFootprint()
     {
        return 0.0091 * getTotalWeight();
     }
 }