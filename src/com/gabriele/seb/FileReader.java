package com.gabriele.seb;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileReader {
    private Scanner scanner;
    public int[] stockValues;

    public void readFile(String FILE_NAME) throws FileNotFoundException, NoSuchElementException {
        scanner = new Scanner(new File(FILE_NAME));
        int numberOfStockValues = scanner.nextInt();
        stockValues = new int[numberOfStockValues];
        for (int i = 0; i < numberOfStockValues; i++) {
            stockValues[i] = scanner.nextInt();
        }
        scanner.close();
    }

}