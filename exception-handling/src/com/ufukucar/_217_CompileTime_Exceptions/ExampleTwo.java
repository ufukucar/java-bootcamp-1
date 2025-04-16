package com.ufukucar._217_CompileTime_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleTwo {

    public static void main(String[] args)  {

        try {

            readFile("src/com/ufukucar/_217_CompileTime_Exceptions/greetings.txt");

        }catch(FileNotFoundException e) {

            System.out.println("File Not Found Efenim: " + e.getMessage());

        }finally{

            System.out.println("Process Complete");

        }


    }


    public static void readFile (String fileName) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);

        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine());
        scanner.close();


    }

}
