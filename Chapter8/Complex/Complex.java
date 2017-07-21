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

  public Complex add( Complex addendTwo )
  {
     Complex addendOne = this;
     return new Complex( addendOne.getRealPart() + addendTwo.getRealPart(), addendOne.getImaginaryPart() + addendTwo.getImaginaryPart());
  }

  public Complex subtract( Complex second)
  {
    Complex first = new Complex();
    return new Complex( first.getRealPart() - second.getRealPart(), first.getImaginaryPart() - second.getImaginaryPart() );
  }

  public String toString()
  {
    if ( getImaginaryPart() == 0.00 && getRealPart() == 0.00 )
      return 0.00 + " + " + getImaginaryPart() + "i";
    if (getImaginaryPart() <  0)
      return getRealPart() + " - " + (-getImaginaryPart()) + "i";

    return getRealPart() + " + " + getImaginaryPart() + "i";
  }
}
