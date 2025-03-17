public class GravelCar extends RallyCar {

    private double suspensionTravel;

    //constructor
    public GravelCar(String make, String model, int horsePower, double suspensionTravel) {
        super(make, model, horsePower);
        this.suspensionTravel = suspensionTravel;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }
    public double getSuspensionTravel(){
        return suspensionTravel;
    }
    @Override
    public double calculatePerformance() {
        return horsePower * suspensionTravel / 1200;
    }
}
