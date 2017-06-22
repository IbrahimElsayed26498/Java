// ArrayListCollection.java

import java.util.ArrayList;

public class ArrayListCollection
{
  public static void main(String[] args )
  {
    ArrayList< String > items = new ArrayList< String >();

    items.add( "red" );
    items.add( 0, "yellow");

    // Header
    System.out.printf("Display List Contents With Counter-controlled Loop: ");

    // Display The Colors In The List
    for ( int i = 0; i < items.size(); i++ )
        System.out.printf(" %s ", items.get( i ));

    // display Colors usin forearch in the display method
    display( items, "\nDisplay List Contents With Enhanced For Statement: " );

    items.add("green");
    items.add("yellow");
    display( items, "List With Two New Elements : " );

    items.remove("yellow");
    display( items, "Remove First Instance of yellow : ");

    items.remove( 1 );
    display( items, "Remove second list elelment ( green ) : ");

    // check if a value is in the List
    System.out.printf("\"red\" is %s in the list\n", items.contains(" red ") ? "" : "not ");

    //display number of elements in the List
    System.out.printf("Size: %s\n", items.size() );
  }

  public static void display( ArrayList< String > items, String header )
  {
    System.out.printf( header );

    //display each element in items
    for ( String item : items )
        System.out.printf(" %s", item );

    System.out.println();
  }
}
