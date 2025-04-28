package com.ufukucar.WorkBook_Quidditch_Game;
import com.ufukucar.WorkBook_Quidditch_Game.models.Game;
import com.ufukucar.WorkBook_Quidditch_Game.models.Team;

public class Main {

    static Game game;

    public static void main(String[] args) {


       /*
        // PART 1:
        System.out.println(new Team("GRYFFINDOR", "Oliver", "Harry",
                new String[] {"Angelina", "Ginny", "Katie"}));

        System.out.println(new Team("SLYTHERIN", "Vincent",  "Draco",
                new String[] {"Bridget", "Harper", "Malcolm"}));
        */

        // PART 2:
        Team home = new Team("GRYFFINDOR", "Oliver", "Harry",
                new String[] {"Angelina", "Ginny", "Katie"});

        Team away = new Team("SLYTHERIN", "Vincent",  "Draco",
                new String[] {"Bridget", "Harper", "Malcolm"});


        Game game = new Game(home, away);
        Game game2 = new Game(home, away);
        Game game3 = new Game(home, away);
        /*  System.out.println(game.getScore(home));;
            game.setScore(home, 10);
        */

        //System.out.println(game.getTeam("GRYFFINDOR"));

        System.out.println(Game.getGameCount());


    }


    /**
     * Function name: getData
     * @return (String[][])
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Returns data from TEAMS_FILE as a String[][] array
     */


    /** Function name: startGame
     * 
     * Inside the function:
     *    1. Grabs each play from plays.txt and calls game.simulate(play);
     *    2. Prints the return from game.simulate(play)
     *        - println("\n" + <return> + "\n");
     */


    /** Function name: printResult()
     * 
     * Inside the function:
     *    1. Prints the final score: println("\nGRYFFINDOR: " + <gryffindor score> + " SLYTHERIN: " + <slytherin score>);
     *    2. Prints the winner: println("\n" + <winner team name> + " WINS!");
     *  
     */

    /**
     * Function name: wait
     * @param sec
     * 
     * Inside the function:
     *  1. Make the code sleep for X seconds.
     */


  }
