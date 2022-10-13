import java.util.Scanner;

public class CardGame {

    public static void main(String [] args) {

        String [] suits = {"spades", "diamonds", "hearts", "clubs"};
        String [] ranks = {"ace", "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "jack", "queen", "king"};

        for (String suit: suits) {
            for (String rank: ranks) {
                System.out.println(rank + " of " + suit);
            }
        }
        System.out.println();

        int [] deck = new int [52];

        //initialize values in deck to 0-51
        for(int i = 0; i < 52; i++) {
            deck[i] = i;
        }

        //0 - Ace of spades, 1 - 2 of spades, ..., 12 - king of spades
        //13 - Ace of diamonds, ...
        //26 - Ace of hearts, ...
        //39 - Ace of clubs, ... , 51 - king of clubs

        for (int i = 0; i < 52; i++) {

            //use the value of the card to produce the correct rank index
            //and suit index
            int cardValue = deck[i];

            //produce rank index by finding the remainder after dividing
            //by 13, which will always be in the range [0, 12]
            int rankI = cardValue % 13;

            //use int division to produce [0, 4] depending on which
            //quarter of the [0, 51] range cardValue is in
            int suitI = cardValue / 13;

            String rank = ranks[rankI];
            String suit = suits[suitI];
            System.out.println("Card value: " + cardValue + " is the " +
                    rank + " of " + suit);

        }

        //shuffle the deck
        //use two indices with at least one that's random and swap the values
        //at those positions
        for (int i = 0; i < 200; i++) {
            int index1 = (int)(Math.random() * 52);
            int index2 = (int)(Math.random() * 52);

            int temp = deck[index1];
            deck[index1] = deck[index2];
            deck[index2] = temp;
        }

        System.out.println();

        for (int i = 0; i < 52; i++) {
            int cardValue = deck[i];
            int rankI = cardValue % 13;
            int suitI = cardValue / 13;
            String rank = ranks[rankI];
            String suit = suits[suitI];
            System.out.println("Card value: " + cardValue + " is the " +
                    rank + " of " + suit);

        }

        System.out.println();

        //hand can hold 7 cards
        int [] hand = new int [7];

        //write a game where the user first draws the first 7 cards from
        //the deck to add to the hand, then keep asking the user for
        //the index of the card they want to replace with a new card
        //until they get 4 of a kind (same rank) or the deck runs out
        //of cards

        //use a variable to track the "top" of the deck since array sizes
        //can't change
        int top = 0;

        //get initial cards for hand
        for (int i = 0; i < hand.length; i++) {
            hand[i] = deck[top];
            top++;
        }

        //print out hand
        for (int i = 0; i < hand.length; i++) {
            int cardValue = hand[i];
            int rankI = cardValue % 13;
            int suitI = cardValue / 13;
            String rank = ranks[rankI];
            String suit = suits[suitI];
            System.out.println(i + " is the " +
                    rank + " of " + suit);
        }

        //while ( deck has cards and no four of kind )
        //  ask user which card to swap
        //  get new card
        //  print new hand
        //  check if there's four of a kind

        Scanner s = new Scanner(System.in);
        boolean fourOfKind = false;
        while (top < 52 && !fourOfKind) {

            System.out.println("What index of your hand would you like to replace?");
            int index = s.nextInt();

            int newCard = deck[top];
            top++;
            hand[index] = newCard;

            for (int i = 0; i < hand.length; i++) {
                int cardValue = hand[i];
                int rankI = cardValue % 13;
                int suitI = cardValue / 13;
                String rank = ranks[rankI];
                String suit = suits[suitI];
                System.out.println(i + " is the " +
                        rank + " of " + suit);
            }



        }

    }
}
