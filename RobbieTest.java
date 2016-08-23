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
    assertEquals(0, robbie.nomNomCount());
  }

  @Test
  public void robbieCanDrink(){
    robbie.consume(beer);
    assertEquals(1, robbie.nomNomCount());
  }


  @Test
  public void robbieSoberNextDay(){
    robbie.consume(beer);
    robbie.consume(gin);
    robbie.consume(headSizedBurrito);
    robbie.sober();
    assertEquals(0, robbie.nomNomCount());
  }

  @Test
  public void robbieCanDrinkGin(){
    robbie.consume(gin);
    assertEquals(1, robbie.nomNomCount());
  }

  @Test
  public void robbieCanEatBurrito(){
    robbie.consume(gin);
    assertEquals(1, robbie.nomNomCount());
  }

}