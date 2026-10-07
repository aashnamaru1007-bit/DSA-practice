package Arrays;
import java.util.*;

public class MaximumsumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int sum=nums[0];
        // start=0 tempstart=0 end=0
        for(int i=1;i<nums.length;i++){
            if(sum+nums[i]>nums[i]){
                sum=sum+nums[i];
            }
            else{
                sum=nums[i];
                //tempstart=i
            }
            if(sum>maxsum){
                maxsum=sum;
                //start=tempstart
                //end=i
            }
        }
        return maxsum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
       int ans=maxSubArray(arr);
        System.out.println(ans);
    }
}
