package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class movezeroestoend {
    public static void moveZeroes(int[] nums) {
        int j=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[j]=nums[i];
            j++;
        }

    }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
    }
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();}

        moveZeroes(arr);
        System.out.println( Arrays.toString(arr));
    }

}


