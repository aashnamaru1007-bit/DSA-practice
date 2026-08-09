package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInsertElement {
    public static int searchInsert(int[] nums, int target) {
        int index=-1;
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(target>nums[m]){
                l=m+1;
            }
            else if(target<nums[m]){
               h=m-1;
            }
            else if (target==nums[m]){
                index= m;
                break;
            }
        }
        if (index==-1){
            index=l;
        }
        return index;
    }

    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int val = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();}

        int ans= searchInsert(arr,val);
        System.out.println(ans);
    }


}
