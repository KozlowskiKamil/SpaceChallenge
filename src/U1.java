public class U1 extends Rocket{

    double cargoCarried = rocketWeightKg - currentWeight;
    double cargoLimit = maxWeightWithCargoKg - rocketWeightKg;


    public U1(int rocketCost, int rocketWeightKg, int maxWeightWithCargoKg) {
        super(rocketCost, rocketWeightKg, maxWeightWithCargoKg);
    }
    @Override
    public boolean launch() {
        double chanceOfExplosion = 0.05 * (cargoCarried / cargoLimit);
        System.out.println(chanceOfExplosion);
        return Math.random() > chanceOfExplosion;

    }
    @Override
    public boolean land() {
        double chanceOfCrash = 0.01 * (cargoCarried / cargoLimit);
        return Math.random() > chanceOfCrash;
    }
}
