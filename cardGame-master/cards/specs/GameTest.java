import static org.junit.Assert.*;
import org.junit.*;
import cardTypes.*;
import cards.*;
import Game.*;

public class GameTest{

  Pack pack;
  Deck deck;
  Player player;

  @Before
  public void before(){
    pack = new Pack();
    deck = new Deck();
    deck.add(pack);
    player = new Player("David");
  }

  @Test
  public void playerHasName(){
    assertEquals("David", player.getName());
  }
}