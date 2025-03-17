import java.util.ArrayList;
import java.util.List;

public class ChampionshipManager {

    private static ChampionshipManager instance;

    private List<Driver> drivers;
    private List<RallyRaceResult> races;
    private int totalDrivers = 0;
    private int totalRaces = 0;

    //constructor
    private ChampionshipManager(){}

    //lazy singleton initialization https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples
    public static ChampionshipManager getInstance(){
        if(instance == null){
            instance = new ChampionshipManager();
            instance.drivers = new ArrayList<>();
            instance.races = new ArrayList<>();
        }
        return instance;
    }

    public void registerDriver(Driver driver){
        drivers.add(driver);
        totalDrivers++;
    }

    public void addRaceResult(RallyRaceResult result){
        races.add(result);
        totalRaces++;
    }

    public List<Driver> getDriverStandings(){
        return drivers;
    }

    public Driver getLeadingDriver(){
        Driver leadingDriver = null;
        int max = 0;
        for(int i = 0; i < instance.getDriverStandings().size(); i++){
              if(ChampionshipManager.getInstance().getDriverStandings().get(i).getTotalPoints() > max){
                  leadingDriver = ChampionshipManager.getInstance().getDriverStandings().get(i);
                  max = ChampionshipManager.getInstance().getDriverStandings().get(i).getTotalPoints();
              }
        }
        return leadingDriver;
    }

    public int getTotalChampionshipPoints(){
        int total = 0;
        for(int i = 0; i < ChampionshipManager.getInstance().getDriverStandings().size(); i++){
            total +=  ChampionshipManager.getInstance().getDriverStandings().get(i).getTotalPoints();
        }
        return total;
    }

    //
    public List<RallyRaceResult> getRaces(){
        return races;
    }

}
