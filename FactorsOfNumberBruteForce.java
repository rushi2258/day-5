package com.bridgelabz;

public class FactorsOfNumberBruteForce
{
    public static void main (String[] args) {

        int n = 24;

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                System.out.println(i);
        }
    }
}
