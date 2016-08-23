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

  public int nomNomCount(){
    return drunk.size();
  }

  public void consume(Consumable nomNom){
    drunk.add(nomNom);
  }

  public void sober(){
      drunk.clear();
    }
  

  public Consumable robbieGetsBeerAndBurritoShits(){
    if (nomNomCount() > 0){
      return drunk.remove(0);
    }
    return null;
  }
}

