package Arrays;

import java.util.Scanner;

public class rotateanarray {
    public static void reverse(int[]arr,int i, int j){
            while(i<j) {
           int  temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n is the number of elements in the array
        int[] arr = new int[n];
        //int temp;
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();// k is the number of places to be rotated
        k = k % n;
        if (k<0){
            k=k+arr.length;
        }
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
        /*
        for(int i=0;i<Math.abs(k);i++) {
            if (k >= 0) {
                temp = arr[n - 1];
                for (int j = n - 2; j >= 0; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[0] = temp;
            }else{
                temp=arr[0];
                for (int j = 1; j <= n-1; j++) {
                    arr[j-1] = arr[j];
                }
                arr[n-1]=temp;
            }
        }*/
        for(int rot:arr){
            System.out.println(rot);
        }
    }
}

