package Arrays;

import java.util.Scanner;

public class diffofarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();//n1 is the number of elements in the array1
        int n2 = sc.nextInt();//n2 is the number of elements in the array2
        /*number represented by arr2 is greater*/
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.println("enter elements of array 1");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter elements of array 2");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();}
        int c=0;
        int d=0;
        int []diff=new int[n2];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=diff.length-1;
        while(k>=0) {
            d = c;
            if (j >= 0) {
                d += arr2[j];
            }
            if (i >= 0) {
                d -= arr1[i];
            }
            if(d<0){
                d=d+10;
                c=-1;
            }
            else{
                c=0;}

            diff[k]=d;
            i--;
            j--;
            k--;
        }
        int idx=0;
        while(idx<diff.length){
            if(diff[idx]==0){
                idx++;
            }else{
                break;}
        }
        while(idx<diff.length){
            System.out.print(diff[idx]);
            idx++;
        }

    }
}
