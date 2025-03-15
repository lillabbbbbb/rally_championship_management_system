import java.util.List;
import java.util.Map;

public class RallyRaceResult implements RaceResult{
    private String raceName;
    private String location;
    private Map<Driver, Integer> results;

    public RallyRaceResult(String raceName, String location){
        this.raceName = raceName;
        this.location = location;
    }

    //getters
    public String getRaceName(){
        return raceName;
    }
    public String getLocation(){
        return location;
    }

    public int getDriverPoints(Driver driver){

    }

    //inherited methods from superclass
    @Override
    public void recordRaceResult(Driver driver, int position, int points) {

    }

    @Override
    public void getRaceResults(Driver driver) {

    }

    @Override
    public List<Driver> getResults() {
        return List.of();
    }
}
