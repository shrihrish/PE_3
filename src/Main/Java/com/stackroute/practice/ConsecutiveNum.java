package com.stackroute.practice;

public class ConsecutiveNum {
    boolean consecutive(int a[], int n) {
        int k = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] != k) {
                return false;
            }
            k++;
        }
        return true;
    }
}