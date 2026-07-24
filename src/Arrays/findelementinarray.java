package Arrays;

import java.util.Scanner;

public class findelementinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n is the number of elements in the array
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element to be found");
        int x=sc.nextInt();
        int flag=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==x){
                System.out.println("element index:"+ i);
                flag=1;
                break;
            }

        }
        if(flag==0){
            System.out.println("-1");
        }



    }
}
