package com.ufukucar.WorkBook_Quidditch_Game;
import com.ufukucar.WorkBook_Quidditch_Game.models.Game;
import com.ufukucar.WorkBook_Quidditch_Game.models.Team;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GameTest {

    static Game game;

    @BeforeAll
    public static void setUp() {
        Team home = new Team("GRYFFINDOR", "Oliver", "Harry",
                new String[] {"Angelina", "Ginny", "Katie"});

        Team away = new Team("SLYTHERIN", "Vincent",  "Draco",
                new String[] {"Bridget", "Harper", "Malcolm"});


         game = new Game(home, away);
    }


    @Test
    public void getPlaceholderTest() {

        Assertions.assertEquals("chaser", game.getPlaceholder("<chaser> gets the next pass"));
    }

    @Test
    public void replacePlaceholderTest() {
        Assertions.assertEquals("Katie gets the next pass", game.replacePlaceholder("<chaser> gets the next pass", "chaser", "Katie"));
    }


    @Test
    public void quaffleScoreTest() {
        Team team = game.getTeam("GRYFFINDOR");
        game.quaffleScore(team);
        game.quaffleScore(team);
        Assertions.assertEquals(Game.getQuafflePoints() * 2, game.getScore(team));
    }

    @Test
    public void catchSnitchTest() {
        Team team = game.getTeam("SLYTHERIN");
        game.catchSnitch(team);
        Assertions.assertEquals(Game.getSnitchPoints(), game.getScore(team));

    }





}
