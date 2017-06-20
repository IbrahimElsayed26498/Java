// Temperature.java

public class Temperature
{
  public static void main( String[] args )
  {
    System.out.printf(" Program prints charts of celcius and fahrenheit temperatures \n");
  	System.out.printf(" Chart of Fahrenheit Equivalents of Celcuis temperatures\n");
  	System.out.printf("Celcius \t Fahrenheit \n\n");

  	for (int i = 0; i <= 100; i += 5){
  		System.out.printf("%d °C \t\t %.2f °F \n", i, fahrenheit(i));
  	}

  	System.out.printf("Chart of Celcuis Equivalents of Fahrenheit temperatures\n\n");
  	System.out.printf("Fahrenheit \t Celcius \n\n");

    for (int j = 32; j <= 212; j += 5){
  		System.out.printf(" %.2f °F \t\t %.2f °C\n", fahrenheit(j), celcius(j) );
  	}
  }

  public static double celcius( double f )
  {
  	return 5 * (f - 32) / 9;
  }
  public static double fahrenheit(double c){
  	return 9 * c / 5 + 32;
  }
}
