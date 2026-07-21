package Basics;

import java.util.Scanner;

public class anybasetoanybase {
    public static int convertdectobase(int n,int b){
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
        int b2=s.nextInt();
        int c1=convertbasetodec(n,b1);
        int c2=convertdectobase(c1,b2);
        System.out.println(c2);
    }

}
