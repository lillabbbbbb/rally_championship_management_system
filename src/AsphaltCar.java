public class AsphaltCar extends RallyCar{

    double downforce;

    public AsphaltCar(String make, String model, int horsePower, double downforce){
        super(make, model, horsePower);
        this.downforce = downforce;
    }

    public double getDownforce(){
        return downforce;
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

    @Override
    public double calculatePerformance() {
        return horsePower * downforce / 1000;
    }
}
