package com.web.java;

public class ReverseNumber_48 {

	
    public static void main(String args[])
    {
        int n=6398;
        int rev=0;
        while(n!=0)
        {
           int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
            
        }
        System. out. println("The reversed number is ="+rev); 
        
    }
}

