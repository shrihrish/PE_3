package com.stackroute.practice;

import java.util.Scanner;

public class MatrixAddition {
    int[][] Matrix(int n1, int n2, int a[][], int b[][])//2nd question
    {
        int[][] sum = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
}
