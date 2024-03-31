package org.example;

public class BackPack {
    public int backpack(int[] weights, int[] values, int capacity) {
        checkNegativeWeights(weights); // 检查重量是否为负数
        checkNegativeValues(values); // 检查价值是否为负重
        checkNegativeCapacity(capacity); // 检查背包容量是否为负重
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], values[i - 1] + dp[i - 1][w - weights[i - 1]]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }

    private void checkNegativeWeights(int[] weights) {
        for (int weight : weights) {
            if (weight < 0) {
                throw new IllegalArgumentException();
            }
        }
    }

    private void checkNegativeValues(int[] values) {
        for (int value : values) {
            if (value < 0) {
                throw new IllegalArgumentException();
            }
        }
    }

    private void checkNegativeCapacity(int cap) {
        if (cap < 0) {
            throw new IllegalArgumentException();
        }
    }
}
