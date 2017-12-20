/**
 * Fig. 16.19: PropertiesTest.java
 * Demonstrates class Properties of the java.util package
 */

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

    public static void main(String[] args)
    {
        Properties table = new Properties();

        // set properties
        table.setProperty("color", "blue");
        table.setProperty("width", "200");

        System.out.println("After setting properties");
        listProperties(table);

        // replace property value
        table.setProperty("color", "red");

        System.out.println("After replacing properties");
        listProperties(table);

        saveProperties(table);

        table.clear(); // empty table

        System.out.println("After clearing properties");
        listProperties(table);

        loadProperties(table);

        // get value of property color
        Object value = table.getProperty("color");

        // check if value is in table
        if (value != null)
            System.out.printf("Property color's value is %s\n", value);
        else
            System.out.println("Property color is not in table");
    }

    // save properties to a file
    private static void saveProperties(Properties props)
    {
        // save contents of table
        try
        {
            FileOutputStream output = new FileOutputStream("props.dat");
            props.store(output, "Sample Properties"); // save properties
        }
        catch(FileNotFoundException fileNotFound)
        {
            fileNotFound.printStackTrace();
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
    }

    // load properties from a file
    private static void loadProperties(Properties props)
    {
        // load contents of table
        try
        {
            FileInputStream input = new FileInputStream("props.dat");
            props.load(input);
            input.close();
        }
        catch(FileNotFoundException fileNotFound)
        {
            fileNotFound.printStackTrace();
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
        }

        System.out.println("After loading properties");
        listProperties(props);
    }

    // output property values
    private static void listProperties(Properties props)
    {
        // get property names
        Set<Object> keys = props.keySet();

        // output name/value pairs
        for (Object key : keys)
            System.out.printf("%s\t%s\n", key, props.getProperty((String) key));

        System.out.println();
    }
}
