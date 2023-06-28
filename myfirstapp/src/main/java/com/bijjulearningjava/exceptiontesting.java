package com.bijjulearningjava;

public class exceptiontesting {
    public static void main(String[] args) 
    {
        int x = 1;
        int y = x-1;
        int j = 5;
        int z;
        try {
        System.out.println("About to start the calculation");
        z = j/y;
        System.out.println("Calculation part completed");
        System.out.println("The value of z =" +z);
        System.out.println("this is addition of git");
        //another line added as comment
        //second comment to the java code
        //no friends
        } 
        catch (ArithmeticException b)
        {
            System.out.println("Dividing by zero");
            System.out.println(b);
            String a = new String();
            b.printStackTrace();
           // a=b.getClass();
            System.out.println("Exception ends");
        }
    }
    
}