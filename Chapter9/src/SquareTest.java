/**
 * Created by isaackamga on 30/11/2017.
 */
public class SquareTest {

    public static void main(String[] args)
    {
        Point A = new Point(0,5);
        Point B = new Point(5,5);
        Point C = new Point(5,0);
        Point D = new Point(0,0);

        Square square = new Square(A, B, C, D, true, true, true);

        System.out.printf("Square has values %sand has area %.1f units", square.toString(), square.calculateArea(A, B));
    }
}
