package main.java.arrays.medium;

import java.util.ArrayList;
import java.util.List;
import main.java.arrays.Utils;

public class SetMatrixZero {
    
    // Brute force approach
    public static void setMatrixZero1(int[][] matrix) {
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    list.add(new int[] {i, j});
                }
            }
        }
        for(int[] coord : list) {
            int row = coord[0];
            int col = coord[1];
            int rs = 0, cs = 0;
            while(rs < matrix.length) {
                matrix[rs++][col] = 0;
            }
            while(cs < matrix[0].length) {
                matrix[row][cs++] = 0;
            }
        }
    }
    
    // Better approach
    public static void setMatrixZero2(int[][] matrix) {
        int[] colArr = new int[matrix[0].length];
        int[] rowArr = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    rowArr[i] = 1;
                    colArr[j] = 1;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(rowArr[i] == 1 || colArr[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    
    // Optimal approach
    public static void setMatrixZero3(int[][] matrix) {
        int col0 = 1;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if(j != 0)
                        matrix[0][j] = 0;
                    else
                        col0 = 0;
                }
            }
        }
        for(int i = matrix.length - 1; i >= 0; i--) {
            for(int j = matrix[0].length - 1; j > 0; j--) {
                if(matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == 0 || col0 == 0) {
                matrix[i][0] = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        System.out.println("Before setting matrix zeros:");
        Utils.printMatrix(matrix);
        setMatrixZero3(matrix);
        System.out.println("After setting matrix zeros:");
        Utils.printMatrix(matrix);
    }
}
