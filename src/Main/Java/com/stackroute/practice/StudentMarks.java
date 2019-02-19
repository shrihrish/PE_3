package com.stackroute.practice;

public class StudentMarks {
    boolean StudentMarks(int numOfStudents, int stuGrades[]) //1st question
    {
        boolean flag = true;
        for (int i = 0; i < numOfStudents; i++) {
            int g = stuGrades[i];
            if (g > 100 || g < 0) {
                flag = false;
            }
        }
        return flag;
    }
}
