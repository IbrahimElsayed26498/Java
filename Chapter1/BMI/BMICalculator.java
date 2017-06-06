// BMICalculator.java
// Program computes the Body Mass Index Of An Individual

import java.util.Scanner;

public class BMICalculator
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);

    float weight, height;
    float BMI;

    System.out.println("Enter Weight (In Kilograms) :");
    weight = input.nextFloat();

    System.out.println("Enter Height (In Metres) :");
    height = input.nextFloat();

    BMI = weight / ( height * height );

    if ( BMI < 18.5 ){
       System.out.println("Underweight : Less Than 18.5");
      }
    else if (BMI >= 18.5 && BMI <= 24.9){
            System.out.println("Normal : Between 18.5 and 24.9");
          }
    else if (BMI >= 25.0 && BMI <= 29.9){
            System.out.println("Overweight : Between 25 and 29.9");
          }
    else
      System.out.println("Obese : 30 And Over");
  }
}
