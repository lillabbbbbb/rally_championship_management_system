import java.util.List;

public interface RaceResult {
    public void recordRaceResult(Driver driver, int position, int points);
    public void getRaceResults(Driver driver);
    public List<Driver> getResults();

}
