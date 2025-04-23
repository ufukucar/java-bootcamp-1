package com.ufukucar._288_;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Creating Stream from Datasource: Array
        String[] greetings = new String[]{"Hello!", "Hola!", "Bonjour!", "Hallo!"};

        Arrays.stream(greetings).forEach(System.out::println);

        System.out.println("\n");
        // Creating Stream from Datasource: File
        try {
            Path path = Paths.get("src/main/java/com/ufukucar/_288_/chorus.txt");
            Files.lines(path).forEach(line -> System.out.println(line));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}