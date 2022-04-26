import java.util.*;

public class AtCoder_2_2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++){
            list[i] = scan.nextInt();
        }
        
        Arrays.sort(list);

        int count=0;
        for(int i=0; i < list.length-1; i++){
            if(list[0] != 0 || list[0] < 0){
                System.out.println("0");
                break;
            }
            if(list[i] == list[i+1]){
                
                continue;
            }
            else if(list[i]+1 != list[i+1]){
                System.out.println(list[i]+1);
                break;
            }
            count++;
        }
        if(count == list.length -1){
            System.out.println(list[count] + 1);
        }
    }
}
