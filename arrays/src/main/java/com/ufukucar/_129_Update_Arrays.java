package com.ufukucar;

import java.util.Arrays;

public class _129_Update_Arrays {

    public static void main (String[] args) {

        String [] flavours = {"Sweet", "Sour", "Salty"};

        String [] menu = {"Espresso", "Ice Coffee", "Macchiato"};

        menu[2] = "Latte";

        System.out.println(Arrays.toString(menu));

        String [] newMenu = new String [5];

        for ( int i = 0; i < menu.length; i++ ) {
            newMenu[i] = menu[i];
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";

        System.out.println(Arrays.toString(newMenu));
    }


}
