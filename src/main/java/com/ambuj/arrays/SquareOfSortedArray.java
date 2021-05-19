package com.ambuj.arrays;

import java.util.Arrays;

public class SquareOfSortedArray {

    public int[] sortedSquaredArray(int[] nums) {
        int[] squaredNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            squaredNums[i] = nums[i] * nums[i];
        }

        int idxIncreasing = 0;
        int prevNumber = squaredNums[idxIncreasing];
        for (; idxIncreasing < squaredNums.length; idxIncreasing++) {
            if (squaredNums[idxIncreasing] > prevNumber) {
                break;
            } else {
                prevNumber = squaredNums[idxIncreasing];
            }
        }

        int idxDecreasing = idxIncreasing - 1;
        int[] sortedSquaredNums = new int[squaredNums.length];
        int idxSortedSquaredNums = 0;
        while (idxDecreasing >= 0 && idxIncreasing < nums.length) {
            if (squaredNums[idxDecreasing] < squaredNums[idxIncreasing]) {
                sortedSquaredNums[idxSortedSquaredNums] = squaredNums[idxDecreasing];
                idxSortedSquaredNums++;
                idxDecreasing--;
            } else {
                sortedSquaredNums[idxSortedSquaredNums] = squaredNums[idxIncreasing];
                idxSortedSquaredNums++;
                idxIncreasing++;
            }
        }

        //add remaining elements
        while (idxDecreasing >= 0) {
            sortedSquaredNums[idxSortedSquaredNums] = squaredNums[idxDecreasing];
            idxDecreasing--;
            idxSortedSquaredNums++;
        }

        while (idxIncreasing < sortedSquaredNums.length) {
            sortedSquaredNums[idxSortedSquaredNums] = squaredNums[idxIncreasing];
            idxIncreasing++;
            idxSortedSquaredNums++;
        }
        return sortedSquaredNums;
    }

    public static void main(String... args) {
        int[] nums = {-4, -1, 3, 10, 29, 87};
        SquareOfSortedArray squareOfSortedArray = new SquareOfSortedArray();
        System.out.println(Arrays.toString(squareOfSortedArray.sortedSquaredArray(nums)));

    }
}
