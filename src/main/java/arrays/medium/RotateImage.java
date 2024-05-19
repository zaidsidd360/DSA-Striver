package main.java.arrays.medium;

import main.java.arrays.Utils;

public class RotateImage {
    // Brute force approach
    public static void rotateImage1(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        int ansCol = matrix[0].length - 1;
        for(int[] row: matrix) {
            int ansRow = 0;
            for(int val: row) {
                ans[ansRow++][ansCol] = val;
            }
            ansCol--;
        }
        Utils.copyMatrix(ans, matrix);
    }
    
    // Optimal approach
    public static void rotateImage2(int[][] matrix) {
        // Transpose matrix
        transposeMatrix(matrix);
        // Reverse matrix
        reverseRows(matrix);
    }
    
    public static void transposeMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[0].length; j++) {
                // swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    
    public static void reverseRows(int[][] matrix) {
        for(int[] row: matrix) {
            Utils.reverseArray(row, 0, row.length - 1);
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        
        System.out.println("Before rotating matrix:");
        Utils.printMatrix(matrix);
        rotateImage2(matrix);
        System.out.println("After rotating matrix:");
        Utils.printMatrix(matrix);
    }
}
