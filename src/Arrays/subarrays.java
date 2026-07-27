package Arrays;

import java.util.Scanner;

public class subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n is the number of elements in the array
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            for(int j=i+1;j<=n-1;j++){
                System.out.print(arr[i]);
                for(int k = i+1; k <=j;k++){
                System.out.print(","+arr[k]);
            }System.out.println();
            }
        }
    }}
