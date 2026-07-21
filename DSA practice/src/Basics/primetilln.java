package Basics;
import java.util.Scanner;

public class primetilln { public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the the lower limit and upper limit");
    int l=s.nextInt();
    int u=s.nextInt();
    System.out.println("The prime numbers are:");
    for( int i=l;i<=u;i++) {
        int c=0;
    for ( int j=2;j*j<=i;j++){

        {if(i%j==0){
            c++;
            break;
            }
        }
    }
    if(c==0){
        System.out.println(i);
    }
}
}}
