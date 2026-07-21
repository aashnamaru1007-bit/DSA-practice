package Basics;

import java.util.Scanner;

public class decimaltoanybase {
    public static int convertbase(int n,int b){
        int cn=0;
        int m;
        int p=0;
        while(n!=0){
            int rem =n%b;
            m=(int)Math.pow(10,p);
            cn=cn+(rem*m);
            p++;
            n=n/b;
        }

        return cn;}

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int b=s.nextInt();
        int cn=convertbase(n,b);
        System.out.println(cn);
    }
}
