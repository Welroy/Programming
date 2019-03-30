import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Process {

    List<String> deck  = new ArrayList<>();
    Random rand = new Random();

    // == Funcion to create the deck ==
    void createDeck(){

        // == Initialize suits and ranks for deck Array ==
        String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
        String[] ranks = {"A ","K ","Q ","J ","10","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};

        // == Fill the deck(list) with all types of cards == //
        for(int i = 0 ; i < 4 ; i++){

            for( int j = 0 ; j < 13 ; j++){

                deck.add(ranks[j]+suits[i]);
            }
        }
    }

    // == Function to chose a random card from deck ==
    public String getRandomCard(){

        int index = rand.nextInt(deck.size());
        String card = deck.get(index);
        deck.remove(index);
        return card;

    }

    // == Function to check if a player has won ==
    public boolean winCheck(List player){

        Boolean A = false ,B = false,C = false;

        for( int i = 0 ; i < player.size() ; i++){

            if(((String)player.get(i)).contains("7")){

                A = true;

            }

            if(((String)player.get(i)).contains("8")){

                B = true;

            }

            if(((String)player.get(i)).contains("9")){

                C = true;

            }

        }

        // == Return true if player has won ==
        if( A && B && C )

            return true;

        else

            return false;

    }

    // == Print all player decks ==
    public void displayPlayerDecks(List p1,List p2,List p3,List p4){

        System.out.println("Player 1 Deck : ");
        for( int i = 0 ; i < p1.size() ; i++){

            System.out.println(p1.get(i));

        }

        System.out.println("Player 2 Deck : ");
        for( int i = 0 ; i < p2.size() ; i++){

            System.out.println(p2.get(i));

        }

        System.out.println("Player 3 Deck : ");
        for( int i = 0 ; i < p3.size() ; i++){

            System.out.println(p3.get(i));

        }

        System.out.println("Player 4 Deck : ");
        for( int i = 0 ; i < p4.size() ; i++){

            System.out.println(p4.get(i));

        }
    }
}
