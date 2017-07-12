// Knight.java

import java.util.ArrayList;

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

  Position moveKnight( Position Pos )
  {

    int moveType = possibleMoveType( Pos );

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

    return Pos;
  }

  public int possibleMoveType( Position p )
  {
    a = p.currentRow;
    b = p.currentColumn;

    ArrayList< Position > possibleNextMoves = new ArrayList< Position >();

    switch( p.currentRow )
    {
      case 0:
        switch( p.currentColumn )
        {
          case 0:
            {
              possibleNextMoves.add(chessBoard[1][2]);
              possibleNextMoves.add(chessBoard[2][1]);
            }
            break;
          case 1:
            {
              possibleNextMoves.add(chessBoard[3][1]);
              possibleNextMoves.add(chessBoard[2][2]);
              possibleNextMoves.add(chessBoard[0][2]);
            }
            break;
          case 2:
            {
              possibleNextMoves.add(chessBoard[4][1]);
              possibleNextMoves.add(chessBoard[3][2]);
              possibleNextMoves.add(chessBoard[0][1]);
              possibleNextMoves.add(chessBoard[2][1]);
            }
            break;
          case 3:
            {
              possibleNextMoves.add(chessBoard[5][1]);
              possibleNextMoves.add(chessBoard[4][2]);
              possibleNextMoves.add(chessBoard[1][1]);
              possibleNextMoves.add(chessBoard[2][2]);
            }
            break;
          case 4:
            {
              possibleNextMoves.add(chessBoard[6][1]);
              possibleNextMoves.add(chessBoard[5][2]);
              possibleNextMoves.add(chessBoard[2][1]);
              possibleNextMoves.add(chessBoard[3][2]);
            }
            break;
          case 5:
            {
              possibleNextMoves.add(chessBoard[7][1]);
              possibleNextMoves.add(chessBoard[6][2]);
              possibleNextMoves.add(chessBoard[3][1]);
              possibleNextMoves.add(chessBoard[4][2]);
            }
            break;
          case 6:
            {
              possibleNextMoves.add(chessBoard[7][2]);
              possibleNextMoves.add(chessBoard[4][1]);
              possibleNextMoves.add(chessBoard[5][2]);
            }
            break;
          case 7:
            {
              possibleNextMoves.add(chessBoard[5][2]);
              possibleNextMoves.add(chessBoard[6][1]);
            }
            break;
        }
        break;
      case 1:
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      case 5:
        break;
      case 6:
        break;
      case 7:
        break;
    }

  }

}
