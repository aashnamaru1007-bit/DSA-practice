package Arrays;

import java.util.*;

public class plusOne {
    public static int[] plusOne(int[] digits) {
            for(int i=digits.length-1;i>=0;i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                } else {
                    digits[i] = 0;
                }
            }
                int [] ans=new int[digits.length+1];
                ans[0]=1;
                return ans;
            }

    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();}
        int [] ans=plusOne(arr);
        System.out.println(Arrays.toString(ans));

    }
}
