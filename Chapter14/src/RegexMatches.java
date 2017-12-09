/*
 * Fig. 14.24: RegexMatches.java
 * Classes Pattern and Matcher
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    public static void main(String[] args)
    {
       // Create regular expression
       Pattern expression = Pattern.compile("J.*\\\\d[0-35-9]-\\\\d\\\\d-\\\\d\\\\d");

       String string1 = "Jane's Birthday Is 05-12-75\n" +
                        "\nDave's Birthday is 11-04-68\n" +
                        "\nJohn's Birthday is 04-28-73\n" +
                        "\nJoe's Birthday is 12-17-77\n";

        // match regular expression to string and print matches
        Matcher matcher = expression.matcher(string1);

        while(matcher.find())
            System.out.println(matcher.group());
    }
}