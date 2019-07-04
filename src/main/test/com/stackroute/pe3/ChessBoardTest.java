package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard obj;

    @Before
    public void setUp() throws Exception {
        obj=new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }


    //Test cases for different sizes of chess board

    @Test
    public void chess8X8()
    {
        obj.matrixInitialisation(8);
        String result=obj.setMatrices();
        assertEquals("BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n",result);
    }
    @Test
    public void chess6X6()
    {
        obj.matrixInitialisation(6);
        String result=obj.setMatrices();
        assertEquals("BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW \n" ,result);
    }
    @Test
    public void chess2X2()
    {
        obj.matrixInitialisation(2);
        String result=obj.setMatrices();
        assertEquals("BB WW \n" +
                "BB WW \n",result);
    }
    @Test
    public void chess4X4()
    {
        obj.matrixInitialisation(4);
        String result=obj.setMatrices();
        assertEquals("BB WW BB WW \n" +
                "BB WW BB WW \n" +
                "BB WW BB WW \n" +
                "BB WW BB WW \n",result);
    }
}