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
    a.toString();
    b.toString();
    c.toString();
    d.toString();

    a.add( b);
    a.subtract( b);

    System.out.println("Complex Numbers After Arithmetic, Notice Changes In c and d");
    c.toString();
    System.out.println("c = " + c);
    d.toString();
    System.out.println("c = " + d);

  }
}
