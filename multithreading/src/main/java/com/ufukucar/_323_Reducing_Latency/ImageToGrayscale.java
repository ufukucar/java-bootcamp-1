package com.ufukucar._323_Reducing_Latency;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;

public class ImageToGrayscale {

    public static void main(String[] args) throws Exception {
        File inputFile = new File("src/main/java/com/ufukucar/_323_Reducing_Latency/beach.png"); // Input file
        File outputFile = new File("src/main/java/com/ufukucar/_323_Reducing_Latency/beach_grayscale.png"); // Output file

        try {
            BufferedImage image = ImageIO.read(inputFile);
            long startTime = System.currentTimeMillis();
            convertToGrayscaleConcurrently (image, 2);
            long endTime = System.currentTimeMillis();

            long timeTaken = endTime - startTime;
            System.out.println("Time taken: " + timeTaken + " milliseconds");

            ImageIO.write(image, "png", outputFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    private static void convertToGrayscaleConcurrently(BufferedImage image, int numberOfThreads) throws InterruptedException {


        int heightPerThread = image.getHeight() / numberOfThreads;
        GrayScaleConverterThread[] threads = new GrayScaleConverterThread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {

            int startY = i * heightPerThread;
            int endY = startY + heightPerThread;

            threads[i] = new GrayScaleConverterThread(image, startY, endY);

        }

        for (GrayScaleConverterThread grayScaleConverterThread : threads) {
            grayScaleConverterThread.join();
        }


    }



}