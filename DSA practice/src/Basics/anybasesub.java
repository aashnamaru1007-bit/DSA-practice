package Basics;

import java.util.Scanner;

public class anybasesub {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int d = getdiff(b, n1, n2);
        System.out.println(d);
    }

    public static int getdiff(int b, int n1, int n2) { // write ur code here
        int rv = 0;
        int p = 1;
        int c=0;
        int d;
        while ( n1 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            d1=d1+c;
            n1 = n1 / 10;
            n2 = n2 / 10;
            if(d1>=d2){
                c=0;
                d=d1-d2;
            }
            else{
                c=-1;
                d=d1+b-d2;
            }
            rv += d *p;
            p = p * 10;
        }
        return rv;
    }
}


