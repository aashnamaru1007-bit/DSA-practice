package Arrays;

import java.util.Scanner;

public class ceil_floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n is the number of elements in the array
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key=sc.nextInt();//element whose ceil and floor is to be found
        //implement binary search
        int l=0;
        int h=n-1;
        while(l<=h){
            int m=(l+h)/2;
        if(key>arr[m]){
            l=m+1;
        }
        else if(key<arr[m]){
            h=m-1;
        }
        else {
            System.out.println("the ceil and floor is: " + arr[m]);
            return;
        }
        }
       System.out.println("ceil: "+ arr[l]) ;
        System.out.println("floor: "+ arr[h]) ;
    }
}
