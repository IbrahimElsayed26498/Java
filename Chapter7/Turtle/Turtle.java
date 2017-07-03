// Turtle.java

import java.util.Scanner;
import java.util.Random;

public class Turtle
{
  private enum Status { DOWN, UP };
  private enum Direction { RIGHT, LEFT };

  public static void main( String[] args )
  {
    int[][] floor = new int[20][20];

    // Initialise floor array entries to 0
    for ( int i = 0; i < 20; i++ )
        for ( int j = 0; j < 20; j++ )
            floor[i][j] = 0;

    int[] commands = { 2, 5, 12, 3, 5, 12, 3, 5, 12, 3, 5, 12, 1, 6, 9 };

    int now = commands[0];
    int next = commands[1];

    int currentX = 0, currentY = 0;

    int currentPosition = floor[currentX][currentY];

    int count = 0, c = 0;

    Status status = Status.UP;
    Direction facing = Direction.RIGHT;

    for ( int command : commands )
    {
      switch( command )
      {
        case 1:
          {
            status = Status.UP;
            System.out.println("Turtle Ready To Move Without Colouring Position\n");
          }
          break;
        case 2:
          status = Status.DOWN;
          System.out.println("Pen Down : Color Current Position");
          break;
        case 3:
          facing = Direction.RIGHT;
          System.out.println("Turn Right : Ready To Increment currentY");
          break;
        case 4:
          facing = Direction.LEFT;
          System.out.println("Turn Left : Ready To Decrement currentX");
          break;
        case 5:
          {
            now = commands[command];
            next = commands[command++];
            System.out.printf("Move Forwards, Colouring %d Tiles\n", next );
            if ( (facing == Direction.RIGHT) && (currentX + next <= 19) )
            {
              for ( count = currentY; count < ( currentY + next ) % 20 ; count++)
              {
                floor[currentX][count] = 1;
              }
            }

            else if ( (facing == Direction.RIGHT) && (currentX + next <= 19) )
            {
              for ( c = currentY; c < ( currentY + next ) % 20 ; c++)
              {
                floor[currentX][count] = 1;
              }
            }
          }
          break;
        case 6:
          {
            System.out.println("Display The 20X20 Tiled Floor\n\n");

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
        default:
          System.out.println("Enter 1,2,3,4,6,9, Or 5 followed by a number");
          break;
      }
    }
  }
}
