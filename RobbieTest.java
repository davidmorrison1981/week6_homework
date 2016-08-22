import static org.junit.Assert.assertEquals;
import org.junit.*;

public class RobbieTest{
  Robbie robbie;
  Drinks drinks;

  @Before
  public void before(){
    robbie = new Robbie("Huggy Drunk");
    drinks = new Drinks();
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
    robbie.drink(drinks);
    assertEquals(1, robbie.drinksCount());
  }

  @Test
  public void robbieIsDrunk(){
    for (int i=0; i<2; i++){
      robbie.drink(drinks);
    }
    assertEquals(true, robbie.robbieDrunk());
  }

  @Test
  public void robbieNotDrunk(){
    for (int i=0; i<1; i++){
      robbie.drink(drinks);
    }
    assertEquals(false, robbie.robbieDrunk());

  }

  @Test
  public void robbieSoberNextDay(){
    robbie.drink(drinks);
    assertEquals(1, robbie.drinksCount());
    robbie.sober();
    assertEquals(0, robbie.drinksCount());
  }


}