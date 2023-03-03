public class U2 extends Rocket{
    public U2(int rocketCost, int rocketWeightKg, int maxWeightWithCargoKg, double chanceLaunchExplosion, double chanceLandingCrash) {
        super(rocketCost, rocketWeightKg, maxWeightWithCargoKg, chanceLaunchExplosion, chanceLandingCrash);
    }

    @Override
    public boolean launch() {
        return super.launch();
    }

    @Override
    public boolean land() {
        return super.land();
    }


/*    int rocketCost = 120;
    int rocketWeightKg = 18000;
    int maxWeightWithCargoKg = 29000;
    double chanceLaunchExplosion;    //4% * (cargo carried / cargo limit)
    double chanceLandingCrash;      //8% * (cargo carried / cargo limit)*/


}
