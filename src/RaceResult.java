import java.util.List;

public interface RaceResult {
    public Driver recordRaceResult(Driver driver, int position, int points);
    public int getDriverPoints(Driver driver);
    public List<Driver> getResults();

}
