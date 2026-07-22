package Basics;
import java.util.Scanner;

public class reversedigits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int y;
        do {
            y=n%10;
            n = n / 10;

          System.out.println(y);
        }
        while (n != 0);


    }
}



