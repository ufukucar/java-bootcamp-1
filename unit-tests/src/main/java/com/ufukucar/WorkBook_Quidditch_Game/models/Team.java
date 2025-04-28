package com.ufukucar.WorkBook_Quidditch_Game.models;

import java.util.Arrays;
import java.util.Objects;

public class Team {

    private String house;
    private String keeper;
    private String seeker;
    private String[] chasers;

    private static final String POSITION_CHASER = "chaser";
    private static final String POSITION_SEEKER = "seeker";
    private static final String POSITION_KEEPER = "keeper";

/* FREQUENTLY ASKED QUESTIONS:
    
Question: the constants are final, so why can't we make them public? It's not possible for the caller to update them.
  Answer: Even if the constant is final, I prefer to expose a method instead of the variable. But if you want to expose the variable, that's also correct.

*/

    public Team(String house, String keeper, String seeker, String[] chasers) {

        if (house == null || keeper == null || seeker == null) {
            throw new IllegalArgumentException("Filed values cannot be null");
        }

        if (house.isBlank() || keeper.isBlank() || seeker.isBlank()) {
            throw new IllegalArgumentException("Filed values cannot be blank");
        }


        if (chasers.length != 3) {
            throw new IllegalArgumentException("Must have 3 chasers");
        }

        if ( hasNull(chasers) || hasBlank(chasers)) {
            throw new IllegalArgumentException("Illegal elements");
        }

        this.house = house;
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = Arrays.copyOf(chasers, chasers.length);
    }

    public Team(Team source) {
        this.house = source.house;
        this.keeper = source.keeper;
        this.seeker = source.seeker;
        this.chasers = Arrays.copyOf(source.chasers, source.chasers.length);
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        checkField(house);
        this.house = house;
    }

    public String getKeeper() {
        return keeper;
    }

    public void setKeeper(String keeper) {
        checkField (keeper);
        this.keeper = keeper;
    }

    public String getSeeker() {
        return seeker;
    }

    public void setSeeker(String seeker) {
        checkField (seeker);
        this.seeker = seeker;
    }

    public String[] getChasers() {
        return Arrays.copyOf(chasers, chasers.length);
    }

    public void setChasers(String[] chasers) {

        if (chasers.length != 3 || hasNull(chasers) || hasBlank(chasers)) {
            throw new IllegalArgumentException("Illegal chaser arguments");
        }

        this.chasers = Arrays.copyOf(chasers, chasers.length);
    }

    public static String getPositionChaser() {
        return POSITION_CHASER;
    }

    public static String getPositionSeeker() {
        return POSITION_SEEKER;
    }

    public static String getPositionKeeper() {
        return POSITION_KEEPER;
    }

    public static boolean hasNull(String[] array) {

       /* for ( int i = 0; i < array.length; i++ ) {
           if ( array[i] == null ) return true;
       }
       return false;
       */

        return Arrays.stream(array).anyMatch((element) -> element == null);


    }


    public static boolean hasBlank (String [] array){
        return Arrays.stream(array).anyMatch((element) -> element.isBlank());
    }


    public void checkField (String param) {
        if ( param == null || param.isBlank() ) {
            throw new IllegalArgumentException(param + " cannot be null");
        }
    }


    @Override
    public String toString() {
        return "House: " + this.house + "\n" +
                "Keeper: " + this.keeper + "\n" +
                "Seeker: " + this.seeker + "\n" +
                "Chasers: " + Arrays.toString(this.chasers) + "\n";
    }

    public boolean equals(Object obj) {

        if ( obj == null ) {
            return false;
        }

        if ( !(obj instanceof Team) ) {
            return false;
        }

        Team team = (Team) obj;

        return this.house.equals(team.house)
                && this.keeper.equals(team.keeper)
                && this.seeker.equals(team.seeker)
                && Arrays.toString(this.chasers).equals(Arrays.toString(team.chasers));

    }

    @Override
    public int hashCode() {
        return Objects.hash(house, keeper, seeker, Arrays.toString(this.chasers));
    }
}
