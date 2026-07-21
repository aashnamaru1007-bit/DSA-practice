package Basics;

import java.util.Scanner;

public class pat12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k=0;
        int l=1;
        int m;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k+"\t");
                m=k+l;
                k=l;
                l=m;
            }
            System.out.println();
        }
    }
}
