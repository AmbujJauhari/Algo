package com.ambuj.arrays.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> integers = new ArrayList<Integer>();
        int topRowIdx = 0;
        int rightRowIdx = matrix[0].length;
        int bottomRowIdx = matrix.length;
        int leftRowIdx = 0;
        int i = topRowIdx;
        int j = topRowIdx;

        while (i < bottomRowIdx && j < rightRowIdx) {
            if(topRowIdx == bottomRowIdx-1 && leftRowIdx == rightRowIdx-1) {
                integers.add(matrix[topRowIdx][leftRowIdx]);
                break;
            }
            //top row
            if (i == topRowIdx) {
                if (j < rightRowIdx) {
                    integers.add(matrix[i][j]);
                    j++;
                }
                if (j == rightRowIdx - 1) {
                    integers.add(matrix[i][j]);
                    i++;
                }
            }
            //right row
            if (j == rightRowIdx - 1) {
                if (i < bottomRowIdx) {
                    integers.add(matrix[i][j]);
                    i++;
                }
                if (i == bottomRowIdx - 1) {
                    integers.add(matrix[i][j]);
                    j--;
                }
            }
//                //bottom row
            if (i == bottomRowIdx - 1 && topRowIdx != bottomRowIdx-1) {
                if (j > leftRowIdx) {
                    integers.add(matrix[i][j]);
                    j--;
                }
                if (j == leftRowIdx) {
                    integers.add(matrix[i][j]);
                    i--;
                }
            }
//                //left row
            if (j == leftRowIdx && leftRowIdx != rightRowIdx-1) {
                if (i > topRowIdx) {
                    integers.add(matrix[i][j]);
                    i--;
                }
            }

            if (i == topRowIdx && j == topRowIdx) {
                topRowIdx++;
                rightRowIdx--;
                bottomRowIdx--;
                leftRowIdx++;
                i = topRowIdx;
                j = topRowIdx;
            }
        }


        return integers;
    }

    public static void main(String... args) {
        int[][] array = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(new SpiralMatrix().spiralOrder(array));
    }

}
