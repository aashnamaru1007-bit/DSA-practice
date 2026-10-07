package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOf2Arrays {
        public static int[] intersectionArray(int[] nums1, int[] nums2) {
            int[] ans=new int[Math.min(nums1.length,nums2.length)];
            int i=nums1.length-1;
            int j=nums2.length-1;
            int k=ans.length-1;


            while(i>=0&&j>=0){
                if(nums1[i]>nums2[j])
                {  i--; }
                else if(nums2[j]>nums1[i]){
                    j--;
                }
                else if (nums2[j]==nums1[i]){
                    ans[k]=nums2[j];

                    k--;
                    i--;
                    j--;}
            }
            int[]anstrimmed=Arrays.copyOfRange(ans,k+1,ans.length);
            return (anstrimmed);
        }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();//n1 is the number of elements in the array1
        int n2 = sc.nextInt();//n2 is the number of elements in the array2
        int[] nums1 = new int[n1];
        int[] nums2 = new int[n2];
        System.out.println("enter elements of array 1");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("enter elements of array 2");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        int[]ans=intersectionArray(nums1,nums2);
        System.out.println(Arrays.toString(ans));}
}

