/**
 * Created by isaackamga on 29/11/2017.
 */
public class Parallelogram extends Quadrilateral {
    private boolean isPal;

    public Parallelogram(Point edgeOne, Point edgeTwo, Point edgeThree, Point edgeFour, boolean isPalValue)
    {
        super(edgeOne, edgeTwo, edgeThree, edgeFour);
        setIsPal(isPalValue);
    }

    public boolean getIsPal() {
        return isPal;
    }

    public void setIsPal(boolean pal) {

        this.isPal = (Point.distance(super.getEdgeOne(), super.getEdgeTwo())
                == Point.distance(super.getEdgeThree(), super.getEdgeFour()))
                || (Point.distance(super.getEdgeOne(), super.getEdgeFour()) == Point.distance(super.getEdgeTwo(), super.getEdgeThree()));
    }

    public String toString() {
        return "{" +
                ": " + super.toString() +
                ", isPal: " + this.getIsPal() +
                "}, ";
    }

    @Override
    public double calculateArea(Point edgeOne, Point edgeTwo, Point edgeThree, Point edgeFour)
    {
        return Math.abs( Point.distance(edgeThree, edgeFour) * Point.distance(edgeTwo, edgeThree));
    }

}
