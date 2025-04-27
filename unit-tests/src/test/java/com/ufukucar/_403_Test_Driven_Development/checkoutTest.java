package com.ufukucar._403_Test_Driven_Development;

import com.ufukucar._403_Test_Driven_Devolopment.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class checkoutTest{

    @org.junit.jupiter.api.Test
    public void subtotalIsValid(){
        assertEquals(19.2, Main.getSubtotal());
    }

    @Test
    public void taxIsValid(){
        assertEquals((3.9), Main.getTax(30));
    }

    @Test
    public void totalIsValid(){
        assertEquals(113, Main.getTotal(100,13));
    }


}
