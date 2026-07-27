package Arrays;

import java.util.Scanner;

public class inverseofanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n is the number of elements in the array
        int[] arr = new int[n];
        int[] inv= new int[n];
        int temp;
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
           temp=arr[i];
           inv[temp]=i;
        }
        for(int inverse:inv){
            System.out.println(inverse);
        }

    }
}
