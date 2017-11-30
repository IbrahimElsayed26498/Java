/**
 * Created by isaackamga on 30/11/2017.
 */
public class Square extends Rectangle {
    private boolean isSquare;

    public Square(Point edgeOne, Point edgeTwo, Point edgeThree, Point edgeFour, boolean isPal, boolean isRect, boolean isSquare)
    {
        super(edgeOne, edgeTwo, edgeThree, edgeFour, true, true);
        setIsSquare(isSquare);
    }

    public boolean getIsSquare()
    {
        return isSquare;
    }

    public void setIsSquare(boolean square)
    {
        this.isSquare = (Point.distance(super.getEdgeOne(), super.getEdgeTwo()) == Point.distance(super.getEdgeTwo(), super.getEdgeThree()));
    }

    @Override
    public String toString() {
        return "{" + super.toString() +
                "isSquare=" + isSquare +
                "}, ";
    }

    public double calculateArea(Point edgeOne, Point edgeTwo)
    {
        return Math.pow(Point.distance(edgeOne, edgeTwo), 2);
    }
}
