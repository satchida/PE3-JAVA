package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    RemoveVowels obj;

    @Before
    public void setUp() throws Exception {
        obj=new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    //Test cases when strings contains few vowels
    @Test
    public void VowelsRemoved()
    {
        String result=obj.places("India pakistan");
        assertEquals("nd pkstn",result);
    }
    @Test
    public void VowelsRemoved2()
    {

        String result=obj.places("India pakistan canada");
        assertEquals("nd pkstn cnd",result);
    }

    //Test case when the string contains only vowel
    @Test
    public void VowelsRemoved3()
    {

        String result=obj.places("aeiou Aeiou");
        assertEquals("",result);
    }
    @Test
    public void VowelsRemoved4()
    {

        String result=obj.places("stackroute");
        assertEquals("stckrt",result);
    }
}