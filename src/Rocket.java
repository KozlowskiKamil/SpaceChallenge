public class Rocket implements SpaceShip{

  int rocketCost;
  int rocketWeightKg;
  int maxWeightWithCargoKg;
 // int currentWeight;   // = currentWeight + rocketWeightKg;


  public Rocket(int rocketCost, int rocketWeightKg, int maxWeightWithCargoKg) {
    this.rocketCost = rocketCost;
    this.rocketWeightKg = rocketWeightKg;
    this.maxWeightWithCargoKg = maxWeightWithCargoKg;

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
      if (item.getWeight() > maxWeightWithCargoKg || rocketWeightKg > maxWeightWithCargoKg ) {
        System.out.println("za duża waga");
        return false;
      } else {
        System.out.println("waga ok");
        return true;
      }
    }


  @Override
    public void carry(Item item) {
      rocketWeightKg += item.getWeight();
    System.out.println("rocketWeightKg " + rocketWeightKg);
    }
}