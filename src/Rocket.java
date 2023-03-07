public class Rocket implements SpaceShip {

    int rocketCost;
    int rocketWeightKg;
    int maxWeightWithCargoKg;
    int currentWeight = rocketWeightKg;


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
        if (item.getWeight() < maxWeightWithCargoKg) {
            return true;
        } else return false;
    }

    @Override
    public void carry(Item item) { // TODO: 06.03.2023  
        item.getWeight();
        currentWeight = currentWeight + item.getWeight();
        item.setWeight(currentWeight);
        System.out.println("metoda carry item - currentWeight " + currentWeight + " rocketWeightKg " + rocketWeightKg);

    }
}