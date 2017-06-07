// Self_Review_2_30.java
// Program seperates integer into digits

import java.util.Scanner;

public class Self_Review_2_30
{
  public static void main( String[] args )
  {
    System.out.println("Enter A Five-digit integer");

    int integer, buffer, K = 10000;
    int first, second, third, fourth, fifth;

    Scanner input = new Scanner ( System.in );
    integer = input.nextInt();

    buffer = integer;

    first = buffer/K;
    buffer %= K;
    if (K > 0)
      K /= 10;

    second = buffer/K;
    buffer %= K;
    if (K > 0)
      K /= 10;

    third = buffer/K;
    buffer %= K;
    if (K > 0)
      K /= 10;

    fourth = buffer/K;
    buffer %= K;
    if (K > 0)
      K /= 10;

    fifth = buffer/K;
    buffer %= K;
    if (K > 0)
      K /= 10;

    System.out.printf("%d In Digits Is %d %d %d %d %d", integer, first, second, third, fourth, fifth);

  }
}
