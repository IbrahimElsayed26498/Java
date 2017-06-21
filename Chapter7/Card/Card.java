// Card.java

public class Card
{
  private String face;
  private String suit;

  public Card ( String cardFace, String suitFace )
  {
    face = cardFace;
    suit = suitFace;
  }

  public String toString()
  {
    return face + " of " + suit;
  }
}
