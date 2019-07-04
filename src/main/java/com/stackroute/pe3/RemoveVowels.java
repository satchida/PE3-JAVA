package com.stackroute.pe3;

public class RemoveVowels {

    //Class variables are declared
    String[] places;
    String result="";//Output string after the removal of the vowels

    public String places(String input)
    {

        //Removes all lower case vowels
        input=input.replaceAll("a|e|i|o|u","");

        //Removes all lower case vowels
        input=input.replaceAll("A|E|I|O|U","");

        //After the deletion places in an arrayand then returns
        places=input.split(" ");
        for(String s:places)
        {
            result=result.concat(s).concat(" ");
        }
        return result.trim();


    }
}
