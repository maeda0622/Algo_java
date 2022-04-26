import java.util.Scanner;

public class Code_3_6_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        if(A != C){
            if(A < C){
                System.out.println("Takahashi");
            }
            else System.out.println("Aoki");
        }
        if(A == C){
            if(B <= D){
                System.out.println("Takahashi");
            }
            else System.out.println("Aoki");
        }
    }
}
