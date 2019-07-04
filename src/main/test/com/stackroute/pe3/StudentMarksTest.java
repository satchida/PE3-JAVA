package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {


//The class is instantiated through object
    StudentMarks obj;

    @Before
    public void setUp() throws Exception {
        obj=new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    //Test cases when we gets possible marks in the region
    @Test
    public void test1(){
        StudentMarks sm=new StudentMarks();
        assertEquals(true,sm.checkInvalidity(0));
    }

    @Test
    public void test2(){
        StudentMarks sm=new StudentMarks();
        assertEquals(true,sm.checkInvalidity(100));
    }
    @Test
    public void test3(){
        StudentMarks sm=new StudentMarks();
        assertEquals(true,sm.checkInvalidity(66));
    }

    //Test case when the mark is negative
    @Test
    public void test4(){
        StudentMarks sm=new StudentMarks();
        assertEquals(false,sm.checkInvalidity(-66));
    }

    //Test case when the mark is more than 100
    @Test
    public void test5(){
        StudentMarks sm=new StudentMarks();
        assertEquals(false,sm.checkInvalidity(109));
    }
}