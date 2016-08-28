package cards;
import java.util.*;

public class Hand {

  private ArrayList<Card> hand;
  private String score;

  public Hand() {
    hand = new ArrayList<Card>();
    score = score;
  }


  public void takeACard(Deck deck){
    //deck may become discard pile in the future so this may become an interface not deck passed in
    hand.add(deck.dealCard());
  }

  public String toString(){
    String string = "";
    for( Card card : hand){
      string += card.toString() + "\n";
    }
    return string;
  }

}

// public static int dealCard(){
//     int value = (int) (Math.random() * 10) + 1;
//     int score = value;
//     System.out.println(+value);
//     if(value == 11) {
//         System.out.println("Ace!");
//         score = 11;
//     }else if (value == 10) {
//         System.out.println("King!");
//         score = 10;
//     }else if (value == 10) {
//         System.out.println("Queen!");
//         score = 10;
//     } else if (value == 10) {
//         System.out.println("Jack!");
//         score = 10;
//     } else {
//         score = value;
//     }

