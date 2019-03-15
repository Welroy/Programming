import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {

        int turn = 1;

        // == Instantiate list for Players Hand ==
        List<String> player_1 = new ArrayList<>();
        List<String> player_2 = new ArrayList<>();
        List<String> player_3 = new ArrayList<>();
        List<String> player_4 = new ArrayList<>();

        // == Create object to access methods of that class ==
        Process obj = new Process();

        // == Create a Deck ==
        obj.createDeck();

        // == While runs until one of the player wins ==
        outer : while(true) {

            // == Execute cases depending on which player turn it is ==
            switch (turn) {

                case 1:

                    player_1.add(obj.getRandomCard());

                    if(obj.winCheck(player_1)) {

                        System.out.println("Player 1 Wins");
                        obj.displayPlayerDecks(player_1,player_2,player_3,player_4);
                        break outer;
                    }
                    turn = (turn % 4) + 1;

                case 2:

                    player_2.add(obj.getRandomCard());

                    if(obj.winCheck(player_2)) {

                        System.out.println("Player 2 Wins");
                        obj.displayPlayerDecks(player_1,player_2,player_3,player_4);
                        break outer;
                    }
                    turn = (turn % 4)+1;


                case 3:

                    player_3.add(obj.getRandomCard());

                    if(obj.winCheck(player_3)) {

                        System.out.println("Player 3 Wins");
                        obj.displayPlayerDecks(player_1,player_2,player_3,player_4);
                        break outer;
                    }
                    turn = (turn % 4) + 1;


                case 4:

                    player_4.add(obj.getRandomCard());

                    if(obj.winCheck(player_4)) {

                        System.out.println("Player 4 Wins");
                        obj.displayPlayerDecks(player_1,player_2,player_3,player_4);
                        break outer;
                    }
                    turn = (turn % 4) + 1;

                    // == No one wins if Last player has 13 cards in his deck ==
                    if(player_4.size()>12){
                        System.out.println("Its a draw!!! No1 Wins");
                        obj.displayPlayerDecks(player_1,player_2,player_3,player_4);
                        break outer;
                    }
            }
        }

    }
}