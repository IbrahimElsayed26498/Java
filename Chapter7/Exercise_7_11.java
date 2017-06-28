// Exercise 7.11

public class Exercise_7_11
{
  public static void main( String[] args )
  {
    int[] counts = new int[10];
    int[] bonus = new int[15];
    int[] bestScores = new int[5];
    int i , j , k ;

    // Set the 10 elements of integer array counts to zero
    System.out.println("Setting the 10 elements of array counts to zero");
    for ( i = 0; i < counts.length; i++ )
        counts[i] = 0;
    for ( i = 0; i < bestScores.length; i++ )
        System.out.printf("%d, ", counts[i]);
    System.out.println("");

    // Add 1 to each of the 15 elements of integer array bonus
    System.out.println("Add 1 to each of the 15 elements of array bonus");
    for ( j = 0; j < bonus.length; j++ )
        bonus[j] += 1;
    for (j = 0; j < bonus.length; j++ )
        System.out.printf("%d, ", bonus[j]);
    System.out.println("");

    // Display the five values of integer array bestScores in column format.
    System.out.println("Display the 5 values of integer array bestScores in column format");
    for ( k = 0; k < bestScores.length; k++ )
        System.out.printf("%d , ", bestScores[k]);
    System.out.println("");
  }
}
