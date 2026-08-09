package Arrays;

import java.util.Scanner;

public class checkifsorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
        }
        int i=0;
        while(i<4){
            if(n[i]<=n[i+1]){
                i++;
            }
            else {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");


    }
}
