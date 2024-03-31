package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {5, 3, 9, 1, 7};

        BubbleSort.bubbleSort(inputArray);

        System.out.println("冒泡结果: " + Arrays.toString(inputArray));

        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 7;

        BackPack maxvalue = new BackPack();
        System.out.println("最大总价值: " + maxvalue.backpack(weights, values, capacity));
    }
}