import java.util.*;

public class Code_3_1_2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        ArrayList<Integer> A = new ArrayList<Integer>(); //クラス型のint
        ArrayList<Integer> B = new ArrayList<Integer>();

        for(int i=0; i < N; i++){
            A.add(scan.nextInt());
        }

        for(int i=0; i < N; i++){
            B.add(scan.nextInt());
        }

        HashSet<Integer> set = new HashSet<Integer>();

        set.add(A.get(0));
        set.add(B.get(0));

        for(int i=0; i < N; i++){
            HashSet<Integer> temp = new HashSet<Integer>();

            for(int j : set){
                
                if(Math.abs(j - A.get(i)) <= K){
                    temp.add(A.get(i));
                }

                if(Math.abs(j - B.get(i)) <= K){
                    temp.add(B.get(i));
                }
            }

            set = temp;

            if(set.size() == 0){
                System.out.println("NO");
                return; 
            }
        }

        System.out.println("Yes");

    }
}
