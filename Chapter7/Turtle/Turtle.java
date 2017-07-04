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

    int[] commands = { 1, 2, 5, 12, 5, 12, 4, 5, 12, 4, 5, 12, 4, 5, 12, 6, 1 };

    int currentNow = 0, currentNext = 1;

    int now = commands[currentNow];
    int next = commands[currentNext];

    int currentX = 0, currentY = 0;

    int currentPosition = floor[currentX][currentY];

    int count = 0, c = 0;

    Status status = Status.UP;
    Direction facing = Direction.SOUTH;
    Direction currentDirection;

    for ( int command = 0; command < commands.length; command++ )
    {
      switch( commands[command] )
      {
        case 1:
          {
            System.out.printf("Command %d = %d : Pen Up, Turtle Ready To Move Without Colour\n", command, commands[command] );
            status = Status.UP;
          }
          break;
        case 2:
          {
            System.out.printf("Command %d = %d : Pen Down, Turtle Ready To Colour\n", command, commands[command] );
            status = Status.DOWN;

            currentNow++;
            currentNext++;
            now = commands[currentNow];
            next = commands[currentNext];
          }
          break;
        case 3:
          {
            System.out.printf("Command %d = %d : Turtle Turns Right\n", command, commands[command] );
            now = commands[command];
            next = commands[command++];

            currentDirection = determineDirection( facing, Turn.RIGHT );
          }
          break;

        case 4:
          {
            System.out.printf("Command %d = %d : Turtle Turns Left\n", command, commands[command] );

            currentDirection = determineDirection ( facing, Turn.LEFT );

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

              System.out.printf("Command %d = %d : Turtle Moves And Colours %d Tiles\n", command, commands[command], next );

              currentDirection = determineDirection( facing, Turn.RIGHT );

              switch ( currentDirection )
              {
                case NORTH:
                  {
                    for ( count = ( currentX + next ) % 20; count >= currentX ; count--)
                    {
                      floor[count][currentY] = 1;
                    }
                  }
                  break;
                case WEST:
                  {
                    for ( count = currentY; count < ( currentY + next ) % 20 ; count++)
                    {
                      floor[currentX][count] = 1;
                    }
                  }
                  break;
                case SOUTH:
                  {
                    for ( count = currentX; count < ( currentX + next ) % 20 ; count++)
                    {
                      floor[count][currentY] = 1;
                    }
                  }
                break;
                case EAST:
                  {
                    for ( count = ( currentY + next ) % 20; count >= currentY ; count--)
                    {
                      floor[currentX][count] = 1;
                    }
                  }
                  break;
              }
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
}
