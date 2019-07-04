package com.stackroute.pe3;

public class CatchingExceptions {

    //This method takes integer type size and returns the type of exception in string
        public String negativeArraySizeException(int size) {

            String result = "";//The output string is initialized
            try {
                int[] arr = new int[size];//Putting the negative size to the array
            } catch (NegativeArraySizeException e) {
                result = "NegativeArraySizeException";
            }
            return result;

        }


    //This method takes integer type index and returns the type of exception in string
            public String arrayIndexOutOfBoundException ( int index){

                String result = "";//The output string is initialized

            try {
                int[] arr = new int[2];
                arr[45] = 7;
            } catch (ArrayIndexOutOfBoundsException e) {
                result="ArrayIndexOutOfBoundException";
            }

            return result;
        }

    //This method takes  null type strin and returns the type of exception in string

        public String nullPointerException(String s) {

            String result="";
            try {

                s.indexOf('l');
            } catch (NullPointerException e) {
                result="NullPointerException";
            }

            return result;
        }

    }

