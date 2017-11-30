import static java.lang.StrictMath.sqrt;

/**
 * Created by isaackamga on 29/11/2017.
 */
public class Point
{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if (x > 0.0)
           this.x = x;
        else
            throw new IllegalArgumentException("Value of x must be positive");
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if (y > 0.0)
            this.y = y;
        else
            throw new IllegalArgumentException("Value of y must be positive");
    }

    public String toString() {
        return "P("+ x + ", "+ y + ')';
    }

    public static double distance(Point A, Point B)
    {
        return Math.sqrt( (A.x - B.x)*(A.x - B.x) + (A.y - B.y)*(A.y - B.y) );
    }
}
