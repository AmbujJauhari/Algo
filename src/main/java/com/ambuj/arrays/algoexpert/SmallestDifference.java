package com.ambuj.arrays.algoexpert;

import java.util.Arrays;

public class SmallestDifference {

    public static void main(String... args) {
        int[] A = {-1, 5, 10, 20, 28, 3};
        int[] B = {26, 134, 135, 15, 16};

        Arrays.sort(A);
        Arrays.sort(B);

        int numberFromArrayA = 0;
        int numberFromArrayB = 0;

        int smallestDifference = Integer.MAX_VALUE;

        int idxA = 0;
        int idxB = 0;
        while (idxA < A.length && idxB < B.length) {

            int diff = Math.abs(A[idxA] - B[idxB]);
            if( diff < smallestDifference) {
                smallestDifference = diff;
                numberFromArrayA = A[idxA];
                numberFromArrayB = B[idxB];
            }

            if (A[idxA] < B[idxB]) {
                idxA++;
            } else {
                idxB++;
            }
        }

        System.out.println(numberFromArrayA +","+ numberFromArrayB + "," + smallestDifference);
    }
}
