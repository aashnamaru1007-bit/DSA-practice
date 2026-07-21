package Basics;

import java.util.Scanner;

public class rotateno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int c = 0;
        int x = n;
        int y;
        int rot=0;
        do {
            x = x / 10;
            c++;
        } while (x != 0);
        for (int i = 0; i < Math.abs(k); i++) {
            int j = (int) Math.pow(10, c - 1);
            if (k > 0) {
                y = n % 10;
                rot = (n / 10) + (y * j);
            } else {
                int first = n / j;
                rot = (n % j) * 10 + first;
            }

            n=rot;

        }
        System.out.println(rot);
    }


}
