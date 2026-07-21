package Basics;

import java.util.Scanner;

public class pat7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sp=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <sp; j++) {
                System.out.print("\t");
            }
            System.out.print("* ");
            sp++;
            System.out.println();
        }
    }
}
