package Basics;

import java.util.Scanner;

public class primeornot {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of entries");
        int t=s.nextInt();
        int n;
        /*for(int i=1;i<=t;i++)
        { System.out.println("enter number "+i+" to be checked");
             n=s.nextInt();
            int c=0;//count of factors
            for (int j=1;j<=n;j++)
            { if(n%j==0){
                c++;}}

            if(c==2)
            {System.out.println("prime");}
                else
                { System.out.println("not prime");}

}}}*/
        for(int i=1;i<=t;i++)
        { System.out.println("enter number "+i+" to be checked");
            n=s.nextInt();
            int c=0;//count of factors
            for (int j=2;j*j<=n;j++)
            { if(n%j==0){
                c++;
                break;
            }}

            if(c==0)
            {System.out.println("prime");}
            else
            { System.out.println("not prime");}

        }}}
