/*
 *  Exercise 10.14 : PieceWorker class is-a subclass of Employee class
* */

public class PieceWorker extends Employee
{
    private double wagePerPiece;
    private int piecesWorked;

    public PieceWorker(String firstName, String lastName, String SSN, Date birthDate, double wagePerPiece, int piecesWorked)
    {
        super(firstName, lastName, SSN, birthDate);

        if (wagePerPiece < 0.0 )
            throw new IllegalArgumentException("Wage Per Piece Must Be Positive");
        else
            this.wagePerPiece = wagePerPiece;

        if (piecesWorked < 0)
            throw new IllegalArgumentException("Number Of Pieces Worked Must Be Positive");
        else
            this.piecesWorked = piecesWorked;
    }

    public double getWagePerPiece() {
        return wagePerPiece;
    }

    public void setWagePerPiece(double wagePerPiece) {
        if (wagePerPiece < 0.0 )
            throw new IllegalArgumentException("Wage Per Piece Must Be Positive");
        else
            this.wagePerPiece = wagePerPiece;
    }

    public int getPiecesWorked() {
        return piecesWorked;
    }

    public void setPiecesWorked(int piecesWorked) {
        if (piecesWorked < 0)
            throw new IllegalArgumentException("Number Of Pieces Worked Must Be Positive");
        else
            this.piecesWorked = piecesWorked;
    }

    // calculate earnings by overriding abstract method earnings()
    @Override
    public double getPaymentAmount(double bonus)
    {
        return bonus + getPiecesWorked() * getWagePerPiece();
    }

    // return String representation of Employee
    @Override
    public String toString()
    {
        return String.format("%s, Wage Per Piece :%.2f, Number Of Pieces Worked :%d", super.toString(), getWagePerPiece(), getPiecesWorked() );
    }
}