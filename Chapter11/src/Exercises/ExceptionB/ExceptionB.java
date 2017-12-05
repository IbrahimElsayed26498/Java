/*
 * ExceptionB.java : Custom-created Exception class is-a ExceptionA subclass
 */

public class ExceptionB extends ExceptionA
{
    private String bMessage; // message specific to ExceptionA object

    public ExceptionB()
    {
        System.err.printf("Default Error bMessage");
    }

    public ExceptionB(String message)
    {
        super(message);
    }

    public ExceptionB(Throwable cause)
    {
        super(cause);
    }

    public ExceptionB( String message, Throwable cause, String aMessage, String bMessage )
    {
        super(message, cause, aMessage);
        this.bMessage = bMessage;
    }

    public String getbMessage() {
        return bMessage;
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), getbMessage() );
    }
}