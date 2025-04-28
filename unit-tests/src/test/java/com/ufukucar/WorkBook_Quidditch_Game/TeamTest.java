package com.ufukucar.WorkBook_Quidditch_Game;

import com.ufukucar.WorkBook_Quidditch_Game.models.Team;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TeamTest {

    @Test
    public void hasNullTest() {

        String [] chasers = new String [] {null, "Angelina", "Ginny"};

        Assertions.assertTrue(Team.hasNull(chasers));
    }

    @Test
    public void hasBlankTest() {
        String [] chasers = new String [] {" ", "Angelina", "Ginny"};
        Assertions.assertTrue(Team.hasBlank(chasers));
    }






}
