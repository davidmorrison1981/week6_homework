import static org.junit.Assert.*;
import org.junit.*;

public class RobbieTest{
  Robbie robbie;
  Beer beer;
  Gin gin;
  HeadSizedBurrito headSizedBurrito;

  @Before
  public void before(){
    robbie = new Robbie("Huggy Drunk");
    beer = new Beer();
    gin = new Gin();
    headSizedBurrito = new HeadSizedBurrito();
  }

  @Test
  public void typeOfDrunkRobbie(){
    assertEquals("Huggy Drunk", robbie.getType());
  }

  @Test
  public void robbieStartsSober(){
    assertEquals(0, robbie.drinksCount());
  }

  @Test
  public void robbieCanDrink(){
    robbie.drink(beer);
    assertEquals(1, robbie.drinksCount());
  }


  @Test
  public void robbieSoberNextDay(){
    robbie.consume(beer);
    robbie.consume(gin);
    robbie.consume(headSizedBurrito);
    robbie.sober();
    assertEquals(0, robbie.drinksCount());
  }

  @Test
  public void robbieCanDrinkGin(){
    robbie.drink(gin);
    assertEquals(1, robbie.nomNomCount());
  }

}