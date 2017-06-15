// Pi.java

public class Pi
{
  public static void main(String[] args)
  {
    System.out.printf("Program Computes The Value Of PI From A Given Series\n");

  	double[] term = new double[200000];
    double PI = 0.0;

  	for (int i = 0; i < 200000; i++)
    {
  		term[i] = ( 4 * Math.pow(-1, i)) / (2 * i + 1);
  		PI += term[i];
  	}
    System.out.printf("Your Value For PI Is %.5f", PI );
  }
}
