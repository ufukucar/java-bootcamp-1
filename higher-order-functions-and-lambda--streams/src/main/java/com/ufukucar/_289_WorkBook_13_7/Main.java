package com.ufukucar._289_WorkBook_13_7;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/java/com/ufukucar/_289_WorkBook_13_7/email.txt");

        Files.lines(path).filter(email -> !email.startsWith("Spam")).forEach(System.out::println);


    }

}
