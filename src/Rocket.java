public class Rocket implements SpaceShip{

  int rocketCost;
  int rocketWeightKg;
  int maxWeightWithCargoKg;
  double chanceLaunchExplosion;
  double chanceLandingCrash;

  public Rocket(int rocketCost, int rocketWeightKg, int maxWeightWithCargoKg, double chanceLaunchExplosion, double chanceLandingCrash) {
    this.rocketCost = rocketCost;
    this.rocketWeightKg = rocketWeightKg;
    this.maxWeightWithCargoKg = maxWeightWithCargoKg;
    this.chanceLaunchExplosion = chanceLaunchExplosion;
    this.chanceLandingCrash = chanceLandingCrash;
  }


  @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
      if (item.getWeight() < maxWeightWithCargoKg) {
        return true;
      } else return false;
    }

    @Override
    public void carry(Item item) {
      item.getWeight();
      rocketWeightKg += item.getWeight();
      item.setWeight(rocketWeightKg);

    }
    //Create a class Rocket that implements the SpaceShip Interface and hence implements all the methods above.

/*    launch and land methods in the Rocket class should always return true. When U1 and U2 classes extend the Rocket class they will override these methods to return true or false based on the actual probability of each type.
    carry and canCarry should be implemented here and will not need to be overridden in the U1 and U2 classes*/
//metody startu i lądowania w klasie Rocket powinny zawsze zwracać wartość true. Kiedy klasy U1 i U2 rozszerzają klasę Rocket, zastąpią te metody, aby zwrócić prawdę lub fałsz na podstawie rzeczywistego prawdopodobieństwa każdego typu.
//    carry i canCarry powinny zostać zaimplementowane tutaj i nie będą musiały być zastępowane w klasach U1 i U2*/
}
