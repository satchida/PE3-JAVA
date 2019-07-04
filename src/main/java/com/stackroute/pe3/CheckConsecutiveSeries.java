package com.stackroute.pe3;

public class CheckConsecutiveSeries {

    //This method takes a string as input all numbers and return the String whether it is consecutive or not
        public static String checkSeries(String s)
        {
            //Numbers are splitted into a string type array
            String[] numbers=s.split(" ");


            for(int i=1;i<numbers.length;i++)
            {

                //Numbers are parsed to integer values and checked consecutiveness
                if(Integer.parseInt(numbers[i])-Integer.parseInt(numbers[i-1])!=1)
                {
                    return "is not consecutive";
                }

            }

            return  "is consecutive";
        }
    }

