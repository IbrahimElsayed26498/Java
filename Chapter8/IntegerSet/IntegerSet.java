// IntegerSet.java

public class IntegerSet
{
  boolean[] integerSet = new boolean[100];

  public IntegerSet()
  {
    for (int i = 0; i < 100; i++)
      integerSet[i] = false;
  }

  public boolean getElement(int i)
  {
        return integerSet[i];
  }

  public static IntegerSet union( IntegerSet setTwo )
  {

    IntegerSet setOne = new IntegerSet();
    IntegerSet setUnion = new IntegerSet();

    for (int i = 0; i < 100; i++)
    {
      if( setOne.getElement(i) == true || setTwo.getElement(i) == true)
        setUnion.insertElement(i);
      else
        setUnion.insertElement(i);
    }

    return setUnion;
  }

  public static IntegerSet intersection( IntegerSet setTwo )
  {
    int i;

    IntegerSet setOne = new IntegerSet();
    IntegerSet setIntersection = new IntegerSet();

    for (i = 0; i < 100; i++)
    {
      if( setOne.getElement(i) == true && setTwo.getElement(i) == true)
        setIntersection.insertElement(i);
      else
        setIntersection.insertElement(i);
    }

    return setIntersection;
  }

  public void insertElement( int integer )
  {
    integerSet[integer] = true;
  }

  public void deleteElement( int integer )
  {
    integerSet[integer] = false;
  }

  public void printIntegerSet()
  {
    IntegerSet set0 = new IntegerSet();

    String stringResults = toString(set0);
        System.out.printf("IntegerSet: %s\n", stringResults);
  }

  public String toString(IntegerSet unionSet)
  {
       String stringSetZero = " ";
       for (int j = 0; j < 100; j++)
          if (unionSet.getElement( j ) )
             stringSetZero += j + " ";
       //stringSetZero += ".";
       return ( stringSetZero.equals("") == true ? "---" : stringSetZero);
  }

  public boolean isEqual( IntegerSet setTwo)
  {
    IntegerSet setOne = new IntegerSet();

    for (int i = 0 ; i < 100 ; i++)
    {
      if ( setOne.getElement(i) == true)
        if ( setTwo.getElement(i) == true)
          return true;
    }
    return false;
  }
}
