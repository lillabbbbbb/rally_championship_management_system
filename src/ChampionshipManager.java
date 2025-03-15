import java.util.List;

public class ChampionshipManager {

    private static ChampionshipManager instance;

    private List<Driver> drivers;
    private List<RallyRaceResult> races;
    private int totalDrivers;
    private int totalRaces;

    //constructor
    private ChampionshipManager(){}

    //lazy singleton initialization https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples
    public ChampionshipManager getInstance(){
        if(instance == null){
            instance = new ChampionshipManager();
        }
        return instance;
    }

    public void registerDriver(Driver driver){
        drivers.add(driver);
        totalDrivers++;
    }

    public void addRaceResult(RallyRaceResult result){
        races.add(result);
    }

    public List<Driver> getDriverStandings(){

    }

    public Driver getLeadingDriver(){

    }

    public int getTotalChampionshipPoints(){

    }

}
