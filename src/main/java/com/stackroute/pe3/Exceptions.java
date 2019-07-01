package com.stackroute.pe3;

public class Exceptions {
        public static void main(String[] args) {
            try {

                int number1=19;
                int number2=0;
                int result=number1/number2;
                System.out.println(result);
                System.out.println("Yes! It is inside the try Block");
            }
            catch(Exception e)
            {
                System.out.println("Yes! It is inside the catch block");
            }
            finally {
                System.out.println("Yes! It is inside the finally block");
            }
        }
    }
