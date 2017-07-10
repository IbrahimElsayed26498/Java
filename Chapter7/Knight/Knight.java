// Knight.java

public class Knight
{
  public static void main( String[] args )
  {
    final int ROWS = 8;
    final int COLUMNS = 8;

    Position[][] chessBoard = new Position[ROWS][COLUMNS];

    // Initialise the chessBoard to zero's

    for ( int row = 0; row < ROWS; row++ )
    {
        for ( int column = 0; column < COLUMNS; column++ )
        {
          chessBoard[row][column].setCurrentRow( row );
          chessBoard[row][column].setCurrentColumn( column );
          chessBoard[row][column].setValue( 0 );
        }
    }



  }

  Position moveKnight( int i, int j )
  {
    Position Pos = new Position( i, j );

    char moveType = possibleMoveType(  );

    switch ( moveType )
    {
      case 0:
        {
          i -= 1;
          j += 2;
        }
        break;
      case 1:
        {
          i -= 2;
          j += 1;
        }
        break;
      case 2:
        {
          i -= 2;
          j -= 1;
        }
        break;
      case 3:
        {
          i -= 1;
          j -= 2;
        }
        break;
      case 4:
        {
          i += 1;
          j -= 2;
        }
        break;
      case 5:
        {
          i += 2;
          j -= 1;
        }
        break;
      case 6:
        {
          i += 2;
          j += 1;
        }
        break;
      case 7:
        {
          i += 1;
          j += 2;
        }
        break;
    }

    return Pos(i, j);
  }
}
