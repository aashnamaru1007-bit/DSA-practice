package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public  class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
    }
        return k;
    }

    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int val = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();}

        int ans= removeElement(arr,val);
        System.out.println(ans+"\n"+ Arrays.toString(arr));
    }

}
