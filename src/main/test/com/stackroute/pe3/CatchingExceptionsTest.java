package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatchingExceptionsTest {

    //CObject of the class is instantiated
    CatchingExceptions obj;

    @Before
    public void setUp() throws Exception {
        obj=new CatchingExceptions();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    //Test cases for negative array size Exception
    @Test
    public void negativeSizeArray(){
        String result=obj.negativeArraySizeException(-12);
        assertEquals("NegativeArraySizeException",result);
    }

    //Test cases for array index out of bound Exception
    @Test
    public void arrayIndexOutOfBoundException(){
        String result=obj.arrayIndexOutOfBoundException(534);
        assertEquals("ArrayIndexOutOfBoundException",result);
    }


    //Test cases for null pointer Exception
    @Test
    public void nullPointerException(){
        String result=obj.nullPointerException(null);
        assertEquals("NullPointerException",result);
    }

}