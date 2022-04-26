import java.util.*;

public class Code3_7_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] H = new int[n];
        for(int i=0; i < n; i++){
            H[i] = scan.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = 0;
        for(int i = 1; i < n; i++){

            if(i == 1){
                dp[i] = Math.abs(H[i-1] - H[i]);
            }

            if(i >= 2){
                int v1 = dp[i-1] + Math.abs(H[i-1] - H[i]);
                int v2 = dp[i-2] + Math.abs(H[i-2] - H[i]);
                dp[i] = Math.min(v1, v2);
            }
        }

        System.out.println(dp[n-1]);
    }    
}
