public abstract class RallyCar {
    protected String make;
    protected String model;
    protected int horsePower;

    public RallyCar(String make, String model, int horsePower){
        this.make = make;
        this.model = model;
        this.horsePower = horsePower;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public  int getHorsePower(){
        return horsePower;
    }

    //abstract method!
    public abstract double calculatePerformance();
}
