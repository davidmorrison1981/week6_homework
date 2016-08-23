import java.util.*;

class Robbie{
  private String type;
  private ArrayList<Consumable> drunk;

  public Robbie(String type){
    this.type = type;
    this.drunk = new ArrayList<Consumable>();
  }

  public String getType(){
    return this.type;
  }

  public int drinksCount(){
    return drunk.size();
  }

  public void drink(Consumable nomNom){
    drunk.add(nomNom);
  }

  public void sober(){
      drunk.clear();
    }
  }
}

