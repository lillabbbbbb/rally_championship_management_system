import java.util.List;

public class ChampionshipStatistics {

    public static double calculateAvgPointsPerDriver(List<Driver> drivers){
        return (double) ChampionshipManager.getInstance().getTotalChampionshipPoints() / drivers.size();
    }

    public static String findMostSuccessfulCountry(List<Driver> drivers){
        int max = 0;
        String country = "";
        for(int i = 0; i < ChampionshipManager.getInstance().getDriverStandings().size(); i++){
            if(ChampionshipManager.getInstance().getDriverStandings().get(i).getTotalPoints() > max){
                country =  ChampionshipManager.getInstance().getDriverStandings().get(i).getCountry();
            }
        }
        return country;
    }

    public static int getTotalRacesHeld(){
        return ChampionshipManager.getInstance().getRaces().size();
    }
}
