// Factorials.java

public class Factorials
{
  public static void main(String[] args)
  {
    System.out.println("Table Of First 15 Factorials");

    System.out.printf("Number \t Factorial\n");

    for (int i = 0; i < 15; i++)
    {
      System.out.printf("%d \t %d\n", i + 1, factorial(i + 1) );
    }
  }

  public static int factorial( int num)
  {

    int f = 1, j;
  	while (num > 1){
  		f *= num * (num - 1);
  		num -= 2;
  	}
  	return  f;
  }
}
