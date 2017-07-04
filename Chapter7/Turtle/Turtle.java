// Turtle.java

import java.util.Scanner;
import java.util.Random;

public class Turtle
{
  private enum Status { DOWN, UP };
  private enum Direction { NORTH, WEST, SOUTH, EAST };
  private enum Turn { LEFT, RIGHT };

  public static void main( String[] args )
  {
    int[][] floor = new int[20][20];

    // Initialise floor array entries to 0
    for ( int i = 0; i < 20; i++ )
        for ( int j = 0; j < 20; j++ )
            floor[i][j] = 0;

    int[] commands = { 1, 2, 4, 5, 12, 3, 5, 12, 5, 12, 4, 5, 12, 4, 5, 12, 6, 1 };

    int currentNow = 0, currentNext = 1;

    int now = commands[currentNow];
    int next = commands[currentNext];

    int currentX = 0, currentY = 0;

    int finalX = currentX;
    int finalY = currentY;

    int currentPosition = floor[currentX][currentY];

    int count = 0, c = 0;

    Status status = Status.UP;
    Direction facing = Direction.SOUTH;
    Direction currentDirection;
    Turn turn = Turn.LEFT;

    for ( int command = 0; command < commands.length; command++ )
    {
      switch( commands[command] )
      {
        case 1:
          {
            System.out.printf("Command %d = %d : Pen %s, Turtle At [%d, %d] Facing %s Ready To Move Without Colouring\n",
                              command, commands[command], status, currentX, currentY, facing );
          }
          break;
        case 2:
          {
            System.out.printf("Command %d = %d : Pen %s, Turtle At [%d, %d] Facing %s Ready To Move While Colouring\n",
                               command, commands[command], flipStatus( Status.UP ), currentX, currentY, facing );

            currentNow++;
            currentNext++;
            now = commands[currentNow];
            next = commands[currentNext];
          }
          break;
        case 3:
          {
            turn = Turn.RIGHT;
            currentDirection = determineDirection( facing, turn );

            System.out.printf("Command %d = %d : Turtle At [%d, %d] Facing %s Turns %s Now Facing %s \n",
                              command, commands[command], finalX, finalY, facing, turn, currentDirection );

            now = commands[command];
            next = commands[command++];
          }
          break;

        case 4:
          {
            turn = Turn.LEFT;
            currentDirection = determineDirection ( facing, turn );

            System.out.printf("Command %d = %d : Turtle At [%d, %d] Facing %s Turns %s Now Facing %s \n",
                              command, commands[command], finalX, finalY, facing, turn, currentDirection );

            currentNow++;
            currentNext++;
            now = commands[currentNow];
            next = commands[currentNext];
          }
          break;
        case 5:
          {
            {
              now = commands[command];
              next = commands[command + 1];

              if ( next > 19)
                  break;

              int m = 19;

              currentDirection = determineDirection( facing, turn );

              facing = currentDirection;

              switch ( currentDirection )
              {
                case NORTH: // Y Constant
                  {

                    m = distanceToBoundary( currentX, currentDirection );

                    for ( count = ( currentX + next ) % 20; ((count >= currentY) && (m <= currentX)) ; count--)
                    {
                      floor[count][currentY] = 1;
                    }
                    if ( finalX - next >= 0 )
                        finalX -= next;
                    else
                        finalX = 0;

                  }
                  break;
                case WEST: // X Constant
                  {

                    m = distanceToBoundary( currentY, currentDirection );

                    for ( count = currentY + next; ((count >= currentY) && (m <= currentY)) ; count--)
                    {
                      floor[currentX][count] = 1;
                    }

                    if ( finalY - next >= 0 )
                        finalY -= next;
                    else
                        finalY = 0;
                  }
                  break;
                case SOUTH: // Y Constant
                  {

                    m = distanceToBoundary( currentX, currentDirection );

                    for ( count = currentX; ((count < currentX + next) && (m <= 19 - currentX)); count++)
                    {
                      floor[count][currentY] = 1;
                    }

                    if ( finalX + next <= 19 )
                        finalX += next;
                    else
                        finalX = 19;
                  }
                break;
                case EAST: // X Constant
                  {

                    m = distanceToBoundary( currentY, currentDirection );

                    for ( count = currentY; ((count < (currentY + next) % 20) && (m <= 19 - currentY)) ; count++)
                    {
                      floor[currentX][count] = 1;
                    }

                    if ( finalY + next <= 19 )
                        finalY += next;
                    else
                        finalY = 19;
                  }
                  break;
              }

              System.out.printf("Command %d = %d : Turtle At [%d, %d] Moves %s And Colours %d Tiles To [%d, %d]\n",
                                  command, commands[command], currentX, currentY, facing, next, finalX, finalY );

              currentX = finalX;
              currentY = finalY;
            }

            currentNow++;
            currentNext++;
            now = commands[currentNow];
            next = commands[currentNext];
          }
          break;
        case 6:
          {
            System.out.printf("Command %d = %d : Print The Tiled Floor\n", command, commands[command] );

            // Initialise floor array entries to 0
            for ( int i = 0; i < 20; i++ )
            {
              for ( int j = 0; j < 20; j++ )
              {
                  if ( floor[i][j] == 0 )
                      System.out.printf("%s    ", "   ");
                  else
                      System.out.printf("%s    ", " * ");
              }
              System.out.println();
            }
            System.out.println();
          }
          break;
        case 9:
          break;
      }
    }
  }

  public static Direction determineDirection ( Direction dir, Turn towards )
  {
    switch ( dir )
    {
      case NORTH:
        {
          if ( towards == Turn.LEFT )
            dir = Direction.WEST;
          else // Turn.RIGHT
            dir = Direction.EAST;
        }
        break;
      case WEST:
        {
          if ( towards == Turn.LEFT )
            dir = Direction.SOUTH;
          else // Turn.RIGHT
            dir = Direction.NORTH;
        }
        break;
      case SOUTH:
        {
          if ( towards == Turn.LEFT )
            dir = Direction.EAST;
          else // Turn.RIGHT
            dir = Direction.WEST;
        }
        break;
      case EAST:
        {
          if ( towards == Turn.LEFT )
            dir = Direction.NORTH;
          else // Turn.RIGHT
            dir = Direction.SOUTH;
        }
        break;
    }

    return dir;
  }

  public static int distanceToBoundary( int tileIndex, Direction dir )
  {
    int maximumMoves = 19;

    switch ( dir )
    {
      case NORTH: // Y Constant
        {
          if ( (tileIndex >= 0) && (tileIndex <= 19) )
              maximumMoves = tileIndex;
          else
              maximumMoves = 0;
        }
        break;
      case WEST: // X Constant
        {
          if ( (tileIndex >= 0) && (tileIndex <= 19) )
              maximumMoves = tileIndex;
          else
              maximumMoves = 0;
        }
        break;
      case SOUTH: // Y Constant
        {
          if ( (tileIndex >= 0) && (tileIndex <= 19) )
            maximumMoves = 19 - tileIndex;
          else
            maximumMoves = 0;
        }
        break;
      case EAST: // X Constant
        {
          if ( (tileIndex >= 0) && (tileIndex <= 19) )
            maximumMoves = 19 - tileIndex;
          else
            maximumMoves = 0;
        }
        break;
    }

    return maximumMoves;
  }

  public static Status flipStatus ( Status s )
  {
    if ( s == Status.UP )
        s = Status.DOWN;
    else // s == Status.DOWN
        s = Status.DOWN;

    return s;
  }
}
