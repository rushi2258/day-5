package com.bridgelabz;

public class Harmonicnumber
{
    public static void main(String arg[])
    {
        double n=11,i;
        double sum=0;
        for( i=1;i<=n;i++)
        {
            sum=sum+(1/i);
        }
        System.out.println("Harmonic value = "+sum);
    }
}
