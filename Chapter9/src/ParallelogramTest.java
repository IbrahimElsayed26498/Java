/**
 * Created by isaackamga on 29/11/2017.
 */
public class ParallelogramTest {

    public static void main(String[] args)
    {
        Point A = new Point(2,3);
        Point B = new Point(9,3);
        Point C = new Point(7,0);
        Point D = new Point(0,0);

        Parallelogram thisParallelogram = new Parallelogram( A, B, C, D,true);

        System.out.printf("Parralelogram has values %s and has area %.2f units", thisParallelogram.toString() , thisParallelogram.calculateArea(A,B,C,D));
    }
}
