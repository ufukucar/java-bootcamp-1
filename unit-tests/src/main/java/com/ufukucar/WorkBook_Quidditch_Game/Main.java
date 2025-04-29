package com.ufukucar.WorkBook_Quidditch_Game;
import com.ufukucar.WorkBook_Quidditch_Game.models.Game;
import com.ufukucar.WorkBook_Quidditch_Game.models.Team;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    static Game game;
    static final String TEAMS_FILE = "src/main/java/com/ufukucar/WorkBook_Quidditch_Game/teams.txt";
    static final String PLAYS_FILE = "src/main/java/com/ufukucar/WorkBook_Quidditch_Game/plays.txt";

    public static void main(String[] args) {


       /*
        // PART 1:
        System.out.println(new Team("GRYFFINDOR", "Oliver", "Harry",
                new String[] {"Angelina", "Ginny", "Katie"}));

        System.out.println(new Team("SLYTHERIN", "Vincent",  "Draco",
                new String[] {"Bridget", "Harper", "Malcolm"}));
        */

        // PART 2:
        /**
         * Team home = new Team("GRYFFINDOR", "Oliver", "Harry",
         *                 new String[] {"Angelina", "Ginny", "Katie"});
         *
         *         Team away = new Team("SLYTHERIN", "Vincent",  "Draco",
         *                 new String[] {"Bridget", "Harper", "Malcolm"});
         *
         *
         *         Game game = new Game(home, away);
         *         Game game2 = new Game(home, away);
         *         Game game3 = new Game(home, away);
         *         System.out.println(game.getScore(home));
                    game.setScore(home, 10);
         *
         *
         *         //System.out.println(game.getTeam("GRYFFINDOR"));
         *
         *System.out.println(Game.getGameCount());
         */

        /** FINAL **/


        try {
            String [] [] data = getData();
            game = new Game(
                            new Team(data[0][0], data[0][1], data[0][2], new String[] {data[0][3], data[0][4], data[0][5]}),
                            new Team(data[1][0], data[1][1], data[1][2], new String[] {data[1][3], data[1][4], data[1][5]})
                    );

            startGame();
            printResult();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        }

    }


    public static String [][] getData() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(TEAMS_FILE);
        Scanner scanFile = new Scanner(fis);

        String [] lines = new String[] {scanFile.nextLine(), scanFile.nextLine()};
        scanFile.close();

        return new String[][] {
          lines[0].split(","), lines[1].split(",")
        };
    }

    public static void startGame() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(PLAYS_FILE);
        Scanner scanFile = new Scanner(fis);
        while (scanFile.hasNextLine()) {
            wait(2);
            System.out.println(game.simulate(scanFile.nextLine()) + "\n");
        }
        scanFile.close();
    }

    public static void printResult() {
        Team gryffindor = game.getTeam("GRYFFINDOR");
        Team slytherin = game.getTeam("SLYTHERIN");
        Team winner = game.getScore(gryffindor) > game.getScore(slytherin) ? gryffindor : slytherin;
        System.out.println("Gryffindor: " + game.getScore(gryffindor) + " SLYTHERIN: " + game.getScore(slytherin));
        System.out.println(winner.getHouse() + " WINS!");
    }

    public static void wait (int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
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
