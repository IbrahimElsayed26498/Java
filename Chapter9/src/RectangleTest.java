/**
 * Created by isaackamga on 30/11/2017.
 */
public class RectangleTest {

    public static void main(String[] args)
    {
        Point A = new Point(0,4);
        Point B = new Point(5,4);
        Point C = new Point(5,0);
        Point D = new Point(0,0);

        Rectangle thisRect = new Rectangle(A, B, C, D, true, true);

        System.out.printf("Rectangle has values %s and has area %.1f units", thisRect.toString() ,thisRect.calculateArea(A,B,C));
    }
}
