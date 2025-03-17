import java.util.*;

public class RallyRaceResult implements RaceResult{
    private String raceName;
    private String location;
    private ArrayList<Driver> drivers;
    private ArrayList<Integer> points;

    public RallyRaceResult(String raceName, String location){
        this.raceName = raceName;
        this.location = location;
        drivers = new ArrayList<>();
        points = new ArrayList<>();
    }

    //getters
    public String getRaceName(){
        return raceName;
    }
    public String getLocation(){
        return location;
    }

    @Override
    public int getDriverPoints(Driver driver){
        for(int i = 0; i < this.getResults().size(); i++){
            if(this.getResults().get(i).getName().equals(driver.getName())){ //comparing object based on name
                return this.points.get(i);
            }
        }
        //if driver not found
        return -1;
    }

    //inherited methods from superclass:
    @Override
    public Driver recordRaceResult(Driver driver, int position, int points) {
        this.drivers.add(driver);
        this.points.add(points);

        //add points to driver
        driver.addPoints(points);
        return driver;
    }

    @Override
    public List<Driver> getResults() {
        return drivers;
    }
}
