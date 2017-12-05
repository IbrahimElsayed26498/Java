/*
 * ExceptionA.java : Custom-created Exception class
 */

 public class ExceptionA extends Exception
 {
     private String aMessage; // message specific to ExceptionA object

     public ExceptionA()
     {
         System.err.printf("Default Error aMessage");
     }

     public ExceptionA(String message)
     {
         super(message);
     }

     public ExceptionA(Throwable cause)
     {
         super(cause);
     }

     public ExceptionA( String message, Throwable cause, String aMessage )
     {
        super(message, cause);
        this.aMessage = aMessage;
     }

     public String getaMessage() {
         return aMessage;
     }

     @Override
     public String toString() {
         return String.format("%s %s", super.toString(), getaMessage() );
     }
 }