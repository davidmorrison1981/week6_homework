package Game;

import java.util.Scanner;

public class Pontoon{

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerScore = 0, computerScore = 0;
        String newCard = "";
        playerScore += dealCard();
        computerScore += dealCard();
        playerScore += dealCard();
        computerScore += dealCard();

        System.out.printf("Your score is %d would you like another card ? y/n ", playerScore);
        newCard = input.nextLine();
        if(newCard.equalsIgnoreCase("Y")) {
            while (newCard.equalsIgnoreCase("Y") && playerScore < 21) { 
                playerScore += dealCard();
                System.out.printf("Your score is %d would you like another card ? y/n ", playerScore);
                newCard = input.nextLine();
            }
        } while(computerScore < 15){
            computerScore += dealCard();
        }
        checkWin(playerScore, computerScore);
    }
    public static int dealCard(){
        int value = (int) (Math.random() * 10) + 1;
        int score = value;
        System.out.println(+value);
        if(value == 11) {
            System.out.println("Ace!");
            score = 11;
        }else if (value == 10) {
            System.out.println("King!");
            score = 10;
        }else if (value == 10) {
            System.out.println("Queen!");
            score = 10;
        } else if (value == 10) {
            System.out.println("Jack!");
            score = 10;
        } else {
            score = value;
        }

        return score;
    }

    public static void checkWin(int Player, int Computer) {
        int player = Player;
        int computer = Computer;

        System.out.printf("computer score is score is %d  ", Computer);
        if (player > 21) {
            System.out.println("     Player Bust");
        } else if (computer > 21) {
            System.out.println("     Computer Bust,Player Wins");
        } else {
            if (player > computer) {
                System.out.println("    Player Wins!");
            } else {
                System.out.println("    Computer Wins!");
            }
        }
    }
}