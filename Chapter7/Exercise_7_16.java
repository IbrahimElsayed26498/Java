// Exercise_7_16.java

public class Exercise_7_16
{
  public static void main(String[] args )
  {
    double[] array = new double[5];
    double total = 0;

    if ( args.length != 5 )
        System.out.println("You need to parse 5 integers through the command line");
    else
    {
        for (int i = 0; i < 5; i++)
        {
          array[i] = Double.parseDouble( args[i]);
        }

        for (double j : array)
            total += j;

        System.out.printf("The Sum Of The Command Line arguments %.1f, %.1f, %.1f, %.1f & %.1f Is %.2f.", array[0], array[1], array[2], array[3], array[4], total);
    }
  }
}
