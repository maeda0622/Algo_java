import java.util.*;

public class Code_E {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        ArrayList<Integer> C = new ArrayList<Integer>();
        ArrayList<Integer> D = new ArrayList<Integer>();
        int flag=0;
        ArrayList<Integer> regist = new ArrayList<Integer>();

        for(int i=0; i < N; i++){
            A.add(scan.nextInt());
        }
        for(int i=0;i < N+M; i++){
            B.add(scan.nextInt());
        }

        ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(int i=0; i < N; i++){
            for(int j=0; j < M; j++){
                if(A.get(i) <= C.get(j) && B.get(i) <= D.get(j)){
                    temp.add(C.get(j));
                    temp.add(D.get(j));
                    list1.add(temp);
                    flag++;
                    regist.add(j);
                }
            }
            if(flag == 1){
                C.remove(C.get(j));
                D.remove(D.get(j));
            }
        }
    }
}
