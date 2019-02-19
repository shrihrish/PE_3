package com.stackroute.practice;

public class ExcepClass {

    String Exception(int b) //6th question
    {
        int a = 4;
        try {
            a = a / b;
        } catch (Exception ex) {
            return "ExceptionCaught";
        }
        return "ExceptionNotcaught";
    }
}