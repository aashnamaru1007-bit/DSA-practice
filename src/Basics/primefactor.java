package Basics;

import java.util.Scanner;

public class primefactor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 2; i * i <= n; i++) {
            int c = 0;
            for (int j = 2; j * j <= i; j++) {

                {
                    if (i % j == 0) {
                        c++;
                        break;
                    }
                }
            }
            if (c == 0) {
                while (n % i == 0) {
                    n = n / i;
                    System.out.println(i);
                }
            }
        }
        if (n > 1) {
            System.out.println(n);
        }
    }
}

