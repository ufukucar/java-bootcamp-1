package com.ufukucar;

import java.util.Arrays;
import java.util.List;

public class _279_ {


    public static  void main(String[] args) {



        List<Integer> integers = Arrays.asList(25, 19, 23, 45, 38, 23, 59, 12);

        integers.sort((right, left) -> right.compareTo(left));


        for (Integer integer : integers) {
            System.out.print(integer + ", ");
        }



    }


}
