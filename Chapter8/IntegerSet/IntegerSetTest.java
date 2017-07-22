// integerSetTest.java

public class IntegerSetTest
{
  public static void main( String[] args )
  {
    IntegerSet set1 = new IntegerSet();
    IntegerSet set2 = new IntegerSet();
    set1.insertElement(3);
    set1.printIntegerSet();
    set2.insertElement(5);
    set2.printIntegerSet();
    set1.union( set2 );
    set1.printIntegerSet();
  }
}
