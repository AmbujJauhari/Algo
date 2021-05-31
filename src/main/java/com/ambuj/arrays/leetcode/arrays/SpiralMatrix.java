package com.ambuj.arrays.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiral(int[][] matrix) {
        List<Integer> integers = new ArrayList<Integer>();
        int topRowIdx = 0;
        int rightColumnIdx = matrix[0].length;
        int bottomRowIdx = matrix.length;
        int leftColumnIdx = 0;
        int i = 0;

        //loop all the elements of boundry
        while (topRowIdx < bottomRowIdx && leftColumnIdx < rightColumnIdx) {
            //print first row
            for (i = leftColumnIdx; i < rightColumnIdx; i++) {
                System.out.println(matrix[topRowIdx][i]);
            }
            //increment first row
            topRowIdx++;

            //print right column
            for (i = topRowIdx; i < bottomRowIdx; i++) {
                System.out.println(matrix[i][rightColumnIdx - 1]);
            }
            rightColumnIdx--;

            //print bottom row
            if (topRowIdx < bottomRowIdx) {
                for (i = rightColumnIdx - 1; i >= leftColumnIdx; i--) {
                    System.out.println(matrix[bottomRowIdx - 1][i]);
                }
                bottomRowIdx--;
            }

            //print left row
            if (leftColumnIdx < rightColumnIdx) {
                for (i = bottomRowIdx - 1; i >= topRowIdx; i--) {
                    System.out.println(matrix[i][leftColumnIdx]);
                }
                leftColumnIdx++;
            }
        }
        return integers;
    }

    public static boolean areAllEqual(int checkValue, int... otherValues) {
        for (int value : otherValues) {
            if (value != checkValue) {
                return false;
            }
        }
        return true;
    }

    public static void main(String... args) {
        int[][] array = new int[][]{
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}
        };
        System.out.println(new SpiralMatrix().spiral(array));
    }

}
