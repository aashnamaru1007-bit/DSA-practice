package Arrays;

import java.util.*;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
    int k=1;
    for(int i=1;i<nums.length;i++){
        if (nums[i] != nums[i-1]) {
            nums[k]=nums[i];
            k++;
        }
    }
    return k;
    }
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();}
       int ans= removeDuplicates(arr);
        System.out.println(ans+"\n"+Arrays.toString(arr));
        }
    }

