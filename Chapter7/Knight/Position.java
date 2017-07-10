// Position.java

public class Position
{
  private int currentRow; // Could be in { 0, 7 }
  private int currentColumn; // Could be in { 0, 7 }
  private int value; // Could be 0,1,2

  public Position( int row, int column, int val )
  {
    setCurrentRow( row );
    setCurrentColumn( column );
    setValue( val );
  }

  public void setCurrentRow( int row )
  {
    if (( row >= 0 ) && ( row <= 7 ))
      currentRow = row;
    else
      System.out.println("You're Out Of Bounds");
  }

  public void setCurrentColumn( int column )
  {
    if (( column >= 0 ) && ( column <= 7 ))
      currentColumn = column;
    else
      System.out.println("You're Out Of Bounds");
  }

  public void setValue( int val )
  {
    if ( val >= 0 )
      value = val;
  }

  public int getCurrentRow( )
  {
    return currentRow;
  }

  public int getCurrentColumn( )
  {
    return currentColumn;
  }

  public int getValue( )
  {
    return value;
  }
}
