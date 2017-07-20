// Complex.java
// Defines class to manipulate complex numbers

public class Complex
{
  private double realPart; // real portion
  private double imaginaryPart; // imaginary portion

  Complex()
  {
    this(0.00, 0.00);
  }

  Complex(double theRealPart)
  {
    this( theRealPart, 0.00);
  }

  Complex( double theRealPart, double theImaginaryPart)
  {
    setRealPart( theRealPart);
    setImaginaryPart( theImaginaryPart );
  }

  public void setRealPart( double theRealPart )
  {
    realPart = theRealPart;
  }

  public void setImaginaryPart( double theImaginaryPart)
  {
    imaginaryPart = theImaginaryPart;
  }

  public double getRealPart()
  {
    return realPart;
  }

  public double getImaginaryPart()
  {
    return imaginaryPart;
  }

  public Complex add( Complex addendOne, Complex addendTwo )
  {
    return new Complex( addendOne.getRealPart() + addendTwo.getRealPart(), addendOne.getImaginaryPart() + addendTwo.getImaginaryPart());
  }

  public Complex subtract(Complex first, Complex second)
  {
    Complex difference = new Complex();

    difference.setRealPart( first.getRealPart() - second.getRealPart());
    difference.setImaginaryPart( first.getImaginaryPart() - second.getImaginaryPart());

    return difference;
  }

  public String printComplex()
  {
    return String.format("( %.2f + %.2f i )", getRealPart(), getImaginaryPart());
  }

}
