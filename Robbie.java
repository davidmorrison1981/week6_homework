import java.util.*;

class Robbie{
  private String type;
  private Drinks[] drunk;

  public Robbie(String type){
    this.type = type;
    this.drunk = new Drinks [2];
  }

  public String getType(){
    return this.type;
  }

  public int drinksCount(){
    int counter = 0;

    for (Drinks drinks : drunk){
      if (drinks !=null){
        counter ++;
      }
    }
    return counter;
  }

  public void drink(Drinks drinks){
    if (robbieDrunk()) return;
    int drinksCount = drinksCount();
    drunk[drinksCount] = drinks;
  }

  public boolean robbieDrunk(){
    return drinksCount() == drunk.length;
  }

  public void sober(){
    for(int i=0; i<drunk.length; i++){
      drunk[i] = null;
    }
  }
}

