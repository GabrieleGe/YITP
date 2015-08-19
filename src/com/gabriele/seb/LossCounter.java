package com.gabriele.seb;

public class LossCounter {
    public int countLoss(int[] stockValues) {
        int length = stockValues.length;
        int maximalLoss = 0;
        int highestValue = stockValues[0];

        for (int i = 1; i < length; i++) {
            if (highestValue < stockValues[i]) {
                highestValue = stockValues[i];
            } else if ((stockValues[i] - highestValue) < maximalLoss) {
                maximalLoss = stockValues[i] - highestValue;
            }
        }
        return maximalLoss;
    }
}
