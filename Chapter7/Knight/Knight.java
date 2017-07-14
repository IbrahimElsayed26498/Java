// Knight.java

import java.util.ArrayList;
import java.util.Random;

public class Knight
{
  public static final int ROWS = 8;
  public static final int COLUMNS = 8;
  public static final int POSITIONS = 64;

  public static Position[][] chessBoard = new Position[ROWS][COLUMNS];

  public static void main( String[] args )
  {

      // Initialise the chessBoard to zero's

    System.out.println("ChessBoard Before Knight Moves");
    System.out.println();

    for ( int row = 0; row < ROWS; row++ )
      for ( int column = 0; column < COLUMNS; column++ )
        chessBoard[row][column] = new Position(row, column, 0);

    // Display The ChessBoard

    for ( int row = 0; row < ROWS; row++ )
    {
        for ( int column = 0; column < COLUMNS; column++ )
        {

          System.out.printf("%d  ", chessBoard[row][column].getValue());

        }
        System.out.println();
    }

    ArrayList< Position > listOfMoves = new ArrayList< Position >();

    Position currentPosition = new Position(0,0,0);

    Position p = new Position(0,0,0);

    int i = 1, val;
    int colouredPositions = 0;

    do
    {
      listOfMoves = possibleMoves( currentPosition );

      p = selectPosition( listOfMoves );

      val = p.getValue();
      val++;

      p.setValue(val);

      i++;
      currentPosition = p;

    } while (i <= POSITIONS);

    // Count the coloured POSITIONS

    for ( int row = 0; row < ROWS; row++ )
    {
        for ( int column = 0; column < COLUMNS; column++ )
        {
          if ( chessBoard[row][column].getValue() > 0 )
          {
            colouredPositions++;
          }
        }
        System.out.println();
    }

    // Display The ChessBoard

    System.out.println("ChessBoard A Knight Moves");
    System.out.println();

    for ( int row = 0; row < ROWS; row++ )
    {
        for ( int column = 0; column < COLUMNS; column++ )
        {
          //if ( chessBoard[row][column].getValue() > 0 )
            System.out.printf("%d  ", chessBoard[row][column].getValue());

        }
        System.out.println();
    }

    System.out.printf("Your Knight has moved %d positions", colouredPositions );
  }

  public static Position selectPosition( ArrayList< Position > list )
  {
    // Use this section to remove any positions which have above zero
    /*for ( Position count : list )
    {
      if ( count.getValue() >= 1 )
        listOfMoves.remove(count);
    }*/

    int i, k = list.size();

    for ( i = 0; i < k; i++)
    {
      if ( list.get(i).getValue() > 1 )
        list.remove(i);
      k--;
    }

    Random randomNumber = new Random();

    int die = randomNumber.nextInt(k);

    return list.get( die );
  }

  public static ArrayList< Position > possibleMoves( Position p )
  {
    ArrayList< Position > possibleNextMoves = new ArrayList< Position >();

    //int a = p.getCurrentRow()

    switch( p.getCurrentRow() )
    {
      case 0:
        {
          switch( p.getCurrentColumn() )
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
        }
        break;
      case 1:
        {
        switch( p.getCurrentColumn() )
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
          }}
        break;
      case 2:
        {
        switch( p.getCurrentColumn() )
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
        }}
        break;
      case 3:
        {switch( p.getCurrentColumn() )
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
        }}
        break;
      case 4:
        {switch( p.getCurrentColumn() )
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
        }}
        break;
      case 5:
        {switch( p.getCurrentColumn() )
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
        }}
        break;
      case 6:
        {switch( p.getCurrentColumn() )
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
        }}
        break;
      case 7:
        {switch( p.getCurrentColumn() )
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
        }}
        break;
    }

    return possibleNextMoves;

  }
}
