/*
 * Figure 11.5 : UsingExceptions.java
 * Demonstrates the try...catch...finally exception handling mechanism
 */

 public class UsingExceptions
 {
     public static void main(String[] args)
     {
         try
         {
            throwException();
         }
         catch(Exception exception) //catch exception from throwException()
         {
            System.err.println("Exception Handled In Main");
         }

         doesNotThrowException();
     }

     // Demonstrate try...catch...finally
     public static void throwException() throws Exception
     {
         try // throw an exception and completely catch it
         {
            System.out.println("Method throwException()");
            throw new Exception(); // Generate a new exception
         }
         catch(Exception exception) // catch exception thrown in try
         {
            System.err.println("Exception Handled In Throw Exception");
            throw exception;

         }
         finally // executes regardless of what occurs in try
         {
            System.err.println("Finally Executed In throwException");
         }

     }

     // Demonstrate finally when no exception occurs
     public static void doesNotThrowException()
     {
         try // try bloeck does not throw an exception
         {
             System.out.println("Method doesNotThrowException");
         }
         catch( Exception exception)
         {
             System.out.println(exception);
         }
         finally // executes regardless of what occurs in try...catch
         {
             System.err.println("Finally Executed In doesNotThrowException");
         }

         System.out.println("End of method doesNotThrowException");
     }
 }