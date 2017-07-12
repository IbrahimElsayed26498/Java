// Knight.java

import java.util.ArrayList;
import java.util.Random;

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

    ArrayList< Position > listOfMoves = new ArrayList< Position >();

    Position currentPosition = new Position(0,0,0);
    Position p = new Position();

    int i = 1;
    int colouredPositions = 0;
    do
    {
      listOfMoves = possibleMoves( currentPosition );



      p = selectPosition( listOfMoves );
      p.setValue(++getValue());
      colouredPositions++;

      currentPosition = p;

    } while (i <= 64);

    // Display The ChessBoard

    for ( int row = 0; row < ROWS; row++ )
    {
        for ( int column = 0; column < COLUMNS; column++ )
        {

          System.out.printf("%d  ", chessBoard[row][column].getValue());

        }
        System.out.println();
    }

  }

  public static Position selectPosition( ArrayList< Position > list )
  {
    for ( Position count : listOfMoves )
    {
      if ( count.getValue() >= 1 )
        listOfMoves.remove(count);
    }

    int k = list.size();

    private static Random randomNumber = new Random();

    int die = randomNumber.nextInt(k);

    return list.get( die );
  }

  public static ArrayList< Position > possibleMoves( Position p )
  {
    ArrayList< Position > possibleNextMoves = new ArrayList< Position >();

    switch( p.currentRow )
    {
      case 0:
        switch( p.currentColumn )
        {
          case 0:
            {
              possibleNextMoves.add(chessBoard[2][1]);
              possibleNextMoves.add(chessBoard[1][2]);
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
              possibleNextMoves.add(chessBoard[1][2]);
              possibleNextMoves.add(chessBoard[0][1]);
            }
            break;
          case 3:
            {
              possibleNextMoves.add(chessBoard[4][2]);
              possibleNextMoves.add(chessBoard[5][1]);
              possibleNextMoves.add(chessBoard[2][2]);
              possibleNextMoves.add(chessBoard[1][1]);
            }
            break;
          case 4:
            {
              possibleNextMoves.add(chessBoard[5][2]);
              possibleNextMoves.add(chessBoard[6][1]);
              possibleNextMoves.add(chessBoard[3][2]);
              possibleNextMoves.add(chessBoard[2][1]);
            }
            break;
          case 5:
            {
              possibleNextMoves.add(chessBoard[6][2]);
              possibleNextMoves.add(chessBoard[7][1]);
              possibleNextMoves.add(chessBoard[4][2]);
              possibleNextMoves.add(chessBoard[3][1]);
            }
            break;
          case 6:
            {
              possibleNextMoves.add(chessBoard[7][2]);
              possibleNextMoves.add(chessBoard[5][2]);
              possibleNextMoves.add(chessBoard[4][1]);
            }
            break;
          case 7:
            {
              possibleNextMoves.add(chessBoard[6][2]);
              possibleNextMoves.add(chessBoard[5][1]);
            }
            break;
        }
        break;
      case 1:
        switch( p.currentColumn )
        {
          case 0:
            {
              possibleNextMoves.add(chessBoard[2][0]);
              possibleNextMoves.add(chessBoard[2][2]);
              possibleNextMoves.add(chessBoard[1][3]);
            }
            break;
          case 1:
            {
              possibleNextMoves.add(chessBoard[0][3]);
              possibleNextMoves.add(chessBoard[3][0]);
              possibleNextMoves.add(chessBoard[3][2]);
              possibleNextMoves.add(chessBoard[2][3]);
            }
            break;
          case 2:
            {
              possibleNextMoves.add(chessBoard[1][3]);
              possibleNextMoves.add(chessBoard[0][2]);
              possibleNextMoves.add(chessBoard[4][0]);
              possibleNextMoves.add(chessBoard[4][2]);
              possibleNextMoves.add(chessBoard[3][3]);
            }
          break;
          case 3:
            {
              possibleNextMoves.add(chessBoard[2][3]);
              possibleNextMoves.add(chessBoard[1][2]);
              possibleNextMoves.add(chessBoard[1][0]);
              possibleNextMoves.add(chessBoard[5][0]);
              possibleNextMoves.add(chessBoard[5][2]);
              possibleNextMoves.add(chessBoard[4][3]);
            }
            break;
          case 4:
            {
              possibleNextMoves.add(chessBoard[3][3]);
              possibleNextMoves.add(chessBoard[2][2]);
              possibleNextMoves.add(chessBoard[2][0]);
              possibleNextMoves.add(chessBoard[6][0]);
              possibleNextMoves.add(chessBoard[6][2]);
              possibleNextMoves.add(chessBoard[5][3]);
            }
            break;
          case 5:
            {
              possibleNextMoves.add(chessBoard[4][3]);
              possibleNextMoves.add(chessBoard[3][2]);
              possibleNextMoves.add(chessBoard[3][0]);
              possibleNextMoves.add(chessBoard[7][0]);
              possibleNextMoves.add(chessBoard[7][2]);
              possibleNextMoves.add(chessBoard[6][3]);
            }
            break;
          case 6:
            {
              possibleNextMoves.add(chessBoard[5][3]);
              possibleNextMoves.add(chessBoard[4][2]);
              possibleNextMoves.add(chessBoard[4][0]);
              possibleNextMoves.add(chessBoard[7][3]);
            }
            break;
          case 7:
            {
              possibleNextMoves.add(chessBoard[6][3]);
              possibleNextMoves.add(chessBoard[5][2]);
              possibleNextMoves.add(chessBoard[5][0]);
            }
            break;
          }
          break;
      case 2:
        switch( p.currentColumn )
        {
          case 0:
          {
            possibleNextMoves.add(chessBoard[1][0]);
            possibleNextMoves.add(chessBoard[2][1]);
            possibleNextMoves.add(chessBoard[2][3]);
            possibleNextMoves.add(chessBoard[1][4]);
          }
          break;
          case 1:
          {
            possibleNextMoves.add(chessBoard[0][4]);
            possibleNextMoves.add(chessBoard[0][0]);
            possibleNextMoves.add(chessBoard[2][0]);
            possibleNextMoves.add(chessBoard[3][1]);
            possibleNextMoves.add(chessBoard[3][3]);
            possibleNextMoves.add(chessBoard[2][4]);
          }
          break;
          case 2:
          {
            possibleNextMoves.add(chessBoard[1][4]);
            possibleNextMoves.add(chessBoard[0][3]);
            possibleNextMoves.add(chessBoard[0][1]);
            possibleNextMoves.add(chessBoard[1][0]);
            possibleNextMoves.add(chessBoard[3][0]);
            possibleNextMoves.add(chessBoard[4][1]);
            possibleNextMoves.add(chessBoard[4][3]);
            possibleNextMoves.add(chessBoard[3][4]);
          }
        break;
          case 3:
          {
            possibleNextMoves.add(chessBoard[2][4]);
            possibleNextMoves.add(chessBoard[1][3]);
            possibleNextMoves.add(chessBoard[1][1]);
            possibleNextMoves.add(chessBoard[2][0]);
            possibleNextMoves.add(chessBoard[4][0]);
            possibleNextMoves.add(chessBoard[5][1]);
            possibleNextMoves.add(chessBoard[5][3]);
            possibleNextMoves.add(chessBoard[4][4]);
          }
          break;
          case 4:
          {
            possibleNextMoves.add(chessBoard[3][4]);
            possibleNextMoves.add(chessBoard[2][3]);
            possibleNextMoves.add(chessBoard[2][1]);
            possibleNextMoves.add(chessBoard[3][0]);
            possibleNextMoves.add(chessBoard[5][0]);
            possibleNextMoves.add(chessBoard[6][1]);
            possibleNextMoves.add(chessBoard[6][3]);
            possibleNextMoves.add(chessBoard[5][4]);
          }
          break;
          case 5:
          {
            possibleNextMoves.add(chessBoard[4][4]);
            possibleNextMoves.add(chessBoard[3][3]);
            possibleNextMoves.add(chessBoard[3][1]);
            possibleNextMoves.add(chessBoard[4][0]);
            possibleNextMoves.add(chessBoard[6][0]);
            possibleNextMoves.add(chessBoard[7][1]);
            possibleNextMoves.add(chessBoard[7][3]);
            possibleNextMoves.add(chessBoard[6][4]);
          }
          break;
          case 6:
          {
            possibleNextMoves.add(chessBoard[5][4]);
            possibleNextMoves.add(chessBoard[4][3]);
            possibleNextMoves.add(chessBoard[4][1]);
            possibleNextMoves.add(chessBoard[5][0]);
            possibleNextMoves.add(chessBoard[7][4]);
          }
          break;
          case 7:
          {
            possibleNextMoves.add(chessBoard[6][4]);
            possibleNextMoves.add(chessBoard[5][3]);
            possibleNextMoves.add(chessBoard[5][1]);
            possibleNextMoves.add(chessBoard[6][0]);
          }
          break;
        }
        break;
      case 3:
        switch( p.currentColumn )
        {
          case 0:
              {
                possibleNextMoves.add(chessBoard[1][1]);
                possibleNextMoves.add(chessBoard[2][2]);
                possibleNextMoves.add(chessBoard[2][4]);
                possibleNextMoves.add(chessBoard[1][5]);
              }
            break;
          case 1:
              {
                possibleNextMoves.add(chessBoard[0][5]);
                possibleNextMoves.add(chessBoard[0][1]);
                possibleNextMoves.add(chessBoard[2][1]);
                possibleNextMoves.add(chessBoard[3][2]);
                possibleNextMoves.add(chessBoard[3][4]);
                possibleNextMoves.add(chessBoard[2][5]);
              }
            break;
          case 2:
              {
                possibleNextMoves.add(chessBoard[1][5]);
                possibleNextMoves.add(chessBoard[0][4]);
                possibleNextMoves.add(chessBoard[0][2]);
                possibleNextMoves.add(chessBoard[1][1]);
                possibleNextMoves.add(chessBoard[3][1]);
                possibleNextMoves.add(chessBoard[4][2]);
                possibleNextMoves.add(chessBoard[4][4]);
                possibleNextMoves.add(chessBoard[3][5]);
              }
            break;
          case 3:
              {
                possibleNextMoves.add(chessBoard[2][5]);
                possibleNextMoves.add(chessBoard[1][4]);
                possibleNextMoves.add(chessBoard[1][2]);
                possibleNextMoves.add(chessBoard[2][1]);
                possibleNextMoves.add(chessBoard[4][1]);
                possibleNextMoves.add(chessBoard[5][2]);
                possibleNextMoves.add(chessBoard[5][4]);
                possibleNextMoves.add(chessBoard[4][5]);
              }
            break;
          case 4:
              {
                possibleNextMoves.add(chessBoard[3][5]);
                possibleNextMoves.add(chessBoard[2][4]);
                possibleNextMoves.add(chessBoard[2][2]);
                possibleNextMoves.add(chessBoard[3][1]);
                possibleNextMoves.add(chessBoard[5][1]);
                possibleNextMoves.add(chessBoard[6][2]);
                possibleNextMoves.add(chessBoard[6][4]);
                possibleNextMoves.add(chessBoard[5][6]);
              }
            break;
          case 5:
              {
                possibleNextMoves.add(chessBoard[4][5]);
                possibleNextMoves.add(chessBoard[3][4]);
                possibleNextMoves.add(chessBoard[3][2]);
                possibleNextMoves.add(chessBoard[4][1]);
                possibleNextMoves.add(chessBoard[6][1]);
                possibleNextMoves.add(chessBoard[7][2]);
                possibleNextMoves.add(chessBoard[7][4]);
                possibleNextMoves.add(chessBoard[6][5]);
              }
            break;
          case 6:
              {
                possibleNextMoves.add(chessBoard[5][5]);
                possibleNextMoves.add(chessBoard[4][4]);
                possibleNextMoves.add(chessBoard[4][2]);
                possibleNextMoves.add(chessBoard[5][1]);
                possibleNextMoves.add(chessBoard[7][1]);
                possibleNextMoves.add(chessBoard[7][5]);
              }
            break;
          case 7:
              {
                possibleNextMoves.add(chessBoard[6][5]);
                possibleNextMoves.add(chessBoard[5][4]);
                possibleNextMoves.add(chessBoard[5][2]);
                possibleNextMoves.add(chessBoard[6][1]);
              }
            break;
        }
        break;
      case 4:
        switch( p.currentColumn )
        {
          case 0:
              {
                possibleNextMoves.add(chessBoard[1][2]);
                possibleNextMoves.add(chessBoard[2][3]);
                possibleNextMoves.add(chessBoard[2][5]);
                possibleNextMoves.add(chessBoard[1][6]);
              }
            break;
          case 1:
              {
                possibleNextMoves.add(chessBoard[0][6]);
                possibleNextMoves.add(chessBoard[0][2]);
                possibleNextMoves.add(chessBoard[2][2]);
                possibleNextMoves.add(chessBoard[3][3]);
                possibleNextMoves.add(chessBoard[3][5]);
                possibleNextMoves.add(chessBoard[2][6]);
              }
            break;
          case 2:
              {
                possibleNextMoves.add(chessBoard[1][6]);
                possibleNextMoves.add(chessBoard[0][5]);
                possibleNextMoves.add(chessBoard[0][3]);
                possibleNextMoves.add(chessBoard[1][2]);
                possibleNextMoves.add(chessBoard[3][2]);
                possibleNextMoves.add(chessBoard[4][3]);
                possibleNextMoves.add(chessBoard[4][5]);
                possibleNextMoves.add(chessBoard[3][6]);
              }
            break;
          case 3:
              {
                possibleNextMoves.add(chessBoard[2][6]);
                possibleNextMoves.add(chessBoard[1][5]);
                possibleNextMoves.add(chessBoard[1][3]);
                possibleNextMoves.add(chessBoard[2][2]);
                possibleNextMoves.add(chessBoard[4][2]);
                possibleNextMoves.add(chessBoard[5][3]);
                possibleNextMoves.add(chessBoard[5][5]);
                possibleNextMoves.add(chessBoard[4][6]);
              }
            break;
          case 4:
              {
                possibleNextMoves.add(chessBoard[3][6]);
                possibleNextMoves.add(chessBoard[2][5]);
                possibleNextMoves.add(chessBoard[2][3]);
                possibleNextMoves.add(chessBoard[3][2]);
                possibleNextMoves.add(chessBoard[5][2]);
                possibleNextMoves.add(chessBoard[6][3]);
                possibleNextMoves.add(chessBoard[6][5]);
                possibleNextMoves.add(chessBoard[5][6]);
              }
            break;
          case 5:
              {
                possibleNextMoves.add(chessBoard[4][6]);
                possibleNextMoves.add(chessBoard[3][5]);
                possibleNextMoves.add(chessBoard[3][3]);
                possibleNextMoves.add(chessBoard[4][2]);
                possibleNextMoves.add(chessBoard[6][2]);
                possibleNextMoves.add(chessBoard[7][3]);
                possibleNextMoves.add(chessBoard[7][5]);
                possibleNextMoves.add(chessBoard[6][6]);
              }
            break;
          case 6:
              {
                possibleNextMoves.add(chessBoard[5][6]);
                possibleNextMoves.add(chessBoard[4][5]);
                possibleNextMoves.add(chessBoard[4][3]);
                possibleNextMoves.add(chessBoard[5][2]);
                possibleNextMoves.add(chessBoard[7][2]);
                possibleNextMoves.add(chessBoard[7][6]);
              }
            break;
          case 7:
              {
                possibleNextMoves.add(chessBoard[6][6]);
                possibleNextMoves.add(chessBoard[5][5]);
                possibleNextMoves.add(chessBoard[5][3]);
                possibleNextMoves.add(chessBoard[6][2]);
              }
            break;
        }
        break;
      case 5:
        switch( p.currentColumn )
        {
          case 0:
              {
                possibleNextMoves.add(chessBoard[1][3]);
                possibleNextMoves.add(chessBoard[2][4]);
                possibleNextMoves.add(chessBoard[2][6]);
                possibleNextMoves.add(chessBoard[1][7]);
              }
            break;
          case 1:
              {
                possibleNextMoves.add(chessBoard[0][7]);
                possibleNextMoves.add(chessBoard[0][3]);
                possibleNextMoves.add(chessBoard[2][3]);
                possibleNextMoves.add(chessBoard[3][4]);
                possibleNextMoves.add(chessBoard[3][6]);
                possibleNextMoves.add(chessBoard[2][7]);
              }
            break;
          case 2:
              {
                possibleNextMoves.add(chessBoard[1][7]);
                possibleNextMoves.add(chessBoard[0][6]);
                possibleNextMoves.add(chessBoard[0][4]);
                possibleNextMoves.add(chessBoard[1][3]);
                possibleNextMoves.add(chessBoard[3][3]);
                possibleNextMoves.add(chessBoard[4][4]);
                possibleNextMoves.add(chessBoard[4][6]);
                possibleNextMoves.add(chessBoard[3][7]);
              }
            break;
          case 3:
              {
                possibleNextMoves.add(chessBoard[2][7]);
                possibleNextMoves.add(chessBoard[1][6]);
                possibleNextMoves.add(chessBoard[1][4]);
                possibleNextMoves.add(chessBoard[2][3]);
                possibleNextMoves.add(chessBoard[4][3]);
                possibleNextMoves.add(chessBoard[5][4]);
                possibleNextMoves.add(chessBoard[5][6]);
                possibleNextMoves.add(chessBoard[4][7]);
              }
            break;
          case 4:
              {
                possibleNextMoves.add(chessBoard[3][7]);
                possibleNextMoves.add(chessBoard[2][6]);
                possibleNextMoves.add(chessBoard[2][4]);
                possibleNextMoves.add(chessBoard[3][3]);
                possibleNextMoves.add(chessBoard[5][3]);
                possibleNextMoves.add(chessBoard[6][4]);
                possibleNextMoves.add(chessBoard[6][6]);
                possibleNextMoves.add(chessBoard[5][7]);
              }
            break;
          case 5:
              {
                possibleNextMoves.add(chessBoard[4][7]);
                possibleNextMoves.add(chessBoard[3][6]);
                possibleNextMoves.add(chessBoard[3][4]);
                possibleNextMoves.add(chessBoard[4][3]);
                possibleNextMoves.add(chessBoard[6][3]);
                possibleNextMoves.add(chessBoard[7][4]);
                possibleNextMoves.add(chessBoard[7][6]);
                possibleNextMoves.add(chessBoard[6][7]);
              }
            break;
          case 6:
              {
                possibleNextMoves.add(chessBoard[5][7]);
                possibleNextMoves.add(chessBoard[4][6]);
                possibleNextMoves.add(chessBoard[4][4]);
                possibleNextMoves.add(chessBoard[5][3]);
                possibleNextMoves.add(chessBoard[7][3]);
                possibleNextMoves.add(chessBoard[7][7]);
              }
            break;
          case 7:
              {
                possibleNextMoves.add(chessBoard[6][7]);
                possibleNextMoves.add(chessBoard[5][6]);
                possibleNextMoves.add(chessBoard[5][4]);
                possibleNextMoves.add(chessBoard[6][3]);
              }
            break;
        }
        break;
      case 6:
        switch( p.currentColumn )
        {
          case 0:
              {
                possibleNextMoves.add(chessBoard[1][4]);
                possibleNextMoves.add(chessBoard[2][5]);
                possibleNextMoves.add(chessBoard[2][7]);
              }
            break;
          case 1:
              {
                possibleNextMoves.add(chessBoard[0][4]);
                possibleNextMoves.add(chessBoard[2][4]);
                possibleNextMoves.add(chessBoard[3][5]);
                possibleNextMoves.add(chessBoard[3][7]);
              }
            break;
          case 2:
              {
                possibleNextMoves.add(chessBoard[7][0]);
                possibleNextMoves.add(chessBoard[5][0]);
                possibleNextMoves.add(chessBoard[1][4]);
                possibleNextMoves.add(chessBoard[3][4]);
                possibleNextMoves.add(chessBoard[4][5]);
                possibleNextMoves.add(chessBoard[4][7]);
              }
            break;
          case 3:
              {
                possibleNextMoves.add(chessBoard[1][7]);
                possibleNextMoves.add(chessBoard[1][5]);
                possibleNextMoves.add(chessBoard[2][4]);
                possibleNextMoves.add(chessBoard[4][4]);
                possibleNextMoves.add(chessBoard[5][5]);
                possibleNextMoves.add(chessBoard[5][7]);
              }
            break;
          case 4:
              {
                possibleNextMoves.add(chessBoard[2][7]);
                possibleNextMoves.add(chessBoard[2][5]);
                possibleNextMoves.add(chessBoard[3][4]);
                possibleNextMoves.add(chessBoard[5][4]);
                possibleNextMoves.add(chessBoard[6][5]);
                possibleNextMoves.add(chessBoard[6][7]);
              }
            break;
          case 5:
              {
                possibleNextMoves.add(chessBoard[3][7]);
                possibleNextMoves.add(chessBoard[3][5]);
                possibleNextMoves.add(chessBoard[4][4]);
                possibleNextMoves.add(chessBoard[6][4]);
                possibleNextMoves.add(chessBoard[7][5]);
                possibleNextMoves.add(chessBoard[7][7]);
              }
            break;
          case 6:
              {
                possibleNextMoves.add(chessBoard[4][7]);
                possibleNextMoves.add(chessBoard[4][5]);
                possibleNextMoves.add(chessBoard[5][4]);
                possibleNextMoves.add(chessBoard[7][4]);
              }
            break;
          case 7:
              {
                possibleNextMoves.add(chessBoard[5][7]);
                possibleNextMoves.add(chessBoard[5][5]);
                possibleNextMoves.add(chessBoard[6][4]);
              }
            break;
        }
        break;
      case 7:
        switch( p.currentColumn )
        {
          case 0:
              {
                possibleNextMoves.add(chessBoard[1][5]);
                possibleNextMoves.add(chessBoard[2][6]);
              }
            break;
          case 1:
              {
                possibleNextMoves.add(chessBoard[0][5]);
                possibleNextMoves.add(chessBoard[2][5]);
                possibleNextMoves.add(chessBoard[3][6]);
              }
            break;
          case 2:
              {
                possibleNextMoves.add(chessBoard[0][6]);
                possibleNextMoves.add(chessBoard[1][5]);
                possibleNextMoves.add(chessBoard[3][5]);
                possibleNextMoves.add(chessBoard[4][6]);
              }
            break;
          case 3:
              {
                possibleNextMoves.add(chessBoard[1][6]);
                possibleNextMoves.add(chessBoard[2][5]);
                possibleNextMoves.add(chessBoard[4][5]);
                possibleNextMoves.add(chessBoard[5][6]);
              }
            break;
          case 4:
              {
                possibleNextMoves.add(chessBoard[2][6]);
                possibleNextMoves.add(chessBoard[3][5]);
                possibleNextMoves.add(chessBoard[5][5]);
                possibleNextMoves.add(chessBoard[6][6]);
              }
            break;
          case 5:
              {
                possibleNextMoves.add(chessBoard[3][6]);
                possibleNextMoves.add(chessBoard[4][5]);
                possibleNextMoves.add(chessBoard[6][5]);
                possibleNextMoves.add(chessBoard[7][6]);
              }
            break;
          case 6:
              {
                possibleNextMoves.add(chessBoard[4][6]);
                possibleNextMoves.add(chessBoard[5][5]);
                possibleNextMoves.add(chessBoard[7][5]);
              }
            break;
          case 7:
              {
                possibleNextMoves.add(chessBoard[5][6]);
                possibleNextMoves.add(chessBoard[6][5]);
              }
            break;
        }
        break;
    }

    return possibleNextMoves;

  }

}
