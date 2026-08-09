package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            return;
        }
        if (n == 0) {
            return;
        }
        int j=m-1;
        int k=m+n-1;
        for (int i = n-1; i>=0; i--) {
            while(j>=0){
              if(nums2[i]<nums1[j]){
                  nums1[k]=nums1[j];
                  j--;
                  k--;
              }
              else break;
            }
            nums1[k]=nums2[i];
            k--;
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();//n1 is the number of elements in the array1
        int n2 = sc.nextInt();//n2 is the number of elements in the array2
        int[] nums1 = new int[n1+n2];
        int[] nums2 = new int[n2];
        System.out.println("enter elements of array 1");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("enter elements of array 2");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        merge(nums1,n1,nums2,n2);
        System.out.println(Arrays.toString(nums1));


    }
}
