package com.ufukucar._242_Part2;

import java.util.HashMap;

public class CityPopulationTracker {

    private HashMap<String, City> cityPopulations;

    public CityPopulationTracker() {
        cityPopulations = new HashMap<>();
    }


    public City getCity(String name) {
        return new City(this.cityPopulations.get(name));
    }



    public void setCity(City city) {
        this.cityPopulations.put(city.getName(), new City(city));
    }

    public void addCity(City city) {
        this.cityPopulations.put(city.getName(), city);
    }
}
