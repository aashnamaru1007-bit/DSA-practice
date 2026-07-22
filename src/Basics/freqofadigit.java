package Basics;
import java.util.*;

public class freqofadigit {
    public static int freq(int n, int d) {
        int c = 0;
        int rem;
        do{
            rem=n%10;
            n = n/ 10;
            if (rem==d){
            c++;}

        }
        while (n != 0);
    return c;}

        public static void main (String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int d=s.nextInt();
        int count=freq(n,d);
        System.out.println(count);
        }
    }

