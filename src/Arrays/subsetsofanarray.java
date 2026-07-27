package Arrays;

import java.util.Scanner;

public class subsetsofanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n is the number of elements in the array
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int rem;
        for (int i = 0; i < (int) Math.pow(2, n); i++) {
            int temp=i;
            for (int j = 0; j <n; j++) {
                rem = temp % 2;
                temp =temp / 2;
                if (rem == 1) {
                    System.out.print(arr[j]);
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
