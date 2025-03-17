public class RallyChampionshipDemo {
    public static void main(String[] args) {

        //creating objects:
        //instantiation of singleton object
        ChampionshipManager cm = ChampionshipManager.getInstance();


        //create car objects
        RallyCar asphaltCar1 = new AsphaltCar("IDK", "Model 1", 300, 200);
        RallyCar gravelCar1 = new GravelCar("IDK", "Model 2", 270, 400);
        RallyCar asphaltCar2 = new AsphaltCar("IDK", "Model 3", 300, 190);
        RallyCar gravelCar2 = new GravelCar("IDK", "Model 4", 285, 394);


        //create driver objects
        Driver d1 = new Driver("Sébastien Ogier", "France", asphaltCar1);
        Driver d2 = new Driver("Kalle Rovanperä", "Finland", gravelCar1);
        Driver d3 = new Driver("Ott Tänak", "Estonia", asphaltCar2);
        Driver d4 = new Driver("Thierry Neuville", "Belgium", gravelCar2);

        //adding drivers and races to the championship:
        cm.registerDriver(d1);
        cm.registerDriver(d2);
        cm.registerDriver(d3);
        cm.registerDriver(d4);


        //instantiate races and record results
        RallyRaceResult race1 = new RallyRaceResult("Rally Finland", "Jyväskylä");
        d1 = race1.recordRaceResult(d1, 1, 25);
        d3 = race1.recordRaceResult(d3, 2, 18);
        d2 = race1.recordRaceResult(d2, 3, 15);
        d4 = race1.recordRaceResult(d4, 4, 12);

        RallyRaceResult race2 = new RallyRaceResult("Monte Carlo Rally", "Monaco");
        d2 = race2.recordRaceResult(d2, 1, 25);
        d4 = race2.recordRaceResult(d4, 2, 18);
        d1 = race2.recordRaceResult(d1, 3, 15);
        d3 = race2.recordRaceResult(d3, 4, 12);

        cm.addRaceResult(race1);
        cm.addRaceResult(race2);





        //display all drivers
        for(int i = 0; i < cm.getDriverStandings().size(); i++){
            System.out.println((i+1) + ". " + cm.getDriverStandings().get(i).getName() + " (" + cm.getDriverStandings().get(i).getCountry() + "): " + cm.getDriverStandings().get(i).getTotalPoints()  + " points");
        }

        System.out.println("\n===== CHAMPIONSHIP LEADER =====");
        System.out.println(cm.getLeadingDriver().getName() + " with " + cm.getLeadingDriver().getTotalPoints() + " points");


        System.out.println("\n===== CHAMPIONSHIP STATISTICS =====");
        System.out.println("Total drivers: " + cm.getDriverStandings().size());
        System.out.println("Total races: " + ChampionshipStatistics.getTotalRacesHeld());
        System.out.println("Average Points Per Driver: " + ChampionshipStatistics.calculateAvgPointsPerDriver(cm.getDriverStandings()));
        System.out.println("Most Successful Country: " + ChampionshipStatistics.findMostSuccessfulCountry(cm.getDriverStandings()));
        System.out.println("Total championship points: " + cm.getTotalChampionshipPoints());


        System.out.println("\n===== RACE RESULTS =====");
        for(int i = 0; i < cm.getRaces().size(); i++){
            System.out.println("Race: " + cm.getRaces().get(i).getRaceName() + " (" + cm.getRaces().get(i).getLocation() + ")");
            for(int j = 0; j < cm.getRaces().get(i).getResults().size(); j++){
                System.out.println("   Position " + (j+1) + ": " + cm.getRaces().get(i).getResults().get(j).getName() + " - " + cm.getRaces().get(i).getDriverPoints(cm.getRaces().get(i).getResults().get(j)) + " points");
            }
            System.out.println();
        }

        System.out.println("\n===== CAR PERFORMANCE RATINGS =====");
        System.out.println("Gravel Car Performance: " + gravelCar1.calculatePerformance());
        System.out.println("Asphalt Car Performance: " + asphaltCar1.calculatePerformance());

    }
}