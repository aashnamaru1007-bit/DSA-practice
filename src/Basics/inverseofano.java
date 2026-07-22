package Basics;

import java.util.Scanner;

public class inverseofano {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int inv=0;
        int y;
        int c = 0;
        int x=n;
        do {
            x = x / 10;
            c++;
        }
        while (x != 0);
        for(int i=1;i<=c;i++){
            y = n % 10;
            inv=inv+(i*((int)Math.pow(10,y-1)));
            n = n / 10;

        }

    System.out.println(inv);
    }
}
