import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] pointsStr = scan.nextLine().split(" ");
        int[] points = new int[pointsStr.length];

        for(int i = 0; i < points.length; ++i) {
            points[i] = Integer.parseInt(pointsStr[i]);
            System.out.println(points[i]);
        }
    }
}
