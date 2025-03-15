public class GravelCar extends RallyCar {

    private double suspensionTravel;

    //constructor
    public GravelCar(String make, String model, int horsePower, double suspensionTravel) {
        super(make, model, horsePower);
        this.suspensionTravel = suspensionTravel;
    }

    @Override
    public int calculatePerformance() {
        return;
    }
}
