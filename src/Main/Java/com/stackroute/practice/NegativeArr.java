package com.stackroute.practice;

public class NegativeArr {

    String checkExcepetion(int a[], int s1)
    {
        for (int i = 0; i < s1; i++) {
            if (a[i] < 0) {
                return "NegativeArraySizeException";
            }
        }
        return "noexception";
    }
}
