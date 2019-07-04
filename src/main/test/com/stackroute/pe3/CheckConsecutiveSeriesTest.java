package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckConsecutiveSeriesTest {

    //Object of the class is instantiated
    CheckConsecutiveSeries obj;
    @Before
    public void setUp() throws Exception {
        obj = new CheckConsecutiveSeries();
    }
    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    //Test cases for the series which is a consecutive series
    @Test
    public void ReturnIsConsecutive()
    {
        String result=obj.checkSeries("1 2 3 4 5 6 7");
        assertEquals("is consecutive",result);
    }

    @Test
    public void ReturnIsConsecutive1()
    {
        String result=obj.checkSeries("10 11 12 13 14 15 16 17");
        assertEquals("is consecutive",result);
    }

    //test cases where the series is not consecutive
    @Test
    public void ReturnNotConsecutive()
    {
        String result=obj.checkSeries("0 0 0 0 0 0 0");
        assertEquals("is not consecutive",result);
    }
    @Test
    public void ReturnNotConsecutive1()
    {
        String result=obj.checkSeries("1 2 3 4 5 6 6");
        assertEquals("is not consecutive",result);
    }


}