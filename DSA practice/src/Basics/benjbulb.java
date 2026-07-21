package Basics;
import java.util.*;

public class benjbulb {
    public static void main(String []args){
        Scanner s= new Scanner(System.in);
       int n=s.nextInt();

       for(int i=1;i<=n;i++){
           int k=0;
           for(int j=1;j<=n;j++){
               if(i%j==0){
                   if(k==1){
                       k=0;
                   }
                   else{
                       k=1;
                   }
               }
           }
           if(k==1){
               System.out.println(i);
           }
       }
    }
}
