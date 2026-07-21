package Basics;

import java.util.Scanner;

public class anybasetodecimal {
    public static int convertbasetodec(int n,int b){
        int cn=0;
        int m;
        int p=0;
        while(n!=0){
            int rem =n%10;
            m=(int)Math.pow(b,p);
            cn=cn+(rem*m);
            p++;
            n=n/10;
        }

        return cn;}


    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int b1=s.nextInt();
        int cn=convertbasetodec(n,b1);
        System.out.println(cn);
    }
}
