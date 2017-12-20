/**
 * Fig. 16.10: DeckOfCards.java
 * Card shuffling and dealing with Collections method shuffle
 */

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

// class to represent a Card in a deck of cards
class Card {

    public static enum Face { Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King };
    public static enum Suit {Clubs, Diamonds, Hearts, Spades};

    private final Face face;
    private final Suit suit;

    // Constructor
    public Card(Face face, Suit suit)
    {
        this.face = face;
        this.suit = suit;
    }

    public Face getFace() {
        return face;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", face, suit);
    }
} // end class Card

// class DeckOfCards declaration
public class DeckOfCards
{
    private List<Card> list; // declare List that will store cards

    // set up deck of Cards and shuffle
    public DeckOfCards()
    {
        Card[] deck = new Card[52];
        int count = 0; // number of cards

        // populate deck with Card objects
        for (Card.Suit suit : Card.Suit.values())
        {
            for (Card.Face face : Card.Face.values())
            {
                deck[count] = new Card(face, suit);
                ++count;
            }
        }

        list = Arrays.asList(deck);
        Collections.shuffle(list);
    }

    // Output deck
    public void printCards()
    {
        // display 52 cards in two columns
        for (int t = 0; t < list.size(); t++)
            System.out.printf("%-19s%s", list.get(t), ((t + 1) % 4 == 0) ? "\n" : "");
    }

    public static void main(String[] args)
    {
        DeckOfCards cards = new DeckOfCards();
        cards.printCards();
    }
}
