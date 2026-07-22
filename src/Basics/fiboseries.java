package Basics;
import java.util.*;

public class fiboseries {
    public static void main(String[] args){
    int a=0;
    int b=1;
    int c;
    Scanner s=new Scanner (System.in);
    int n=s.nextInt();
    System.out.println(a);
    System.out.println(b);
    for(int i=0;i<n;i++){
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
    }

}
}
