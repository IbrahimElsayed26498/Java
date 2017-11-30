import java.lang.Math;
/**
 * Created by isaackamga on 29/11/2017.
 */
public class Quadrilateral {
    private Point edgeOne;
    private Point edgeTwo;
    private Point edgeThree;
    private Point edgeFour;

    public Quadrilateral() {
        this(new Point(0.0, 0.0), new Point(1.0,  0.0), new Point(0.0,1.0), new Point (1.0,1.0));
    }

    public Quadrilateral(Point edgeOne, Point edgeTwo, Point edgeThree, Point edgeFour) {
        this.edgeOne = edgeOne;
        this.edgeTwo = edgeTwo;
        this.edgeThree = edgeThree;
        this.edgeFour = edgeFour;
    }

    public Point getEdgeOne() {
        return edgeOne;
    }

    public void setEdgeOne(Point edgeOne) {
        this.edgeOne = edgeOne;
    }

    public Point getEdgeTwo() {
        return edgeTwo;
    }

    public void setEdgeTwo(Point edgeTwo) {
        this.edgeTwo = edgeTwo;
    }

    public Point getEdgeThree() {
        return edgeThree;
    }

    public void setEdgeThree(Point edgeThree) {
        this.edgeThree = edgeThree;
    }

    public Point getEdgeFour() {
        return edgeFour;
    }

    public void setEdgeFour(Point edgeFour) {
        this.edgeFour = edgeFour;
    }

    public double calculateArea(Point one, Point two, Point three, Point four)
    {
        return 0.5 * Math.abs( ((one.getX() + three.getX()) * (two.getY() + four.getY())) - ((two.getX() + four.getX())*(one.getY() + three.getY())) );
    }

    public String toString() {
        return "{" +
                "edgeOne: " + edgeOne.toString() +
                ", edgeTwo: " + edgeTwo.toString() +
                ", edgeThree: " + edgeThree.toString() +
                ", edgeFour: " + edgeFour.toString() +
                "}, ";
    }
}