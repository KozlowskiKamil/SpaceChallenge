public class U2 extends Rocket {
    double cargoCarried = rocketWeightKg - rocketWeightKg;
    double cargoLimit = maxWeightWithCargoKg - rocketWeightKg;

    public U2(int rocketCost, int rocketWeightKg, int maxWeightWithCargoKg) {
        super(rocketCost, rocketWeightKg, maxWeightWithCargoKg);
    }

    @Override
    public boolean launch() {
        double chanceOfExplosion = 0.04 * (cargoCarried / cargoLimit);
        System.out.println(chanceOfExplosion);
        return Math.random() > chanceOfExplosion;
    }

    @Override
    public boolean land() {
        double chanceOfCrash = 0.08 * (cargoCarried / cargoLimit);
        return Math.random() > chanceOfCrash;
    }
}