import static org.junit.Assert.*;
import org.junit.*;
import cardTypes.*;
import cards.*;
import Game.*;

public class GameTest{

  Pack pack;
  Deck deck;
  Player1 player1;

  @Before
  public void before(){
    pack = new Pack();
    deck = new Deck();
    deck.add(pack);
    player1 = new Player1("David");
  }

  @Test
  public void playerHasName(){
    assertEquals("David", player1.getName());
  }
}