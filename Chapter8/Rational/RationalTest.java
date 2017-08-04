// RationalTest.java

public class RationalTest
{
  public static void main( String[] args)
  {
    Rational a = new Rational(2,5);
    Rational b = new Rational(4,7);
    Rational c = new Rational(6);
    Rational d = new Rational();
    Rational e = new Rational();
    Rational f = new Rational();
    Rational g = new Rational();
    Rational h = new Rational();


    System.out.println("Rational Numbers ( Fractions ) a,b,c,d Before Arithmetic");
    System.out.printf("a = %s\n", a.toString());
    System.out.printf("b = %s\n", b.toString());
    System.out.printf("c = %s\n", c.toString());
    System.out.printf("d = %s\n", d.toString());

    e = a.addition(b); // e = a + b
    f = b.subtraction(a); // f = b - a
    g = c.divide(a); // g = c / a
    h = f.multiply(c); // h = f * c

    System.out.println("Rational Numbers ( Fractions ) a,b,c,d Before Arithmetic");
    System.out.printf("e = a + b = %s\n", e.toString());
    System.out.printf("f = b - a = %s\n", f.toString());
    System.out.printf("g = c / a =  %s\n", g.toString());
    System.out.printf("h = f * c = %s\n", h.toString());

  }
}
