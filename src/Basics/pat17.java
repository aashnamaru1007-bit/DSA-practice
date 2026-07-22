package Basics;

import java.util.Scanner;

public class pat17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = 1;
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= n / 2; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            st++;
            System.out.println();
        }
        for (int j = 1; j <= n; j++) {
            System.out.print("*\t");
        }
        System.out.println();
        st=n/2;
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= n / 2; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            st--;
            System.out.println();
        }
    }
}
