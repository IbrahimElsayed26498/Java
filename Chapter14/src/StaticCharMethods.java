/**
 * Fig. 14.15: StaticCharMethods.java
 * Character static methods for testing characters and converting case.
 */

 import java.util.Scanner;

 public class StaticCharMethods {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter A Character And Press Enter : ");
        String input = scanner.next();
        char c = input.charAt(0);

        // Display Character information
        System.out.printf(" is defined %b\n", Character.isDefined(c));
        System.out.printf(" is digit %b\n", Character.isDigit(c));
        System.out.printf(" is first character in Java identifier %b\n", Character.isJavaIdentifierStart(c));
        System.out.printf(" is part of a Java identifier %b\n", Character.isJavaIdentifierPart(c));
        System.out.printf(" is letter %b\n", Character.isLetter(c) );
        System.out.printf(" is alphanumeric %b\n", Character.isLetterOrDigit(c));
        System.out.printf(" is lower case %b\n", Character.isLowerCase(c));
        System.out.printf(" is upper case %b\n", Character.isUpperCase(c));
        System.out.printf(" to Upper Case %b\n", Character.toUpperCase(c));
        System.out.printf(" to lower case %b\n", Character.toLowerCase(c));
    }
 }
