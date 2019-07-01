package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDayOfWeekTest {

    FirstAndLastDayOfWeek obj;

    @Before
    public void setUp() throws Exception {
        obj = new FirstAndLastDayOfWeek();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    @Test
    public void FirstAndLastDayOfTheWeek()
    {
        obj.setCal(2019,6,4);
        String result1=obj.getFirstDay();
        String result2=obj.getLastDay();
        assertEquals("Monday 1 6 2019",result1);
        assertEquals("Sunday 7 6 2019",result2);
    }
    @Test
    public void FirstAndLastDayOfTheWeek1()
    {
        obj.setCal(2019,5,29);
        String result1=obj.getFirstDay();
        String result2=obj.getLastDay();
        assertEquals("Monday 24 5 2019",result1);
        assertEquals("Sunday 30 5 2019",result2);
    }
    @Test
    public void FirstAndLastDayOfTheWeek2()
    {
        obj.setCal(2019,10,19);
        String result1=obj.getFirstDay();
        String result2=obj.getLastDay();
        assertEquals("Monday 18 10 2019",result1);
        assertEquals("Sunday 24 10 2019",result2);
    }
}