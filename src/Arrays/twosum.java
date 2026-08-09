package Arrays;

import java.util.*;

public class twosum {
    public int[] two_sum(int[] arr,int target){

     int[] result=new int[2];
     /* BRUTE FORCE
      for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
              if(arr[i]+arr[j]==target){
                  result[0]=i;
                  result[1]=j;
              }
          }
      }
      return result;*/
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if((arr[i]+arr[j])<target){
                i++;
            }
           else if((arr[i]+arr[j])>target){
                j--;
            }
           else if((arr[i]+arr[j])==target){
               result[0]=arr[i];
               result[1]=arr[j];
               break;
            }
        }
       return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n is the number of elements in the array
        int[] arr = new int[n];
        int target=sc.nextInt();
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        twosum obj=new twosum();
    int [] result=obj.two_sum(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
