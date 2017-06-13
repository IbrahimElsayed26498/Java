// Factorial.java

public class Factorial
{
  public static int factorial( int num )
  {
    int f = 1, j;
  	while (num > 1){
  		f *= num * (num - 1);
  		num -= 2;
  	}
  	return  f;
  }
}
