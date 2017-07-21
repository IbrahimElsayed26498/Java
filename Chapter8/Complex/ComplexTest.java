// ComplexTest.java

public class ComplexTest
{
  public static void main( String[] args )
  {
    Complex a = new Complex(12.00, 3.90);
    Complex b = new Complex(2.78, 4.57);
    Complex c = new Complex();
    Complex d = new Complex();

    System.out.println("Complex Numbers a,b,c,d Before Arithmetic");
    System.out.printf("a = %s\n", a.toString());
    System.out.printf("b = %s\n", b.toString());
    System.out.printf("c = %s\n", c.toString());
    System.out.printf("d = %s\n", d.toString());

    c = a.add(b);
    d = a.subtract(b);

    System.out.println("Complex Numbers After Arithmetic [c = a + b, d = a - b], Notice Changes In c and d");
    System.out.printf("a = %s\n", a.toString());
    System.out.printf("b = %s\n", b.toString());
    System.out.printf("c = %s\n", c.toString());
    System.out.printf("d = %s\n", d.toString());

  }
}
