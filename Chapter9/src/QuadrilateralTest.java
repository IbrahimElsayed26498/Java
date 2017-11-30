/**
 * Created by isaackamga on 29/11/2017.
 */
public class QuadrilateralTest {

    public static void main(String[] args)
    {
        Point A = new Point(2,3);
        Point B = new Point(5,3);
        Point C = new Point(7,0);
        Point D = new Point(0,0);

        Quadrilateral thisQuad = new Quadrilateral(A,B,C,D);

        System.out.printf("Quadrilateral thisQuad has values %s and has area %.2f units", thisQuad.toString(), thisQuad.calculateArea(A,B,C,D) );
    }

}
