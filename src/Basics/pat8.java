package Basics;

import java.util.Scanner;

public class pat8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sp=n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = sp; j >0; j--) {
                System.out.print("\t");
            }
            System.out.print("* ");
            sp--;
            System.out.println();
        }
    }
}
