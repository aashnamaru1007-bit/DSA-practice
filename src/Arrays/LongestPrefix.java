package Arrays;
import java.util.*;

public class LongestPrefix {
    public static String longestPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int flag;
        String res = "";
        int i;
        for (i = 0; i < strs[0].length(); i++) {
            flag=0;

            for (int j = 1; j < strs.length; j++) {
                if ( i >= strs[j].length() ||strs[j].charAt(i) != strs[0].charAt(i)) {
                    flag = 1;
                   // return res;
                    return strs[0].substring(0,i);
                }
           // }
           // if (flag == 0) {
               // res = res + strs[0].charAt(i);
           // }
            //else{
             //   return res;
           // }
        }}
        return strs[0].substring(0,i);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String[] strs = new String[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            strs[i] = s.nextLine();
        }
        String ans = longestPrefix(strs);
        System.out.println(ans);
    }
}

