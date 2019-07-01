package com.stackroute.pe3;

public class CatchingExceptions {
        public static void main(String[] args) {
            try
            {
                int[] arr=new int[-10];
            }
            catch (NegativeArraySizeException e)
            {
                e.printStackTrace();
            }
            try
            {
                int[] arr=new int[2];
                arr[45]=7;
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                e.printStackTrace();
            }
            try
            {
                String s=null;
                s.indexOf('l');
            }
            catch (NullPointerException e)
            {
                e.printStackTrace();
            }
        }
    }

