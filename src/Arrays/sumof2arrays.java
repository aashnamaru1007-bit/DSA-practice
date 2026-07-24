package Arrays;

import java.util.Scanner;

public class sumof2arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();//n1 is the number of elements in the array1
        int n2 = sc.nextInt();//n2 is the number of elements in the array2
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
        int []sum=new int[n1>n2?n1:n2];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sum.length-1;
        while(k>=0) {
            d = c;

            if (i >= 0) {
                d += arr1[i];
            }
            if (j >= 0) {
                d += arr2[j];
            }
            c=d/10;
            d=d%10;
            sum[k]=d;
            i--;
            j--;
            k--;
        }
        if(c>0){
            System.out.print(c);
        }
        for(int val:sum){
            System.out.print(val);
        }

        }
    }

