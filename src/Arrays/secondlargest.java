package Arrays;
import java.util.*;

public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
        }
        int slargest = -1;
        int largest = n[0];
        for(int i=1;i<5;i++){
           if(n[i]>largest){
               slargest=largest;
               largest=n[i];
           }
           else if(n[i]< largest && n[i]>slargest){
               slargest=n[i];
           }
        }
        System.out.println(largest+"\n"+slargest);
    }
}
