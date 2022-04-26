import java.util.Scanner;

public class Algo1_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //数列の個数Nを入力
        int N = scan.nextInt();
        //数列を入力して、キャスト
        String[] A = scan.nextLine().split(" ");
        int[] A1 = new int[A.length];
        for(int i = 0; i < A1.length; ++i){
            A1[i] = Integer.parseInt(A[i]);
        }
        //数列の個数N1を入力
        int N1 = scan.nextInt();
        //数列を入力し、キャスト
        String[] B = scan.nextLine().split(" ");
        int[] B1 = new int[B.length];
        for(int i = 0; i < B1.length; ++i){
            B1[i] = Integer.parseInt(B[i]);
        }
        System.out.println(search(N, A1, N1, B1));
    }

public static int search(int N, int[] S, int q, int[] T){
    int count = 0;
    for(int i = 0; i < T.length; i++){
        for(int j = 0; j < S.length; j++){
            if(T[i] == S[j]){
                count++;
            }
        }
    }
    return count;
}
}
