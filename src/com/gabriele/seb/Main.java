package com.gabriele.seb;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        String FILE_NAME = "data/input.txt";

        FileReader r = new FileReader();
        try {
            r.readFile(FILE_NAME);
            LossCounter lossCounter = new LossCounter();
            int maximalLoss = lossCounter.countLoss(r.stockValues);
            System.out.println(maximalLoss);
        } catch (FileNotFoundException e) {
            System.out.println("Could not find data file");
        } catch (NoSuchElementException e) {
            System.out.println("Invalid data file");
        }
    }
}
