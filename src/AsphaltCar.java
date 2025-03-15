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
        return;
    }

    @Override
    public String getModel() {
        return "";
    }

    @Override
    public int getHorsePower() {
        return 0;
    }

    @Override
    public int calculatePerformance() {

    }
}
