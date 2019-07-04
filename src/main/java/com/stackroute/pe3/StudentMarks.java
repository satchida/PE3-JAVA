package com.stackroute.pe3;

import java.util.Scanner;

public class StudentMarks {

    //The class variable is initialized
    int NumberOfStudents;
    Scanner scanner=new Scanner(System.in);

    //
    public void setNumberOfStudents(int n)
    {
        this.NumberOfStudents=n;
    }

    private  int[] stuGrades=new int[NumberOfStudents];

    public void setGrades()
    {
        int check=0;
        for(int i=0;i<=NumberOfStudents;i++)
        {
            System.out.println("Grade of "+i+"Student?");
            check=scanner.nextInt();
            while(checkInvalidity(check))
            {
                System.out.println("Invalid input");
                check=scanner.nextInt();
            }
            stuGrades[i]=check;
        }
    }

    //Checking the validity
    boolean checkInvalidity(int n)
    {
        if(n>=0 && n<=100)
            return true;

        else
            return false;
    }

}