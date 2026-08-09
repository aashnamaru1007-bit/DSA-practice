package Arrays;

import java.util.*;

public class BuyandSellStock {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxprofit = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            int profit=prices[i]-min;
            if(profit>maxprofit){
                maxprofit=profit;
            }

        }

        return maxprofit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n is the number of elements in the array
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans=maxProfit(arr);
        System.out.println(ans);
    }
}
