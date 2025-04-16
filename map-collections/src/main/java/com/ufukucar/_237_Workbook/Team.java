package com.ufukucar._237_Workbook;

import java.util.HashMap;
import java.util.Map;

public class Team {

    private String name;
    private Map<String, String> players;

    public Team(String name) {
        // set the name.
        setName(name);
        // set players equal to a new HashMap.
        players = new HashMap<String, String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPlayer(String position) {
        // return a player from the HashMap.
        return this.players.get(position);
    }


    public void setPlayer(String position, String player) {
        // Add a <String, String> entry into the HashMap
        this.players.put(position, player);
    }


}
