// Christmas.java

public class Christmas
{
  public static void main(String[] args)
  {
    System.out.println("Program Prints The Twelve Days Of Christmas Song\n\n");

    for (int i = 1; i <= 12; i++){
  		switch(i){

  				case 1:
  					System.out.println("On The First Day Of Christmas,");
  					break;
  				case 2:
  					System.out.println("On The Second Day Of Christmas,");
  					break;
  				case 3:
  					System.out.println("On The Third Day Of Christmas,");
  					break;
  				case 4:
  					System.out.println("On The Fourth Day Of Christmas,");
  					break;
  				case 5:
  					System.out.println("On The Fifth Day Of Christmas,");
  					break;
  				case 6:
  					System.out.println("On The Sixth Day Of Christmas,");
  					break;
  				case 7:
  					System.out.println("On The Seventh Day Of Christmas,");
  					break;
  				case 8:
  					System.out.println("On The Eighth Day Of Christmas,");
  					break;
  				case 9:
  					System.out.println("On The Ninth Day Of Christmas,");
  					break;
  				case 10:
  					System.out.println("On The Tenth Day Of Christmas,");
  					break;
  				case 11:
  					System.out.println("On The Eleventh Day Of Christmas,");
  					break;
  				case 12:
  					System.out.println("On The Twelfth Day Of Christmas,");
  					break;
  			}
  		System.out.println("My True Love Sent To Me,");

      for (int j = i; j > 0; j--){
  			switch(j){

  				case 1:
            {
  					   if ( i == 1)
               {
                 System.out.println("A Patridge In A Pear Tree.");
               }
               else
               {
                 System.out.println("And A Patridge In A Pear Tree.");
               }
            }
  					break;
  				case 2:
  					System.out.println("Two Turtle Doves,");
  					break;
  				case 3:
  					System.out.println("Three French Hens,");
  					break;
  				case 4:
  					System.out.println("Four Calling Birds,");
  					break;
  				case 5:
  					System.out.println("Five Golden Rings,");
  					break;
  				case 6:
  					System.out.println("Six Geese A Laying,");
  					break;
  				case 7:
  					System.out.println("Seven Swans A Swimming,");
  					break;
  				case 8:
  					System.out.println("Eight Maids A Milking,");
  					break;
  				case 9:
  					System.out.println("Nine Ladies Dancing,");
  					break;
  				case 10:
  					System.out.println("Ten Lords A Leaping,");
  					break;
  				case 11:
  					System.out.println( "Eleven Pipers Piping,");
  					break;
  				case 12:
  					System.out.println( "Twelve Drummers Drumming,");
  					break;
  			}
  		}
  		System.out.println("");
  	}
  }
}
