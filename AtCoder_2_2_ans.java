import java.util.*;

public class AtCoder_2_2_ans {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++){
            list[i] = scan.nextInt();
        }

        Arrays.sort(list);

        for(int i=0, j=0; i < list.length-1; i++){
            
            if(list[0] < 0 || list[0] != 0){
                System.out.println(i);
                break;
            }

            if(list[i] == list[i+1]){
                continue;
            }
            if(j != list[i]){
                System.out.println(j);
            }
            j++;
        }
    }
}
