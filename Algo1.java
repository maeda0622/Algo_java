//線形探索

public class Algo1 {
    public static void main(String[] args){
        int[] data = {1,24,35,34,14,16,51,312,1234,5431};
        System.out.println(search(data, 51));
    }

    public static int search(int[] data, int want){
        int ret = -1;
        for(int i = 0; i < data.length; i++){
            if(want == data[i]){
                ret = i +1;
                System.out.println(want);
            }
        }
        return ret;
    }
}
