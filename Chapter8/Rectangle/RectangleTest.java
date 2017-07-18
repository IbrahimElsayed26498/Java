// RectangleTest.java

public class RectangleTest
{
  public static void main( String[] args )
  {
    Rectangle rectTwo = new Rectangle();

    System.out.printf("By Default, The Area Of Rectangle rectTwo is %.2f\n", rectTwo.getLength() * rectTwo.getWidth());

    Rectangle rectOne = new Rectangle(16.0, 2.0);

    System.out.printf("The Area Of Rectangle rectOne is %.2f\n", rectOne.getLength() * rectOne.getWidth());
  }
}
