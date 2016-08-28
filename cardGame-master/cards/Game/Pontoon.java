package Game;

import java.util.Scanner; 
import cards.*;

public class Pontoon{

     public void game(String[] yesorno) {
        Scanner input = new Scanner(System.in);
        int playerScore = 0, computerScore = 0;
        String newCard = "";

        playerScore += deck.dealCard();
        computerScore += deck.dealCard();
        playerScore += deck.dealCard();
        computerScore += deck.dealCard();

        System.out.println(
          "Your score is %d would you like another card ? y/n ", playerScore);

        newCard = input.nextLine();
       
        if(newCard.equalsIgnoreCase("Y")){

            while (newCard.equalsIgnoreCase("Y") && playerScore < 21) { 
                playerScore += dealCard();
                System.out.printf("Your score is %d would you like another card ? y/n ", playerScore);
                newCard = input.nextLine();
            }
          }

          while(computerScore < 21){
            computerScore += dealCard();
          }

        checkWin(playerScore, computerScore);

    public void checkWin(int Player, int Computer) {
        int player = Player;
        int computer = Computer;

        System.out.println("computer score is score is %d  ", Computer);
        
        if (player > 21) {
            System.out.println("     Player Bust");} 

          else if (computer > 21) {
            System.out.println("     Computer Bust,Player Wins");} 
          else {

            if (player > computer) {
                System.out.println("    Player Wins!");
            } else {
                System.out.println("    Computer Wins!");
            }
        }
    }
}