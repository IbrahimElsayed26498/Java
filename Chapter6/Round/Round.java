// Round.java

import java.util.Scanner;

public class Round
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);
    System.out.printf("Program Prints A Value To The Closest Integer\n");

    final int MAX = 5;

    double[] v = new double[MAX];
    double[] buffer = new double[MAX];
    double[] w = new double[MAX];
    double[] x = new double[MAX];
    double[] y = new double[MAX];
    double[] z = new double[MAX];

  	for (int i = 0; i < MAX; i++){
  		System.out.printf("Enter Value %d : ", i + 1 );
  		v[i] = input.nextDouble();
  		buffer[i] = v[i];
  		w[i] = roundToInteger(v[i]);
  		x[i] = roundToTenths(v[i]);
  		y[i] = roundToHundredths(v[i]);
  		z[i] = roundToThousands(v[i]);
  	}

  	System.out.printf("Index\tOriginal\tToInteger\tToTenths\tToHundredths\tToThousands\n");

    for (int j = 0; j < MAX; j++)
    {
        System.out.printf("%d       %.2f\t\t%.0f\t\t%.2f\t\t%.3f\t\t%.4f\t\n", j + 1, buffer[j] , w[j], x[j], y[j], z[j]);
    }
  }

  public static double roundToInteger( double number ){
  	return Math.floor( number + 0.5 );
  }
  public static double roundToTenths( double number){
  	return Math.floor( number * 10 + 0.5 )/10;
  }
  public static double roundToHundredths( double number){
  	return Math.floor( number * 100 + 0.5 )/100;
  }
  public static double roundToThousands( double number){
  	return Math.floor( number * 1000 + 0.5 )/1000;
  }
}
