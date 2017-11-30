/**
 * Created by isaackamga on 30/11/2017.
 */
public class Rectangle extends Parallelogram {
    private boolean isRect;

    public Rectangle(Point edgeOne, Point edgeTwo, Point edgeThree, Point edgeFour, boolean isPal, boolean isRect )
    {
        super(edgeOne, edgeTwo, edgeThree, edgeFour, isPal);
        setIsRect(isRect);
    }

    public boolean getIsRect() {
        return isRect;
    }

    public void setIsRect(boolean rect) {

        this.isRect = (Point.distance(super.getEdgeOne(), super.getEdgeTwo())
                == Point.distance(super.getEdgeThree(), super.getEdgeFour()))
                && (Point.distance(super.getEdgeOne(), super.getEdgeFour()) == Point.distance(super.getEdgeTwo(), super.getEdgeThree()));
    }

    @Override
    public String toString() {
        return "{" + super.toString() +
                "isRect=" + isRect +
                "}, ";
    }

    public double calculateArea(Point edgeOne, Point edgeTwo, Point edgeThree)
    {
        return Point.distance(edgeOne, edgeTwo) * Point.distance(edgeTwo, edgeThree);
    }
}
