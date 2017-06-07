// Population.java
// Population Estimates World Population For The Next Five Years

import java.util.Scanner;

public class Population
{
  public static void main(String[] args)
  {
    long population = 7500000000L;
    double rate = 0.011;

    System.out.printf("World Population After 1 Year Is %f\n", population * ( 1 + rate ));
    System.out.printf("World Population After 2 Years Is %f\n", population * ( 1 + rate) * ( 1 + rate ));
    System.out.printf("World Population After 3 Years Is %f\n", population * (1 + rate)*(1 + rate)*(1 + rate));
    System.out.printf("World Population After 4 Years Is %f\n", population *(1 + rate)*(1 + rate)*(1 + rate)*(1 + rate));
    System.out.printf("World Population After 5 Years Is %f\n", population *(1 + rate)*(1 + rate)*(1 + rate)*(1 + rate)*(1 + rate));
  }
}
