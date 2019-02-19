package com.stackroute.practice;

public class RemoveVowels {
    public String[] vowelRemove(String str[], int n) {
        for (int i = 0; i < n; i++) {
            str[i] = str[i].replaceAll("[AaEeIiOoUu]", "");
        }
        return str;
    }
}
