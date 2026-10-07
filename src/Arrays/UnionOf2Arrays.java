package Arrays;
import java.util.*;
public class UnionOf2Arrays {
        public static int[] unionArray(int[] nums1, int[] nums2) {
            int[] ans=new int[(nums1.length+nums2.length)];
            int i=nums1.length-1;
            int j=nums2.length-1;
            int k=ans.length-1;
            int element=-100000;
            while(i>=0 && j>=0){
                if(nums1[i]>=nums2[j])
                { if(nums1[i]!=element){
                    ans[k]=nums1[i];
                    element=nums1[i];
                    k--;
                }i--;}
                else if(nums2[j]>nums1[i]){
                    if(nums2[j]!=element){
                        ans[k]=nums2[j];
                        element=nums2[j];

                        k--;
                    }j--;}}

            while(i>=0){
                if(nums1[i]!=element){
                    ans[k]=nums1[i];
                    element=nums1[i];

                    k--;}i--;

            }
            while(j>=0){
                if(nums2[j]!=element){
                    ans[k]=nums2[j];
                    element=nums2[j];

                    k--;
                }  j--;
            }
            int n=ans.length;
            int[]anstrimmed=Arrays.copyOfRange(ans,k+1,n);
            return anstrimmed;
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
        int[]ans=unionArray(nums1,nums2);
        System.out.println(Arrays.toString(ans));

    }
}
