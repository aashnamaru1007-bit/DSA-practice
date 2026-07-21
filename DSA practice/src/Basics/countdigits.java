package Basics;

import java.util.Scanner;

public class countdigits {

    public static void main (String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c = 0;

        do{

            n = n/ 10;
            c++;

        }
        while (n != 0);
        System.out.println(c);

}}

