// Rational.java

public class Rational
{
  private int numerator;
  private int denomenator;

  public Rational()
  {
    this(1,1);
  }

  public Rational(int top)
  {
    this(top, 1);
  }

  public Rational( int top, int bottom)
  {
    int t = gcd(top, bottom);

    if ( bottom % top == 0 || top % bottom == 0)
    {
      top /= gcd(top, bottom);
      bottom /= gcd(top, bottom);

      if ( bottom != 0)
      {
        setNumerator( top);
        setDenomenator(bottom);
      }
      else
      {
        setNumerator(0);
        setDenomenator(bottom);
      }
    }
    else
    {
      setNumerator( top );
      setDenomenator(bottom);
    }
  }

  public static int gcd(int first, int second)
  {
    if ( second == 0)
      return first;
    else
      return gcd(second, first % second);
  }

  public void setNumerator( int num )
  {
    numerator = num;
  }

  public void setDenomenator( int den )
  {
    denomenator = den;
  }

  public int getNumerator()
  {
    return numerator;
  }

  public int getDenomenator()
  {
    return denomenator;
  }

  public Rational addition( Rational second)
  {
    Rational first = this;

    int t = lcm(first.getDenomenator(), second.getDenomenator());

    int h1 = t * first.getNumerator() / first.getDenomenator();
    int h2 = t * second.getNumerator() / second.getDenomenator();

    return new Rational( h1 + h2, t );
  }

  public Rational subtraction( Rational second)
  {
    Rational first = this;

    int t = lcm(first.getDenomenator(), second.getDenomenator());

    int h1 = t * first.getNumerator() / first.getDenomenator();
    int h2 = t * second.getNumerator() / second.getDenomenator();

    return new Rational( h1 - h2, t );
  }

  public Rational multiply( Rational second )
  {
    Rational first = this;

    int n = first.getNumerator() * second.getNumerator();
    int d = first.getDenomenator() * second.getDenomenator();

    int l = gcd(n, d);

    if ( n % l == 0 && d % l == 0 )
    {
      n /= l;
      d /= l;
    }

    return new Rational(n, d);
  }

  public Rational divide( Rational second )
  {
    Rational first = this;

    int n, d, l ;

    n = first.getNumerator() * second.getDenomenator();
    d = first.getDenomenator() * second.getNumerator();

    int l1 = gcd(n, d);

    if ( n % l1 == 0 && d % l1 == 0 )
    {
      n /= l1;
      d /= l1;
    }

    return new Rational(n, d);
  }

  public String toString()
  {
    if ( getDenomenator() == 1)
       return getNumerator() + " ";
    else
       return getNumerator() + " / " + getDenomenator();
  }

  public int lcm(int first, int second)
  {
    int max = (first > second) ? first : second;

    int LCM = 0;

    do
    {
        if (max % first == 0 && max % second == 0)
        {
            LCM = max;
            break;
        }
        else
            ++max;
    } while (true);

    return LCM;
  }
}
