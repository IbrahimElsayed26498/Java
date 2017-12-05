/*
 * ExceptionTest.java
 */

 public class ExceptionTest
 {
     public static void main(String[] args)
     {
         try{
             getExceptionA();
             getExceptionB();
             getExceptionC();
         }
         catch(ExceptionA ea){
             System.err.printf("Catch ExceptionA");
             ea.printStackTrace();
         }
         /*catch(ExceptionB eb){
             System.err.printf("Catch ExceptionB");
             eb.printStackTrace();
         }*/
         catch(Exception ec){
             System.err.printf("Catch ExceptionC");
             ec.printStackTrace();
         }
         finally{
             System.err.printf("Catch ExceptionA, ExceptionB and ExceptionC");
         }

     }

     public static void getExceptionA() throws ExceptionA{
         throw new ExceptionA("ExceptionA");
     }

     public static void getExceptionB() throws ExceptionB{
         throw new ExceptionB("ExceptionB");
     }

     public static void getExceptionC() throws ExceptionC{
         throw new ExceptionC("ExceptionC");
     }
 }