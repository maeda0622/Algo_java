import java.util.*;

public class AC_C{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] X = new int[N];
        for(int i=0; i < N; i++){
            A[i] = scan.nextInt();
        }
        for(int i=0; i < N; i++){
            B[i] = scan.nextInt();
        }

        for(int i=0; i < N; i++){
            if(Math.abs(A[i+1] - A[i]) <= K || Math.abs(B[i+1] - B[i]) <= K){
                X[i] = A[i];
            }

            if(Math.abs(A[i+1] - B[i]) <= K || Math.abs(A[i+1] - B[i]) <= K){
                X[i] = B[i];
            }
        }
    }
}