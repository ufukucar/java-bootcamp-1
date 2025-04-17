package com.ufukucar._242_Part2;

public class Main {
    public static void main(String[] args) {

        CityPopulationTracker tracker = new CityPopulationTracker();

        // Test the addCity method
        tracker.addCity(new City("New York", "USA", 8_550_405));
        tracker.addCity(new City("Los Angeles", "USA", 3_971_883));


        // Test the getCity method
        City city = tracker.getCity("New York");
        System.out.println("Population of New York: " + city.getPopulation());

        // Test the setCity method
        City updatedNyCity = new City("New York", "USA", 8_600_000);
        tracker.addCity(updatedNyCity);

        // Verify that the city data was updated
        updatedNyCity = tracker.getCity("New York");
        System.out.println("Population of New York: " + updatedNyCity.getPopulation());


    }
}