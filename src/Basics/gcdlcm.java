package Basics;

import java.util.Scanner;

public class gcdlcm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int x,k;
        if(n2>n1)
        {x=n2;
        k=n1;}
        else
        {x=n1;
        k=n2;}
        int y;
        do {
            y = x%k;
           x=k;
           k=y;

        } while (y != 0);
        int gcd=x;
        int lcm=(n1*n2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
