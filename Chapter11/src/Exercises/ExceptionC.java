/*
 * ExceptionC.java : Custom-created ExceptionC class is-a subclass of ExceptionB
 */

public class ExceptionC extends ExceptionB
{
    private String cMessage; // message specific to ExceptionA object

    public ExceptionC()
    {
        System.err.printf("Default Error cMessage");
    }

    public ExceptionC(String message)
    {
        super(message);
    }

    public ExceptionC(Throwable cause)
    {
        super(cause);
    }

    public ExceptionC( String message, Throwable cause, String aMessage, String bMessage, String cMessage )
    {
        super(message, cause, aMessage, bMessage);
        this.cMessage = cMessage;
    }

    public String getcMessage() {
        return cMessage;
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), getcMessage() );
    }
}