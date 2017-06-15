// Pythagorean.java

public class Pythagorean
{
  public static void main(String[] args)
  {
    System.out.println("Program Determines ALL Pythagorean triples less than 500");

    int count = 0;
    double[] base = new double[500];
    double[] height = new double[500];
    double[] hypotenuse = new double[500];

  	for (int l = 0; l < 500; l++){
  		base[l] = l + 1;
  		height[l] = l + 1;
  		hypotenuse[l] = l + 1;
  	}

  	System.out.println("Pythagorean Triples");

  	for (int i = 0; i < 500; i++)
    {
  		for (int j = 0; j < 500; j++)
      {
  			for (int k = 0; k < 500; k++)
        {
  				  if ( Math.pow(base[i], 2) + Math.pow(height[j], 2) == Math.pow(hypotenuse[k], 2))
            {
  				 	   System.out.printf("%.0f, %.0f And %.0f\n", base[i], height[j], hypotenuse[k] );
  				 	   count++;
  				  }
  			}
  		}
  	}
  	System.out.printf("There Are %d Pythagorean Triples Between 1 And 500\n", count);
  }
}
